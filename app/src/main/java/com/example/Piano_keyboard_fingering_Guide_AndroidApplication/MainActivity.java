package com.example.Piano_keyboard_fingering_Guide_AndroidApplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    //TODO should be deleted
    String temp = "abc";
    String userEmail = temp;
    String userPassword =temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void loginToMainPage(View view) {
        //TODO: Add database to store the user email and password
        Log.d(LOG_TAG, "Login Button clicked!");
        Intent intentToMainPage = new Intent(this, FileTransferPage.class);

        userEmail = ((EditText)findViewById(R.id.userEmail)).getText().toString();
        userPassword = ((EditText)findViewById(R.id.userPassword)).getText().toString();

        if(userEmail.equals("1") && userPassword.equals("1")){
            startActivity(intentToMainPage);
        }
        else{//TODO: Show warning msg with wrong Username&Password
            //wrong password
        }
    }
}