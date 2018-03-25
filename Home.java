package com.example.khalsa.backtrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class Home extends MainActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }

    public void onClickNewTracker(View view){
        Intent intent = new Intent(this, NewTracker.class);
        startActivity(intent);
        }

    public void onClickTrackHistory(View view){
        Intent intent = new Intent(this, TrackHistory.class);
        startActivity(intent);


    }
}
