package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void cars(View view)
    {
        Intent car=new Intent(this,cars.class);
        startActivity(car);
    }
    public void bikes(View view)
    {
        Intent bike = new Intent(this,bikes.class);
        startActivity(bike);
    }
    public void logout(View view){
        Intent in=new Intent(this,MainActivity.class);
        startActivity(in);
    }
}