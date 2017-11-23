package org.kon.jgame.model.math;

public class MathUtils {

    private MathUtils(){}

    public static int clampInt(int value, int start, int end){
        return Math.max(Math.min(value, end), start);
    }
    public static float clampFloat(float value, float start, float end){
        return Math.max(Math.min(value, end), start);
    }

}
