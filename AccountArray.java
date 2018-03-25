package com.example.khalsa.backtrack;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;

/**
 * Created by Khalsa on 3/25/2018.
 */

public class AccountArray extends AppCompatActivity implements View.OnClickListener {

    protected ArrayList<Account> list;
    protected int currentAccount = 0;

    public AccountArray(){
        list = new ArrayList <Account>(1);
    }

    public int Size(){
        return list.size();
    }

    public String toString(){
        return "Size is: " + Size();
    }

    public void Add(Account a){
        list.add(a);
    }


    public void onClick(View view){

    }

}
