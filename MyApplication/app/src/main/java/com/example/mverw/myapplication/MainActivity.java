package com.example.mverw.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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




    image1.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image1.setVisibility(View.GONE);

            imgList.add("img0");

            if(!(imgList.indexOf("img0") == 0)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);

            }
        }
    });

    image2.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image2.setVisibility(View.GONE);

            imgList.add("img1");

            if(!(imgList.indexOf("img1") == 1)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }
        }
    });

    image3.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image3.setVisibility(View.GONE);

            imgList.add("img2");

            if(!(imgList.indexOf("img2") == 2)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }
        }
    });

    image4.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image4.setVisibility(View.GONE);

            imgList.add("img3");

            if(!(imgList.indexOf("img3") == 3)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }

        }
    });

    image5.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            image5.setVisibility(View.GONE);

            imgList.add("img4");

            if(!(imgList.indexOf("img4") == 4)) {
                Intent myIntent = new Intent(MainActivity.this, TimeWaste.class);
                MainActivity.this.startActivity(myIntent);
            }
            else {
                // launch success activity
                Intent myIntent = new Intent(MainActivity.this, SuccessWindow.class);
                MainActivity.this.startActivity(myIntent);
            }
        }
    });



    }

}