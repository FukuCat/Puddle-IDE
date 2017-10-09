package jGame.model.graphics;

import jGame.model.game.GameObject;
import jGame.model.input.Input;
import jGame.model.physics.Physics3D;
import jGame.view.Renderer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;

public class Texture extends Physics3D implements GameObject{
	
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
	
	public Texture(String path) {
		super();
		setTransposed(false);
		load(path);
	}
	
	public void setAll(int[] pixelMap, int width, int height){
		setPixelMap(pixelMap);
		setWidth(width);
		setHeight(height);
	}
	
	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void input(Input input, long deltaTime, Camera camera) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logic(long deltaTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Renderer renderer, Camera camera) {
		renderer.getRendIn().drawImage(getImageFromArray(pixelMap, width, height), 
				(int)(position.getX()), 
				(int)(position.getY()), 
				null);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
	public Image getImageFromArray(int[] pixelMap, int width, int height) {
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
	
	private void load(String path) {
		BufferedImage image = null;
		try {
			image = ImageIO.read(new FileInputStream(path));
			setWidth(image.getWidth());
			setHeight(image.getHeight());
			setPixelMap(new int[width * height]);
			image.getRGB(0, 0, width, height, pixelMap, 0, width);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int getAlpha(int x, int y){
		return (pixelMap[x + y * width] & 0xff000000) >> 24;
	}
	
	public void setAlpha(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width] & 0x00ffffff) |  value << 24;
	}
	
	public int getRed(int x, int y){
		return (pixelMap[x + y * width] & 0xff0000) >> 16;
	}
	
	public void setRed(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width] & 0x00ffff) |  value << 16;
	}
	
	public int getGreen(int x, int y){
		return (pixelMap[x + y * width] & 0xff00) >> 8;
	}
	
	public void setGreen(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width] & 0x00ff) |  value << 8;
	}
	
	public int getBlue(int x, int y){
		return (pixelMap[x + y * width] & 0xff);
	}
	
	public void setBlue(int x, int y, int value){
		pixelMap[x + y * width] = (pixelMap[x + y * width] & 0xff) |  value ;
	}
	
	public int getPixel(int x, int y){
		return pixelMap[x + y * width];
	}
	
	public void setPixel(int x, int y, int value){
		pixelMap[x + y * width] = value ;
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
