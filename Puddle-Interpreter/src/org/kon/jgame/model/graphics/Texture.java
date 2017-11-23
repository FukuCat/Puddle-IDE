package org.kon.jgame.model.graphics;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Texture {
	
	private int width, height;
	private int[] pixelMap;
	private boolean isTransposed;
	
	public Texture(int width, int height){
		super();
		setTransposed(false);
		setPixelMap(new int[width * height]);
		setWidth(width);
		setHeight(height);
	}
	
	public Texture(int[] pixelMap, int width, int height){
		super();
		setTransposed(false);
		setPixelMap(pixelMap);
		setWidth(width);
		setHeight(height);
	}
	
	public Texture(String path) throws IOException {
		super();
		setTransposed(false);
		load(path);
	}
	
	public void setAll(int[] pixelMap, int width, int height){
		setPixelMap(pixelMap);
		setWidth(width);
		setHeight(height);
	}

	public static Image getImageFromArray(int[] pixelMap, int width, int height) {
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		image.setRGB(0, 0, width, height, pixelMap, 0, width);
		return image;
	}

	public Image getImage() {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        image.setRGB(0, 0, width, height, pixelMap, 0, width);
        return image;
    }
	
	public Texture clone(){
		int[] tempMap = new int[width * height];
		for(int i = 0; i < width * height; i++)
			tempMap[i] = pixelMap[i];
		return new Texture(tempMap, width, height);
	}
	
	public void transpose(){
		int[] tempMap = new int[width * height];
		int newWidth = height;
		int newHeight = width;
		isTransposed = ! isTransposed;
		for(int x = 0; x < width; x++)
			for(int y = 0; y < height; y++)
				tempMap[y + x * height] = getPixel(x, y);
		
		setWidth(newWidth);
		setHeight(newHeight);
		setPixelMap(tempMap);
		
	}
	
	private void load(String path) throws IOException{
		BufferedImage image = null;

		image = ImageIO.read(new FileInputStream(path));
		setWidth(image.getWidth());
		setHeight(image.getHeight());
		setPixelMap(new int[width * height]);
		image.getRGB(0, 0, width, height, pixelMap, 0, width);

	}
	
	public int getAlpha(int x, int y){
		return (pixelMap[x + y * width] & 0xff000000) >> 24;
	}
	
	public void setAlpha(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width]) |  value << 24;
	}
	
	public int getRed(int x, int y){
		return (pixelMap[x + y * width] & 0xff0000) >> 16;
	}
	
	public void setRed(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width]) |  value << 16;
	}
	
	public int getGreen(int x, int y){
		return (pixelMap[x + y * width] & 0xff00) >> 8;
	}
	
	public void setGreen(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width]) |  value << 8;
	}
	
	public int getBlue(int x, int y){
		return (pixelMap[x + y * width] & 0xff);
	}
	
	public void setBlue(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width]) |  value ;
	}
	
	public int getPixel(int x, int y){
		return pixelMap[x + y * width];
	}
	
	public void setPixel(int x, int y, int value){
        pixelMap[x + y * width] = value ;
    }

    public void setPixel(int x, int y, int r, int g, int b, int a){
        pixelMap[x + y * width] = (pixelMap[x + y * width]) |  a << 24;
        pixelMap[x + y * width] = (pixelMap[x + y * width]) |  r << 16;
        pixelMap[x + y * width] = (pixelMap[x + y * width]) |  g << 8;
        pixelMap[x + y * width] = (pixelMap[x + y * width]) |  b ;
    }


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int[] getPixelMap() {
		return pixelMap;
	}

	public void setPixelMap(int[] pixelMap) {
		this.pixelMap = pixelMap;
	}

	public boolean isTransposed() {
		return isTransposed;
	}

	public void setTransposed(boolean isTransposed) {
		this.isTransposed = isTransposed;
	}

	
}
