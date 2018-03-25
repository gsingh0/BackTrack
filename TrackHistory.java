package com.example.khalsa.backtrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrackHistory extends NewTracker {
    protected Account a;

    public TrackHistory(){
        a = new Account(account.getEmail(),account.getPassword(),account.getLocation(),account.getDescription(),account.getTime(),account.getDate());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track_history);

    }

    public void onClickHero(View view){
        TextView textview = findViewById(R.id.textView12);
        textview.setText(super.time);

        TextView textview2 = findViewById(R.id.textView15);
        textview2.setText(a.getLocation());

        TextView textview3 = findViewById(R.id.textView14);
        textview3.setText(a.getDate());

        TextView textview4 = findViewById(R.id.textView13);
        textview4.setText(a.getDescription());
    }


}
