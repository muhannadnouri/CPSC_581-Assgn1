package com.example.mverw.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;


public class SecondWindow extends AppCompatActivity  {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);


        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Your database code here
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

            }
        }, 1*60*1000);




        //Boss fight
            //startActivity(new Intent(SecondWindow.this , ThirdWindow.class));


    }
}