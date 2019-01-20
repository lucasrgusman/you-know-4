package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void LogIn(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, LoggingIn.class);

        startActivity(intent);
    }
    public void SignUp(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SigningUp.class);

        startActivity(intent);
    }
}
