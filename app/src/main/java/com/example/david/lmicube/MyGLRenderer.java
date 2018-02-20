package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MyGLRenderer implements GLSurfaceView.Renderer {

    private Square   mSquareTopTL;
    private Square   mSquareTopTC;
    private Square   mSquareTopTR;
    private Square   mSquareTopML;
    private Square   mSquareTopMC;
    private Square   mSquareTopMR;
    private Square   mSquareTopBL;
    private Square   mSquareTopBC;
    private Square   mSquareTopBR;
    private Square   mSquareRightTL;
    private Square   mSquareRightTC;
    private Square   mSquareRightTR;
    private Square   mSquareRightML;
    private Square   mSquareRightMC;
    private Square   mSquareRightMR;
    private Square   mSquareRightBL;
    private Square   mSquareRightBC;
    private Square   mSquareRightBR;
    private Square   mSquareLeftTL;
    private Square   mSquareLeftTC;
    private Square   mSquareLeftTR;
    private Square   mSquareLeftML;
    private Square   mSquareLeftMC;
    private Square   mSquareLeftMR;
    private Square   mSquareLeftBL;
    private Square   mSquareLeftBC;
    private Square   mSquareLeftBR;
    private Square   mSquareBackBut;
    private Square   mSquareUndoBut;
    private Square   mSquareResetBut;
    private Square   mSquareShuffleBut;

    private RubiksCube mCube;

    private CubeTemplate mTemplate;
    private ButtonTemplate mBT;
    private ColorTemplate mCT;

    public volatile float mAngle;

    public float getAngle() {
        return mAngle;
    }

    public void setAngle(float angle) {
        mAngle = angle;
    }

    public void onSurfaceCreated(GL10 unused, EGLConfig config) {
        // Set the background frame color
        GLES20.glClearColor(0.45f, 0.85f, 1.0f, 1.0f);

        // Initialize Rubik's Cube
        mCube = new RubiksCube();

        // Initialize Cube Template
        mTemplate = new CubeTemplate();
        // Initialize Button Template
        mBT = new ButtonTemplate();
        // Initialize Color Template
        mCT = new ColorTemplate();

        // Initialize a square
        mSquareTopTL = new Square(mTemplate.getTopTLVertex());
        mSquareTopTC = new Square(mTemplate.getTopTCVertex());
        mSquareTopTR = new Square(mTemplate.getTopTRVertex());
        mSquareTopML = new Square(mTemplate.getTopMLVertex());
        mSquareTopMC = new Square(mTemplate.getTopMCVertex());
        mSquareTopMR = new Square(mTemplate.getTopMRVertex());
        mSquareTopBL = new Square(mTemplate.getTopBLVertex());
        mSquareTopBC = new Square(mTemplate.getTopBCVertex());
        mSquareTopBR = new Square(mTemplate.getTopBRVertex());
        mSquareRightTL = new Square(mTemplate.getRightTLVertex());
        mSquareRightTC = new Square(mTemplate.getRightTCVertex());
        mSquareRightTR = new Square(mTemplate.getRightTRVertex());
        mSquareRightML = new Square(mTemplate.getRightMLVertex());
        mSquareRightMC = new Square(mTemplate.getRightMCVertex());
        mSquareRightMR = new Square(mTemplate.getRightMRVertex());
        mSquareRightBL = new Square(mTemplate.getRightBLVertex());
        mSquareRightBC = new Square(mTemplate.getRightBCVertex());
        mSquareRightBR = new Square(mTemplate.getRightBRVertex());
        mSquareLeftTL = new Square(mTemplate.getLeftTLVertex());
        mSquareLeftTC = new Square(mTemplate.getLeftTCVertex());
        mSquareLeftTR = new Square(mTemplate.getLeftTRVertex());
        mSquareLeftML = new Square(mTemplate.getLeftMLVertex());
        mSquareLeftMC = new Square(mTemplate.getLeftMCVertex());
        mSquareLeftMR = new Square(mTemplate.getLeftMRVertex());
        mSquareLeftBL = new Square(mTemplate.getLeftBLVertex());
        mSquareLeftBC = new Square(mTemplate.getLeftBCVertex());
        mSquareLeftBR = new Square(mTemplate.getLeftBRVertex());
        mSquareBackBut = new Square(mBT.getBackButVertex());
        mSquareUndoBut = new Square(mBT.getUndoButVertex());
        mSquareResetBut = new Square(mBT.getResetButVertex());
        mSquareShuffleBut = new Square(mBT.getShuffleButVertex());

    }

    private float[] mRotationMatrix = new float[16];

    public void onDrawFrame(GL10 unused) {
        float[] scratch = new float[16];

        // Redraw background color
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

        // Set the camera position (View matrix)
        Matrix.setLookAtM(mViewMatrix, 0, 0, 0, -3, 0f, 0f, 0f, 0f, 1.0f, 0.0f);

        // Calculate the projection and view transformation
        Matrix.multiplyMM(mMVPMatrix, 0, mProjectionMatrix, 0, mViewMatrix, 0);

        // Create a rotation transformation for the triangle
        Matrix.setRotateM(mRotationMatrix, 0, mAngle, 0, 0, -1.0f);

        // Combine the rotation matrix with the projection and camera view
        // Note that the mMVPMatrix factor *must be first* in order
        // for the matrix multiplication product to be correct.
        Matrix.multiplyMM(scratch, 0, mMVPMatrix, 0, mRotationMatrix, 0);

        // Draw Squares
        mSquareTopTL.draw(scratch, mCT.getColor(mCube.getCube(3,0)));
        mSquareTopTC.draw(scratch, mCT.getColor(mCube.getCube(3,1)));
        mSquareTopTR.draw(scratch, mCT.getColor(mCube.getCube(3,2)));
        mSquareTopML.draw(scratch, mCT.getColor(mCube.getCube(3,3)));
        mSquareTopMC.draw(scratch, mCT.getColor(mCube.getCube(3,4)));
        mSquareTopMR.draw(scratch, mCT.getColor(mCube.getCube(3,5)));
        mSquareTopBL.draw(scratch, mCT.getColor(mCube.getCube(3,6)));
        mSquareTopBC.draw(scratch, mCT.getColor(mCube.getCube(3,7)));
        mSquareTopBR.draw(scratch, mCT.getColor(mCube.getCube(3,8)));
        mSquareRightTL.draw(scratch, mCT.getColor(mCube.getCube(5,2)));
        mSquareRightTC.draw(scratch, mCT.getColor(mCube.getCube(5,5)));
        mSquareRightTR.draw(scratch, mCT.getColor(mCube.getCube(5,8)));
        mSquareRightML.draw(scratch, mCT.getColor(mCube.getCube(5,1)));
        mSquareRightMC.draw(scratch, mCT.getColor(mCube.getCube(5,4)));
        mSquareRightMR.draw(scratch, mCT.getColor(mCube.getCube(5,7)));
        mSquareRightBL.draw(scratch, mCT.getColor(mCube.getCube(5,0)));
        mSquareRightBC.draw(scratch, mCT.getColor(mCube.getCube(5,3)));
        mSquareRightBR.draw(scratch, mCT.getColor(mCube.getCube(5,6)));
        mSquareLeftTL.draw(scratch, mCT.getColor(mCube.getCube(1,0)));
        mSquareLeftTC.draw(scratch, mCT.getColor(mCube.getCube(1,1)));
        mSquareLeftTR.draw(scratch, mCT.getColor(mCube.getCube(1,2)));
        mSquareLeftML.draw(scratch, mCT.getColor(mCube.getCube(1,3)));
        mSquareLeftMC.draw(scratch, mCT.getColor(mCube.getCube(1,4)));
        mSquareLeftMR.draw(scratch, mCT.getColor(mCube.getCube(1,5)));
        mSquareLeftBL.draw(scratch, mCT.getColor(mCube.getCube(1,6)));
        mSquareLeftBC.draw(scratch, mCT.getColor(mCube.getCube(1,7)));
        mSquareLeftBR.draw(scratch, mCT.getColor(mCube.getCube(1,8)));
        mSquareBackBut.draw(scratch, mCT.getBlue());
        mSquareUndoBut.draw(scratch, mCT.getBlue());
        mSquareResetBut.draw(scratch, mCT.getBlue());
        mSquareShuffleBut.draw(scratch, mCT.getBlue());
    }


    // mMVPMatrix is an abbreviation for "Model View Projection Matrix"
    private final float[] mMVPMatrix = new float[16];
    private final float[] mProjectionMatrix = new float[16];
    private final float[] mViewMatrix = new float[16];

    @Override
    public void onSurfaceChanged(GL10 unused, int width, int height) {
        GLES20.glViewport(0, 0, width, height);

        float ratio = (float) width / height;

        // this projection matrix is applied to object coordinates
        // in the onDrawFrame() method
        Matrix.frustumM(mProjectionMatrix, 0, -ratio, ratio, -1, 1, 3, 7);
    }

    // Utility method to compile OpenGL Shading Language code prior to use
    public static int loadShader(int type, String shaderCode){

        // create a vertex shader type (GLES20.GL_VERTEX_SHADER)
        // or a fragment shader type (GLES20.GL_FRAGMENT_SHADER)
        int shader = GLES20.glCreateShader(type);

        // add the source code to the shader and compile it
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);

        return shader;
    }



}