package com.example.khalsa.backtrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;


public class NewTracker extends Home {

    protected static String desc;
    protected static String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_tracker);

    }

    public void onClickSubmitButton(View view){

        EditText edittext1 = (EditText) findViewById(R.id.textView6);
        time = edittext1.getText().toString();
        account.setTime(time);

        EditText edittext2 = (EditText) findViewById(R.id.textView7);
        String date = edittext2.getText().toString();
        account.setDate(date);

        EditText edittext3 = (EditText) findViewById(R.id.textView8);
        String location = edittext3.getText().toString();
        account.setLocation(location);

        EditText edittext4 = (EditText) findViewById(R.id.textView9);
        String description = edittext4.getText().toString();
        account.setDescription(description);

        Intent intent = new Intent(this, Home.class);
        startActivity(intent);


    }

    public String print(Account account){
        return account.getDescription();
    }

//    public static void copy(Account a){
//        a.setDescription(account.getDescription());
//    }

    public static void setDesc(String description){
        description = desc;
    }

}


