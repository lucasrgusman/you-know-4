package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SigningUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signing_up);
    }
    public void Login(View view)
    {
        String message="message";
        //Home page layout
        Intent intent = new Intent(this, LoggingIn.class);
//        intent.putExtra("message", message);
        startActivity(intent);
        Toast myToast = Toast.makeText(this,"Sign up successful!",
                Toast.LENGTH_LONG);
        myToast.show();

    }
}
