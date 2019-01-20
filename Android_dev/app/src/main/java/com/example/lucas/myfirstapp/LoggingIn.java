package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoggingIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging_in);
    }


    public void SignUp(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SigningUp.class);

        startActivity(intent);
    }
    public void HomePage(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, HomePage.class);

        startActivity(intent);
    }
}
