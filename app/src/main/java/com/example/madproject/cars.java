package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cars);
    }
    public void audi(View view)
    {
        Intent audi=new Intent(this,audi.class);
        startActivity(audi);
    }
    public void bmw(View view)
    {
        Intent bmw=new Intent(this,BMW.class);
        startActivity(bmw);
    }
    public void honda(View view)
    {
        Intent honda=new Intent(this,honda.class);
        startActivity(honda);
    }
    public void tata(View view)
    {
        Intent tata=new Intent(this, tata.class);
        startActivity(tata);
    }
}