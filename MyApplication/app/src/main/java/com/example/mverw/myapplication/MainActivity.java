package com.example.mverw.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Handler;
import android.provider.Settings;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
//import android.app.ActionBar;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    List<String> imgList = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    //Click on shit to close it...
    final ImageView image1 = (ImageView) findViewById(R.id.imageReebok);
    final ImageView image2 = (ImageView) findViewById(R.id.imageWarning);
    final ImageView image3 = (ImageView) findViewById(R.id.imageZeus);
    final ImageView image4 = (ImageView) findViewById(R.id.imageHome);
    final ImageView image5 = (ImageView) findViewById(R.id.imageWinner);
    final ImageView image6 = (ImageView) findViewById(R.id.imageBudLight);
    final ImageView image7 = (ImageView) findViewById(R.id.imageSingle);



        // hide status and navigation bar
    View mDecorView = getWindow().getDecorView();

    mDecorView.setSystemUiVisibility(
            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION   // hide nav bar
                    | View.SYSTEM_UI_FLAG_FULLSCREEN        // hide status bar
                    | View.SYSTEM_UI_FLAG_IMMERSIVE);

    image1.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image1.setVisibility(View.GONE);

            imgList.add("img0");
/*
            if(!(imgList.indexOf("img0") == 0)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);

            }*/
            if (imgList.size() != 7) {
                //
            }
            else {
                if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                    System.out.println("Hello");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                    System.out.println("SUCCESS");
                } else {
                    System.out.println("SUCCESSFUL-NOT");

                    // launch success activity OR kill application
                    //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                    //MainActivity.this.startActivity(myIntent);
                    System.out.println("1");
                    imgList.clear();
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(myIntent);
                    finish();
                }
            }
        }
    });

    image2.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image2.setVisibility(View.GONE);

            imgList.add("img1");
/*
            if(!(imgList.indexOf("img1") == 1)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }*/
            if (imgList.size() != 7) {
                //
            }
            else {
                if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                    System.out.println("Hello");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                } else {
                    // launch success activity OR kill application
                    //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                    //MainActivity.this.startActivity(myIntent);
                    System.out.println("2");
                    imgList.clear();
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(myIntent);
                    finish();
                }
            }
        }
    });

    image3.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image3.setVisibility(View.GONE);

            imgList.add("img2");
/*
            if(!(imgList.indexOf("img2") == 2)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }*/
            if (imgList.size() != 7) {
                //
            }
            else {
                if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                    System.out.println("Hello");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                } else {
                    // launch success activity OR kill application
                    //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                    //MainActivity.this.startActivity(myIntent);
                    System.out.println("3");
                    imgList.clear();
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(myIntent);
                    finish();
                }
            }
        }
    });

    image4.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image4.setVisibility(View.GONE);

            imgList.add("img3");
/*
            if(!(imgList.indexOf("img3") == 3)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }*/
            if (imgList.size() != 7) {
                //
            }
            else {
                if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                    System.out.println("Hello");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                } else {
                    // launch success activity OR kill application
                    //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                    //MainActivity.this.startActivity(myIntent);
                    System.out.println("4");
                    imgList.clear();
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(myIntent);
                    finish();
                }
            }

        }
    });

    image5.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image5.setVisibility(View.GONE);

            imgList.add("img4");
/*
            if(!(imgList.indexOf("img4") == 4)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }*/
            if (imgList.size() != 7) {
                //
            }
            else {
                if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                    System.out.println("Hello");
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);
                } else {
                    // launch success activity OR kill application
                    //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                    //MainActivity.this.startActivity(myIntent);
                    System.out.println("5");
                    imgList.clear();
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    //MainActivity.this.startActivity(myIntent);
                    startActivity(myIntent);
                    finish();
                }
            }
        }
    });


    image6.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                image6.setVisibility(View.GONE);

                imgList.add("img5");
/*
                if(!(imgList.indexOf("img5") == 5)) {
                    Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                    MainActivity.this.startActivity(myIntent);
                }*/
                if (imgList.size() != 7) {
                    //
                }
                else {
                    if (!(imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                        System.out.println("Hello");

                        android.os.Process.killProcess(android.os.Process.myPid());
                        System.exit(1);
                    } else {
                        // launch success activity OR kill application
                        //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                        //MainActivity.this.startActivity(myIntent);
                        System.out.println("6");
                        imgList.clear();
                        Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                        //MainActivity.this.startActivity(myIntent);
                        startActivity(myIntent);
                        finish();
                    }
                }
            }
        });

    image7.setOnClickListener( new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                image7.setVisibility(View.GONE);

                imgList.add("img6");
                if (imgList.size() != 7) {
                    // do nothing
                }
                else {
                        if ((imgList.indexOf("img6") == 6) && (imgList.indexOf("img5") == 5) && (imgList.indexOf("img4") == 4) && (imgList.indexOf("img3") == 3) && (imgList.indexOf("img2") == 2) && (imgList.indexOf("img1") == 1) && (imgList.indexOf("img0") == 0)) {

                            getWindow().getDecorView().setBackgroundColor(Color.rgb(45, 134, 48));

                            TextView successText = (TextView)findViewById(R.id.textView5);
                            successText.setText("Success");

                            System.out.println("FINAL STAGE");

                            MediaPlayer ring = MediaPlayer.create(MainActivity.this,R.raw.rick);
                            ring.start();


                            Handler handler = new Handler();
                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {
                                    System.out.println("Who's your daddy?");
                                    android.os.Process.killProcess(android.os.Process.myPid());
                                    System.exit(1);
                                }
                            }, 3000);



                        } else {
                            // launch success activity OR kill application
                            //Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                            //MainActivity.this.startActivity(myIntent);

                            System.out.println("7");
                            imgList.clear();
                            Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                            //MainActivity.this.startActivity(myIntent);
                            startActivity(myIntent);
                            finish();
                    }
                }
            }
        });


    }

}