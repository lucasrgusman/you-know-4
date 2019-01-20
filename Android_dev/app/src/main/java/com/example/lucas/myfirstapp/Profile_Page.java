package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Profile_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile__page);
    }
    public void LogOff(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, LoggingIn.class);
        startActivity(intent);
    }
    public void DeleteAccount(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, LoggingIn.class);
        startActivity(intent);
        Toast myToast = Toast.makeText(this,"Account deleted. We are sorry to see you go!",
                Toast.LENGTH_LONG);
        myToast.show();

    }
    public void EditProfile(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }
}
