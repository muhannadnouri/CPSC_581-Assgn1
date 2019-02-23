package com.example.mverw.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;


public class SuccessWindow extends AppCompatActivity  {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);


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
            //startActivity(new Intent(SuccessWindow.this , ThirdWindow.class));


    }
}