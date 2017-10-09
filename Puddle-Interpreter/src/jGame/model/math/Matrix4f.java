package jGame.model.math;

import static java.lang.Math.*;

public class Matrix4f {

	private static int SIZE = 4;
	public float[] matrix = new float[SIZE * SIZE];
	
	
	public static Matrix4f identity() {
		Matrix4f result = new Matrix4f();
		for (int i = 0; i < SIZE; i++) {
			result.matrix[i] = 0.0f;
		}
		// [row + col * max col]
		for (int i = 0; i < SIZE; i++){
		result.matrix[i + i * SIZE] = 1.0f;
		}
		return result;
	}
	
	public Matrix4f add(Matrix4f matrix){
		Matrix4f result = new Matrix4f();
		
		for(int col = 0; col < SIZE; col++)
			for(int row = 0; row < SIZE; row++){
				result.matrix[row + col * SIZE] =
						this.matrix[row + col * SIZE] +
						matrix.matrix[row + col * SIZE];
			}
		return result;
	}
	
	public Matrix4f multiply(Matrix4f matrix){
		Matrix4f result = new Matrix4f();
		
		for(int col = 0; col < SIZE; col++)
			for(int row = 0; row < SIZE; row++){
				float sum = 0.0f;
				for(int cur = 0; cur < SIZE; cur++)
					sum += this.matrix[cur + col * SIZE] * 
						   matrix.matrix[row + cur * SIZE];
				result.matrix[row + col * SIZE] = sum;
			}
		return result;
	}
	
	/* [ x 0 0 0 ]
	 * [ 0 y 0 0 ]
	 * [ 0 0 z 0 ]
	 * [ 0 0 0 1 ]
	 */// resizes matrix
	public static Matrix4f scale(Vector3f vector){
		Matrix4f result = identity();
		
		result.matrix[0 + 0 * SIZE] = vector.getX();
		result.matrix[1 + 1 * SIZE] = vector.getY();
		result.matrix[2 + 2 * SIZE] = vector.getZ();
		
		return result;
	}
	
	/* [ 1 0 0 x ]
	 * [ 0 1 0 y ]
	 * [ 0 0 1 z ]
	 * [ 0 0 0 1 ]
	 */// stores vector graphic location in cur matrix
	public static Matrix4f translate(Vector3f vector){
		Matrix4f result = identity();
		
		result.matrix[0 + 3 * SIZE] = vector.getX();
		result.matrix[1 + 3 * SIZE] = vector.getY();
		result.matrix[2 + 3 * SIZE] = vector.getZ();
		
		return result;
	}
	
	public static Matrix4f translate(Vector3f position, Vector3f scale){
		Matrix4f result = identity();
		
		result.matrix[0 + 3 * SIZE] = position.getX();
		result.matrix[1 + 3 * SIZE] = position.getY();
		result.matrix[2 + 3 * SIZE] = position.getZ();
		

		result.matrix[0 + 0 * SIZE] = scale.getX();
		result.matrix[1 + 1 * SIZE] = scale.getY();
		result.matrix[2 + 2 * SIZE] = scale.getZ();
		
		return result;
	}
	
	/*  c mean cos(x), s means sin(x) where x is an angle
	 * [ c -s 0 0 ]
	 * [ s  c 0 0 ]
	 * [ 0  0 1 0 ]
	 * [ 0  0 0 1 ]
	 */// rotates sprite objects
	public static Matrix4f rotate(float angle){
		Matrix4f result = identity();
		float r = (float) toRadians(angle);
		float sin = (float) sin(r);
		float cos = (float) cos(r);
		
		result.matrix[0 + 0 * SIZE] = cos;
		result.matrix[1 + 0 * SIZE] = sin;

		result.matrix[0 + 1 * SIZE] = -sin;
		result.matrix[1 + 1 * SIZE] = cos;
		
		return result;
	}
	
	/*
	 // 3D implementation
	public static matrix4f rotate(float angle, float x, float y, float z){
	 // floats x y and z are boolean to indicate what axis should rotation be implemented
		Matrix4f result = identity();

		float r = (float) toRadians(angle);
		float cos = (float) cos(r);
		float sin = (float) sin(r);
		float omc = 1.0f - cos;

		result.matrix4f[0 + 0 * 4] = x * omc + cos;
		result.matrix4f[1 + 0 * 4] = y * x * omc + z * sin;
		result.matrix4f[2 + 0 * 4] = x * z * omc - y * sin;

		result.matrix4f[0 + 1 * 4] = x * y * omc - z * sin;
		result.matrix4f[1 + 1 * 4] = y * omc + cos;
		result.matrix4f[2 + 1 * 4] = y * z * omc + x * sin;

		result.matrix4f[0 + 2 * 4] = x * z * omc + y * sin;
		result.matrix4f[1 + 2 * 4] = y * z * omc - x * sin;
		result.matrix4f[2 + 2 * 4] = z * omc + cos;

		return result;
		}
	 */
	
