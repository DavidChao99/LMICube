package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when User presses the Cube Button    */
    public void sendToCube(View view) {
        //Intent going to OpenGLES20Activity
        Intent intent = new Intent(this, OpenGLES20Activity.class);
        startActivity(intent);
    }
}
