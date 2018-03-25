package com.example.khalsa.backtrack;

/**
 * Created by Khalsa on 3/24/2018.
 */
import android.location.Location;

import java.time.LocalDateTime;
import java.util.*;


public class Account {

    private String email;
    private String password;
    private String location;
    private String description;
    private LocalDateTime localdatetime;
    private String time;
    private String date;

    public Account(String email, String password, String loc, String description, String time, String date){
        this.email = email;
        this.password = password;
        this.description = description;
        this.location = loc;
        this.time = time;
        this.date = date;
    }



    public String getPassword(){
        return password;
    }

    public void setLocation(String l){
        this.location = l;
    }

    public String getLocation(){
        return location;
    }

    public String getEmail(){
        return email;
    }

    public String getDescription(){
        return description;
    }
    public void setDescription(String text){
        description = text;
    }

    public void setEmail(String e){
        this.email = e;
    }

    public void setPassword(String e){
        this.password = e;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String t){
        this.time = t;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String d){
        this.date = d;
    }

    public static boolean isEmpty(ArrayList<Account> list){
        boolean empty = false;
        if (list.size() == 0){
            empty = true;
        }
        else {
            empty = false;
        }
        return empty;
    }

    public String toString() {
        return "The description is: " + description;
    }









}
