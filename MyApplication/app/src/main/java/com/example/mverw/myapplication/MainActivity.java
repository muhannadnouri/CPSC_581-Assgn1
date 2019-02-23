package com.example.mverw.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
//import android.app.ActionBar;
import java.util.List;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int counter = 0;

    List<String> a = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //WebView myWebView = (WebView) findViewById(R.id.webview);
        //myWebView.loadUrl("https://www.youtube.com/watch?v=Cv1RJTHf5fk&t=66s");


    //Click on shit to close it...
    final ImageView imageReebok =(ImageView) findViewById(R.id.imageReebok);
    final ImageView imageWarning =(ImageView) findViewById(R.id.imageWarning);
    final ImageView imageZeus =(ImageView) findViewById(R.id.imageZeus);
    final ImageView imageHome =(ImageView) findViewById(R.id.imageHome);
    final ImageView imageWinner =(ImageView) findViewById(R.id.imageWinner);





    imageReebok.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageReebok.setVisibility(View.GONE);
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            //startActivity(intent);
            //counter++;

            a.add("reebok");
            if(a.indexOf("reebok") == 0 && a.indexOf("warning") == 1 && a.indexOf("zeus") == 2) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }


        }
    });

    imageWarning.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageWarning.setVisibility(View.GONE);
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            //startActivity(intent);
            //counter++;

            a.add("warning");
            if(a.indexOf("reebok") == 0 && a.indexOf("warning") == 1 && a.indexOf("zeus") == 2) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }

        }
    });

    imageZeus.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageZeus.setVisibility(View.GONE);
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            //startActivity(intent);
            //counter++;

            a.add("zeus");
            if(a.indexOf("reebok") == 0 && a.indexOf("warning") == 1 && a.indexOf("zeus") == 2) {
                //android.os.Process.killProcess(android.os.Process.myPid());
                //System.exit(1);

                // launch success activity
                Intent myIntent = new Intent(MainActivity.this, SecondWindow.class);
                MainActivity.this.startActivity(myIntent);
            }

        }
    });

    imageHome.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageHome.setVisibility(View.GONE);
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            //startActivity(intent);
            //counter++;

            a.add("home");
            if(a.indexOf("reebok") == 0 && a.indexOf("warning") == 1 && a.indexOf("zeus") == 2) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else
            {
                System.out.println("Wrong sequence!");
                Intent myIntent = new Intent(MainActivity.this, MainActivity.class);
                MainActivity.this.startActivity(myIntent);
            }

        }
    });

    imageWinner.setOnClickListener( new View.OnClickListener()
    {
        @Override
        public void onClick(View v) {
            imageWinner.setVisibility(View.GONE);
            //Intent intent = new Intent();
            //intent.setAction(Intent.ACTION_VIEW);
            //intent.addCategory(Intent.CATEGORY_BROWSABLE);
            //intent.setData(Uri.parse("https://trumpbutton.netlify.com"));
            //startActivity(intent);
            //counter++;

            a.add("winner");
            if(a.indexOf("reebok") == 0 && a.indexOf("warning") == 1 && a.indexOf("zeus") == 2) {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
            else
            {
                System.out.println("Wrong sequence!");
            }
        }
    });

    /*myWebView.setOnClickListener( new View.OnClickListener ()
    {
        @Override
        public void onClick(View v) {

        }
    });*/

    if(counter >= 4 )
    {
        //Boss fight
        startActivity(new Intent(MainActivity.this , SecondWindow.class));

    }


}

}