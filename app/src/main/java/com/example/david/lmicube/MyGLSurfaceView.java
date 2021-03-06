package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import android.view.MotionEvent;

import static java.lang.Math.abs;

/**
 * Created by David on 8/4/2017.
 */

class MyGLSurfaceView extends GLSurfaceView {

    private static final String TAG = "GLSuraceView";
    private final MyGLRenderer mRenderer;

    private int screenWidth;
    private int screenHeight;

    private RubiksCube mCube;

    public MyGLSurfaceView(Context context){
        super(context);

        // Initialize Rubik's Cube
        mCube = new RubiksCube();

        setEGLContextClientVersion(2);
        mRenderer = new MyGLRenderer();
        setRenderer(mRenderer);


        // Render the view only when there is a change in the drawing data.
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }

    private final float TOUCH_SCALE_FACTOR = 180.0f / 320;
    private float mPreviousX;
    private float mPreviousY;

    @Override
    public boolean onTouchEvent(MotionEvent e) {

        // Set Screen size
        screenWidth = getWidth();
        screenHeight = getHeight();
        String screenmsg = String.format("Screen X is %d and Screen Y is %d", screenWidth, screenHeight);
        Log.i(TAG, screenmsg);

        float x = e.getX();
        float y = e.getY();
//        String debugmsg = String.format("X is %f and Y is %f", x, y);
//        Log.i(TAG, debugmsg);

        switch (e.getAction()) {
            case MotionEvent.ACTION_UP:
                float dx = e.getX() - mPreviousX;
                float dy = e.getY() - mPreviousY;

                String upmsg = String.format("Up X is %f and Up Y is %f", e.getX(), e.getY());
                Log.i(TAG, upmsg);

                // If first point of contact originates on the cube
                if( .2787 * screenWidth < mPreviousX && mPreviousX < .7688 * screenWidth  && .2096 * screenHeight < mPreviousY && mPreviousY < .9366 * screenHeight) {
                    String xkcd = String.format("We are swiping my bois with dx = %f and dy = %f", dx, dy);
                    Log.i(TAG, xkcd);
                    // If it is swipe
                    if( abs(dx) > .10 * screenWidth || abs(dy) > .05 * screenHeight ) {
                        String hmm = String.format("We are swiping my bois with dx = %f and dy = %f", dx, dy);
                        Log.i(TAG, hmm);
                        // If swipe is vertical upwards
                        if (abs(dy) / abs(dx) > 3 && dy < 0) {
                            // If on Left Face Right Column -> R
                            if (mPreviousX > .4239 * screenWidth && mPreviousX < .5475 * screenWidth) {
                                mCube.Turn(1,true);
                            }
                            // If on Left Face Left Column -> L'
                            else if (mPreviousX > .2787 * screenWidth && mPreviousX < .3558 * screenWidth) {
                                mCube.Turn(4,true);
                            }
                            // If on Left Face Middle Column -> M'
                            else if (mPreviousX > .3558 * screenWidth && mPreviousX < .4239 * screenWidth) {
                                mCube.Turn(13,true);
                            }
                            // If on Right Face Left Column -> U'
                            else if (mPreviousX > .5525 * screenWidth && mPreviousX < .6275 * screenWidth) {
                                mCube.Turn(6,true);
                            }
                            // If on Right Face Right Column -> D
                            else if (mPreviousX > .6688 * screenWidth && mPreviousX < .7688 * screenWidth) {
                                mCube.Turn(9,true);
                            }
                            // If on Right Face Middle Column -> E
                            else if (mPreviousX > .6275 * screenWidth && mPreviousX < .6688 * screenWidth) {
                                mCube.Turn(15,true);
                            }
                        }
                        // If swipe is vertical downwards
                        else if (abs(dy) / abs(dx) > 3 && dy > 0) {
                            // If on Left Face Right Column -> R'
                            if (mPreviousX > .4239 * screenWidth && mPreviousX < .5475 * screenWidth) {
                                mCube.Turn(2,true);
                            }
                            // If on Left Face Left Column -> L
                            else if (mPreviousX > .2787 * screenWidth && mPreviousX < .3558 * screenWidth) {
                                mCube.Turn(3,true);
                            }
                            // If on Left Face Middle Column -> M
                            else if (mPreviousX > .3558 * screenWidth && mPreviousX < .4239 * screenWidth) {
                                mCube.Turn(14,true);
                            }
                            // If on Right Face Left Column -> U
                            else if (mPreviousX > .5525 * screenWidth && mPreviousX < .6275 * screenWidth) {
                                mCube.Turn(5,true);
                            }
                            // If on Right Face Right Column -> D'
                            else if (mPreviousX > .6688 * screenWidth && mPreviousX < .7688 * screenWidth) {
                                mCube.Turn(10,true);
                            }
                            // If on Right Face Middle Column -> E'
                            else if (mPreviousX > .6275 * screenWidth && mPreviousX < .6688 * screenWidth) {
                                mCube.Turn(16,true);
                            }
                        }

                        // If swipe is horizontal rightward
                        if (abs(dy) / abs(dx) < 2 && dx > 0) {
                            //If on Left Face
                            if (mPreviousX < .3758 * screenWidth) {
                                // If on Top Row do B'
                                if (mPreviousY < .3770 * screenHeight && mPreviousY > .2092 * screenHeight) {
                                    mCube.Turn(12,true);
                                }
                                // If on Bottom Row do F
                                else if (mPreviousY < .7443 * screenHeight && mPreviousY > .5553 * screenHeight) {
                                    mCube.Turn(7,true);
                                }
                                // If on Middle Row do S
                                else if (mPreviousY < .5553 * screenHeight && mPreviousY > .3770 * screenHeight) {
                                    mCube.Turn(17,true);
                                }
                            }
                            //If on Right Face
                            else if (mPreviousX > .3758 * screenWidth) {
                                // If on Top Row do B'
                                if (mPreviousY < .5179 * screenHeight && mPreviousY > .3253 * screenHeight) {
                                    mCube.Turn(12,true);
                                }
                                // If on Bottom Row do F
                                else if (mPreviousY < .9366 * screenHeight && mPreviousY > .7839 * screenHeight) {
                                    mCube.Turn(7,true);
                                }
                                // If on Middle Row do S
                                else if (mPreviousY < .7839 * screenHeight && mPreviousY > .5179 * screenHeight) {
                                    mCube.Turn(17,true);
                                }
                            }
                        }

                        // If swipe is horizontal leftward
                        else if (abs(dy) / abs(dx) < 2 && dx < 0) {
                            // If on Left Face
                            if (mPreviousX < .6688 * screenWidth) {
                                // If on Top Row do B
                                if (mPreviousY < .5179 * screenHeight && mPreviousY > .3253 * screenHeight) {
                                    mCube.Turn(11,true);
                                }
                                // If on Bottom Row do F'
                                else if (mPreviousY < .9366 * screenHeight && mPreviousY > .7539 * screenHeight) {
                                    mCube.Turn(8,true);
                                }
                                // If on Middle Row do S'
                                else if (mPreviousY < .7539 * screenHeight && mPreviousY > .5179 * screenHeight) {
                                    mCube.Turn(18,true);
                                }
                            }
                            // If on Right Face
                            else if (mPreviousX > .6688 * screenWidth) {
                                // If on Top Row do B
                                if (mPreviousY < .3770 * screenHeight && mPreviousY > .2092 * screenHeight) {
                                    mCube.Turn(11,true);
                                }
                                // If on Bottom Row do F'
                                else if (mPreviousY < .7443 * screenHeight && mPreviousY > .5253 * screenHeight) {
                                    mCube.Turn(8,true);
                                }
                                // If on Middle Row do S'
                                else if (mPreviousY < .5253 * screenHeight && mPreviousY > .3770 * screenHeight) {
                                    mCube.Turn(18,true);
                                }
                            }
                        }
                    }
                }
                // Is it a button?
                else if( mPreviousX < 0.15*screenWidth) {
                    // Back Button
                    if(.02 * screenHeight < mPreviousY  && mPreviousY < .25 * screenHeight) {

                    }
                    // Undo Button
                    else if( .26 * screenHeight < mPreviousY && mPreviousY < .49 * screenHeight ) {
                        mCube.Undo();
                    }
                    // Reset Button
                    else if( .50 * screenHeight < mPreviousY && mPreviousY < .73 * screenHeight) {
                        mCube.Reset();
                    }
                    // Shuffle Button
                    else if( .74 * screenHeight < mPreviousY && mPreviousY < .95 * screenHeight) {
                        mCube.Shuffle();
                    }
                }
                // Otherwise consider Cube Rotations
                else {

                    // If it is swipe
                    if( dx > .10 * screenWidth || dy > .05 * screenHeight ) {

                        // If swipe is upwards
                        if (abs(dy) / abs(dx) > 3 && dy < 0) {

                        }
                        // If swipe is downwards
                        if (abs(dy) / abs(dx) > 3 && dy > 0) {

                        }
                        // If swipe is rightwards
                        else if (abs(dy) / abs(dx) < 2 && dx > 0) {

                        }
                        // If swipe is leftwards
                        else if (abs(dy) / abs(dx) < 2 && dx < 0) {

                        }
                    }
                }

                requestRender();
                Log.i(TAG, "HI");

            case MotionEvent.ACTION_DOWN:
                mPreviousX = e.getX();
                mPreviousY = e.getY();
                String downmsg = String.format("Down X is %f and Down Y is %f", mPreviousX, mPreviousY);
                Log.i(TAG, downmsg);
        }

        return true;
    }

}