package com.example.khalsa.backtrack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.*;



public class MainActivity extends AccountArray {
    public static AccountArray a;
    protected Account account;

    public MainActivity(){
        a = new AccountArray();
        account = new Account("","","","","","");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
            Intent intent = new Intent(this, Home.class);


            EditText edittext = (EditText) findViewById(R.id.editText);
            String email = edittext.getText().toString();

            EditText edittext2 = (EditText) findViewById(R.id.editText2);
            String password = edittext2.getText().toString();

            String invalid = "Invalid Login";
            TextView text = findViewById(R.id.textView2);

//            for (int i = 0; i < a.list.size(); i++){
//                if (!email.equals(a.list.get(i).getEmail())){
//                    text.setText(signin);
//                    break;
//                }
//                else if (email.equals(a.list.get(i).getEmail()) && password.equals(a.list.get(i).getPassword()) == false){
//                    text.setText(invalid);
//                    break;
//                }
//               else if (email.equals(a.list.get(i).getEmail()) && password.equals(a.list.get(i).getPassword())) {
//                    a.currentAccount = i;
//                    startActivity(intent);
//                }
//            }

        if (email.isEmpty() || password.isEmpty()){
            text.setText(invalid);
        }
        else if (password.equals(account.getPassword()) && email.equals(account.getEmail())) {
            startActivity(intent);
        }




    }


    public void onClickSignUp(View view){
        Intent intent = new Intent(this, Home.class);

        //retrieves email text
        EditText edittext = (EditText) findViewById(R.id.editText);
        String email = edittext.getText().toString();

        //retrieves password text
        EditText edittext2 = (EditText) findViewById(R.id.editText2);
        String password = edittext2.getText().toString();

        String invalid = "Invalid Login";
        TextView text = findViewById(R.id.textView2);

//        a.list.add(new Account(null,null,null,null));
//        a.list.add(new Account(email,password,null,description));
//        a.currentAccount = list.size()-1;
        if (email.isEmpty()){
            text.setText(invalid);
        }
        else {
            account.setEmail(email);
            account.setPassword(password);
            account.setDescription("");
            startActivity(intent);
        }

    }





}


