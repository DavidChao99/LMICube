package com.example.david.lmicube;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ToCubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_cube);
    }

    /** Called when User presses the Cube Button    */
    public void sendToCube(View view) {
        //Intent going to OpenGLES20Activity
        Intent intent = new Intent(this, OpenGLES20Activity.class);
        startActivity(intent);
    }
}
