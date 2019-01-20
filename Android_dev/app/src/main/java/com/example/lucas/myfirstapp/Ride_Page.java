package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Ride_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride__page);
    }
    public void RideFilters(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, RideFilters.class);
        startActivity(intent);
    }
}
