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

}