	/* Implementation 2D
	 * right left top bottom => window
	 * near far => min max rendering field
	 * Matrix:
	 * [ 2/(r-l)       0        0 (l+r)/(l-r) ]
	 * [       0  2/(t-b)       0 (b+t)/(b-t) ]
	 * [       0        0 2/(n-f) (n+f)/(f-n) ]
	 * [       0        0       0           1 ]
	 */
	public static Matrix4f orthographic(
			float left, float right, float bottom, 
			float top, float near, float far){
		Matrix4f result = identity();
		
		result.matrix[0 + 0 * SIZE] = 2.0f / (right - left);
		result.matrix[1 + 1 * SIZE] = 2.0f / (top - bottom);
		result.matrix[2 + 2 * SIZE] = 2.0f / (far - near);
		
		result.matrix[0 + 3 * SIZE] = (left + right) / (left - right);
		result.matrix[1 + 3 * SIZE] = (bottom + top) / (bottom - top);
		result.matrix[2 + 3 * SIZE] = (near + far) / (far - near);
		
		return result;
	}
	
	public static Matrix4f perspective(float near, float far, float FoV, float aspect){
		float y2 = near * (float)Math.tan(Math.toRadians(FoV/2));
		float y1 = -y2;
		float x1 = y1 * aspect;
		float x2 = y2 * aspect;
		return frustrum(x1, x2, y1, y2, near, far);
	}
	
	public static Matrix4f frustrum(float left, float right, float bottom, float top, float near, float far){
		Matrix4f cameraMat = new Matrix4f();
		
		cameraMat.matrix[0 + 0 * SIZE] =  (2 * near) / (right - left);
		cameraMat.matrix[1 + 1 * SIZE] =  (2 * near) / (top - bottom);
		cameraMat.matrix[3 + 2 * SIZE] =  (2 * near * far) / (near - far);
		cameraMat.matrix[2 + 2 * SIZE] =  (near + far) / ( near - far);
		cameraMat.matrix[3 + 3 * SIZE] = 0.0f;
		cameraMat.matrix[2 + 3 * SIZE] = -1.0f;
		
		cameraMat.matrix[0 + 2 * SIZE] = (right + left) / (right - left);
		cameraMat.matrix[1 + 2 * SIZE] = (top + bottom) / (top - bottom);
		cameraMat.matrix[2 + 2 * SIZE] = (near + far) / (near - far);
		
		return cameraMat;
	}
	
	
	// rotation operations

	public static Matrix4f rotateZ(float angle){
		Matrix4f result = identity();
		float r = (float) Math.toRadians(angle);
		float cos = (float) Math.cos(r);
		float sin = (float) Math.sin(r);
		
		result.matrix[0 + 0 * 4] = cos;
		result.matrix[1 + 0 * 4] = sin;
		result.matrix[0 + 1 * 4] = -sin;
		result.matrix[1 + 1 * 4] = cos;		
		return result;
	}
	
	public static Matrix4f rotateY(float angle){
		Matrix4f result = identity();
		float r = (float) Math.toRadians(angle);
		float cos = (float) Math.cos(r);
		float sin = (float) Math.sin(r);
		
		result.matrix[0 + 0 * 4] = cos;
		result.matrix[2 + 0 * 4] = -sin;
		result.matrix[0 + 2 * 4] = sin;
		result.matrix[2 + 2 * 4] = cos;
		
		return result;
		
	}
	
	public static Matrix4f rotateX(float angle){
		Matrix4f result = identity();
		float r = (float) Math.toRadians(angle);
		float cos = (float) Math.cos(r);
		float sin = (float) Math.sin(r);
		
		result.matrix[1 + 1 * 4] = cos;
		result.matrix[1 + 2 * 4] = -sin;
		result.matrix[2 + 1 * 4] = sin;
		result.matrix[2 + 2 * 4] = cos;
		
		return result;
		
	}
}
