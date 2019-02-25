package com.example.mverw.myapplication;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;


public class SuccessWindow extends AppCompatActivity  {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        // immersive full screen mode
        View mDecorView = getWindow().getDecorView();

        mDecorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION   // hide nav bar
                        | View.SYSTEM_UI_FLAG_FULLSCREEN        // hide status bar
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                System.out.println("Who's your daddy?");
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        }, 3000);


    }
}