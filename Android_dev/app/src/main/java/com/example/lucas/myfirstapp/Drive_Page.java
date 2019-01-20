package com.example.lucas.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Drive_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive__page);
    }
    public void HomePage(View view)
    {
        //Home page layout
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
        Toast myToast = Toast.makeText(this,"Congratulations! Ride has been posted",
                Toast.LENGTH_LONG);
        myToast.show();

    }

}
