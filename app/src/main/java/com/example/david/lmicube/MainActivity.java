package com.example.david.lmicube;

/**
 * Created by David on 8/16/2017.
 */

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void toCubeActivity(View v){
        Intent i = new Intent(this, ToCubeActivity.class);
        startActivity(i);
    }

    public void toEmptyActivity(View v){
        Intent i = new Intent(this, EmptyActivity.class);
        startActivity(i);
    }
}
