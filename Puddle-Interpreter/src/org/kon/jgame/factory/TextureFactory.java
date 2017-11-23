package org.kon.jgame.factory;

import org.kon.jgame.model.graphics.Texture;

import java.awt.*;

public class TextureFactory {
    private TextureFactory(){}

    public static Texture createVerticalGradient(int width, int height, Color start, Color end){
        Texture result = new Texture(width, height);

        for(int y = 0; y < height; y++){
            Color c = colorInterpolation(start, end, (float)y/(float)height);
            for(int x = 0; x < width; x++){
                result.setPixel(x, y, c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha());
            }
        }

        return result;

    }

    public static Texture createHorizontalGradient(int width, int height, Color start, Color end){
        Texture result = new Texture(width, height);

        for(int x = 0; x < width; x++){
            Color c = colorInterpolation(start, end, (float)x/(float)width);
            for(int y = 0; y < height; y++){
                result.setPixel(x, y, c.getRed(), c.getGreen(), c.getBlue(), c.getAlpha());
            }
        }

        return result;

    }

    private static Color colorInterpolation(Color start, Color end, float normalDistance){
        return new Color(
                (float) sinInterpolation(start.getRed(),end.getRed(),normalDistance) / 255,
                (float) sinInterpolation(start.getGreen(),end.getGreen(),normalDistance) / 255,
                (float) sinInterpolation(start.getBlue(),end.getBlue(),normalDistance) / 255,
                1);
    }

    private static double sinInterpolation(float start, float end, float normalizedValue){
        return start+(end-start)* (1 - Math.cos(normalizedValue * Math.PI)) / 2;
    }
}
