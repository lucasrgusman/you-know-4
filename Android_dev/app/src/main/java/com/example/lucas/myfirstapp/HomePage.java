package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }
    public void Drive_Page(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, Drive_Page.class);
        startActivity(intent);
    }
    public void Ride_Page(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, Ride_Page.class);
        startActivity(intent);
    }
    public void Profile_Page(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, Profile_Page.class);
        startActivity(intent);
    }
    public void LogOff(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, LoggingIn.class);
        startActivity(intent);
    }

}
