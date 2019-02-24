package com.example.mverw.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

public class TimeWaste extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timewaste);


        VideoView mVideoView2 = (VideoView)findViewById(R.id.videoView);

        String uriPath2 = "android.resource://com.example.mverw.myapplication/"+R.raw.taidaddy;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();

        mVideoView2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                // u suffer enough
                Intent myIntent = new Intent(TimeWaste.this, MainActivity.class);
                TimeWaste.this.startActivity(myIntent);
            }
        });


    }
}