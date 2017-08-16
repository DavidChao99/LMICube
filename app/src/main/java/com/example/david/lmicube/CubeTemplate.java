package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

public class CubeTemplate {

    // x y z
    // x: 1 -> -1
    // y: 1
    //    |
    //    v
    //   -1
    //z: ?

    // T-> Top Row
    // M-> Middle Row
    // B-> Bottom Row
    // L-> Left Column
    // C-> Center Column
    // R-> Right Column

    // Top Faces Vertexes
    public float[] getTopTLVertex() {
        float squareCoords[] = {
                0.02857f,  0.85714f, 0.0f,   // top left
                0.23125f,  0.80960f, 0.0f,   // bottom left
                0.00417f,  0.76485f, 0.0f,   // bottom right
                -0.198000f,  0.81520f, 0.0f }; // top right
        return squareCoords;
    }

    public float[] getTopTCVertex() {
        float squareCoords[] = {
                -0.23125f,   0.81240f, 0.0f,   // top
                -0.03183f,   0.75926f, 0.0f,   // left
                -0.29771f,   0.70611f, 0.0f,   // bottom
                -0.49160f,   0.76766f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopTRVertex() {
        float squareCoords[] = {
                -0.52760f,   0.75942f, 0.0f,   // top
                -0.33926f,   0.70051f, 0.0f,   // left
                -0.65771f,   0.63902f, 0.0f,   // bottom
                -0.83497f,   0.70611f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopMLVertex() {
        float squareCoords[] = {
                0.26446f,  0.80400f, 0.0f,   // top
                0.50263f,  0.75086f, 0.0f,   // left
                0.27834f,  0.69771f, 0.0f,   // bottom
                0.03463f,  0.75926f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopMCVertex() {
        float squareCoords[] = {
                -0.0014f,  0.75086f, 0.0f,   // top
                0.23680f,  0.68937f, 0.0f,   // left
                -0.0346f,  0.62783f, 0.0f,   // bottom
                -0.2728f,  0.69771f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopMRVertex() {
        float squareCoords[] = {
                -0.3115f,  0.68937f, 0.0f,   // top
                -0.0789f,  0.61663f, 0.0f,   // left
                -0.4057f,  0.54114f, 0.0f,   // bottom
                -0.6273f,  0.62783f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopBLVertex() {
        float squareCoords[] = {
                0.54143f,  0.74526f, 0.0f,   // top
                0.83222f,  0.68097f, 0.0f,   // left
                0.60789f,  0.61663f, 0.0f,   // bottom
                0.31154f,  0.68937f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopBCVertex() {
        float squareCoords[] = {
                0.27834f,  0.68097f, 0.0f,   // top
                0.57189f,  0.60543f, 0.0f,   // left
                0.29497f,  0.52714f, 0.0f,   // bottom
                0.00417f,  0.61663f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getTopBRVertex() {
        float squareCoords[] = {
                -0.0402f,  0.60543f, 0.0f,   // top
                0.25063f,  0.51314f, 0.0f,   // left
                -0.0900f,  0.41806f, 0.0f,   // bottom
                -0.3725f,  0.52714f, 0.0f }; // right
        return squareCoords;
    }

    // Right Faces Vertexes
    public float[] getRightTLVertex() {
        float squareCoords[] = {
                -0.1150f,  0.38171f, 0.0f,   // top
                -0.1066f,  -0.0601f, 0.0f,   // left
                -0.3697f,  0.08811f, 0.0f,   // bottom
                -0.3946f,  0.49080f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightTCVertex() {
        float squareCoords[] = {
                -0.4306f,  0.50760f, 0.0f,   // top
                -0.4030f,  0.10766f, 0.0f,   // left
                -0.6134f,  0.22794f, 0.0f,   // bottom
                -0.6494f,  0.59429f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightTRVertex() {
        float squareCoords[] = {
                -0.6771f,  0.60823f, 0.0f,   // top
                -0.6383f,  0.24469f, 0.0f,   // left
                -0.8129f,  0.33977f, 0.0f,   // bottom
                -0.8571f,  0.68097f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightMLVertex() {
        float squareCoords[] = {
                -0.1066f,  -0.1161f, 0.0f,   // top
                -0.1011f,  -0.4852f, 0.0f,   // left
                -0.3475f,  -0.3090f, 0.0f,   // bottom
                -0.3670f,  0.03777f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightMCVertex() {
        float squareCoords[] = {
                -0.4001f,  0.05731f, 0.0f,   // top
                -0.3753f,  -0.2894f, 0.0f,   // left
                -0.5747f,  -0.1412f, 0.0f,   // bottom
                -0.6076f,  0.18040f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightMRVertex() {
        float squareCoords[] = {
                -0.6328f,  0.19714f, 0.0f,   // top
                -0.5996f,  -0.1217f, 0.0f,   // left
                -0.7658f,  -0.0014f, 0.0f,   // bottom
                -0.8073f,  0.29782f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightBLVertex() {
        float squareCoords[] = {
                -0.1011f,  -0.5327f, 0.0f,   // top
                -0.0928f,  -0.8543f, 0.0f,   // left
                -0.3254f,  -0.6558f, 0.0f,   // bottom
                -0.3448f,  -0.3538f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightBCVertex() {
        float squareCoords[] = {
                -0.3725f,  -0.3286f, 0.0f,   // top
                -0.3531f,  -0.6306f, 0.0f,   // left
                -0.5442f,  -0.4656f, 0.0f,   // bottom
                -0.5719f,  -0.1832f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getRightBRVertex() {
        float squareCoords[] = {
                -0.5941f,  -0.1636f, 0.0f,   // top
                -0.5663f,  -0.4461f, 0.0f,   // left
                -0.7270f,  -0.3118f, 0.0f,   // bottom
                -0.7602f,  -0.0434f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftTLVertex() {
        float squareCoords[] = {
                0.85714f,  0.65297f, 0.0f,   // top
                0.80731f,  0.30343f, 0.0f,   // left
                0.58851f,  0.20834f, 0.0f,   // bottom
                0.62726f,  0.58309f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftTCVertex() {
        float squareCoords[] = {
                0.59126f,  0.57469f, 0.0f,   // top
                0.55526f,  0.19714f, 0.0f,   // left
                0.29497f,  0.08811f, 0.0f,   // bottom
                0.31434f,  0.49360f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftTRVertex() {
        float squareCoords[] = {
                0.27280f,  0.47960f, 0.0f,   // top
                0.25617f,  0.07131f, 0.0f,   // left
                -0.0623f,  -0.0601f, 0.0f,   // bottom
                -0.0678f,  0.37891f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftMLVertex() {
        float squareCoords[] = {
                0.80177f,  0.25589f, 0.0f,   // top
                0.75743f,  -0.0489f, 0.0f,   // left
                0.54971f,  -0.1636f, 0.0f,   // bottom
                0.58017f,  0.16360f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftMCVertex() {
        float squareCoords[] = {
                0.54971f,  0.14960f, 0.0f,   // top
                0.51926f,  -0.1776f, 0.0f,   // left
                0.27280f,  -0.3090f, 0.0f,   // bottom
                0.29217f,  0.03497f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftMRVertex() {
        float squareCoords[] = {
                0.25063f,  0.02097f, 0.0f,   // top
                0.23400f,  -0.3314f, 0.0f,   // left
                -0.0595f,  -0.4880f, 0.0f,   // bottom
                -0.0651f,  -0.1161f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftBLVertex() {
        float squareCoords[] = {
                0.75189f,  -0.0909f, 0.0f,   // top
                0.71314f,  -0.3650f, 0.0f,   // left
                0.51651f,  -0.4908f, 0.0f,   // bottom
                0.54417f,  -0.2055f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftBCVertex() {
        float squareCoords[] = {
                0.51371f,  -0.2195f, 0.0f,   // top
                0.48606f,  -0.5076f, 0.0f,   // left
                0.25343f,  -0.6558f, 0.0f,   // bottom
                0.27000f,  -0.3538f, 0.0f }; // right
        return squareCoords;
    }

    public float[] getLeftBRVertex() {
        float squareCoords[] = {
                0.23126f,  -0.3761f, 0.0f,   // top
                0.21743f,  -0.6782f, 0.0f,   // left
                -0.0568f,  -0.8571f, 0.0f,   // bottom
                -0.0595f,  -0.5355f, 0.0f }; // right
        return squareCoords;
    }

}





















