package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

public class ColorTemplate {

    public float[] getRed() {
        float color[] = { 1.0f, 0.4f, 0.4f, 1.0f };
        return color;
    }

    public float[] getGreen() {
        float color[] = { 0.0f, 0.8f, 0.0f, 1.0f };
        return color;
    }

    public float[] getOrange() {
        float color[] = { 1.0f, 0.5f, 0.0f, 1.0f };
        return color;
    }

    public float[] getBlue() {
        float color[] = { 0.0f, 0.0f, 1.0f, 1.0f };
        return color;
    }

    public float[] getYellow() {
        float color[] = { 1.0f, 1.0f, 0.2f, 1.0f };
        return color;
    }

    public float[] getWhite() {
        float color[] = { 1.0f, 1.0f, 1.0f, 1.0f };
        return color;
    }

    public float[] getColor(int colorValue) {
        switch (colorValue) {
            case 0:
                return getWhite();

            case 1:
                return getGreen();

            case 2:
                return getBlue();

            case 3:
                return getYellow();

            case 4:
                return getRed();

            case 5:
                return getOrange();
        };

        // If requested is not available just send back white
        return getWhite();
    }



}
