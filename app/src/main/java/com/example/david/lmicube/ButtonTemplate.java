package com.example.david.lmicube;

/**
 * Created by David on 2/19/2018.
 */

public class ButtonTemplate {

    // Back Button Vertexes
    public float[] getBackButVertex() {
        float squareCoords[] = {
                1.71131f, 0.95429f, 0.0f,   // top left
                1.71131f, 0.52571f, 0.0f,   // bottom left
                1.28274f, 0.52571f, 0.0f,   // bottom right
                1.28274f, 0.95429f, 0.0f }; // top right
        return squareCoords;
    }

    // Undo Button Vertexes
    public float[] getUndoButVertex() {
        float squareCoords[] = {
                1.71131f, 0.45766f, 0.0f,   // top left
                1.71131f, 0.02909f, 0.0f,   // bottom left
                1.28274f, 0.02909f, 0.0f,   // bottom right
                1.28274f, 0.45766f, 0.0f }; // top right
        return squareCoords;
    }

    // Reset Button Vertexes
    public float[] getResetButVertex() {
        float squareCoords[] = {
                1.71131f, -0.0390f, 0.0f,   // top left
                1.71131f, -0.4676f, 0.0f,   // bottom left
                1.28274f, -0.4676f, 0.0f,   // bottom right
                1.28274f, -0.0390f, 0.0f }; // top right
        return squareCoords;
    }

    // Shuffle Button Vertexes
    public float[] getShuffleButVertex() {
        float squareCoords[] = {
                1.71131f, -0.5357f, 0.0f,   // top left
                1.71131f, -0.9642f, 0.0f,   // bottom left
                1.28274f, -0.9642f, 0.0f,   // bottom right
                1.28274f, -0.5357f, 0.0f }; // top right
        return squareCoords;
    }

    // Outline Front Vertexes
    public float[] getOutlineFVertex() {
        float squareCoords[] = {
                -0.9429f, -0.2857f, 0.0f,   // top left
                -1.0000f, -0.7371f, 0.0f,   // bottom left
                -1.3429f, -0.9543f, 0.0f,   // bottom right
                -1.3429f, -0.4057f, 0.0f }; // top right
        return squareCoords;
    }

    // Outline Up Vertexes
    public float[] getOutlineUVertex() {
        float squareCoords[] = {
                -1.3029f, -0.2057f, 0.0f,   // top left
                -0.9429f, -0.2857f, 0.0f,   // bottom left
                -1.3429f, -0.4057f, 0.0f,   // bottom right
                -1.6857f, -0.2800f, 0.0f }; // top right
        return squareCoords;
    }

    // Outline Right Vertexes
    public float[] getOutlineRVertex() {
        float squareCoords[] = {
                -1.3429f, -0.4057f, 0.0f,   // top left
                -1.3429f, -0.9543f, 0.0f,   // bottom left
                -1.6286f, -0.7143f, 0.0f,   // bottom right
                -1.6857f, -0.2800f, 0.0f }; // top right
        return squareCoords;
    }

}
