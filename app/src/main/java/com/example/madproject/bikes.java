package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bikes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bikes);
    }
    public void re(View view)
    {
        Intent re= new Intent(this,royalenfield.class);
        startActivity(re);
    }
    public void baja(View view)
    {
        Intent baj=new Intent(this,bajaj.class);
        startActivity(baj);
    }
    public void jawa(View view)
    {
        Intent jaw=new Intent(this,jawa.class);
        startActivity(jaw);
    }
    public void yama(View view)
    {
        Intent yam=new Intent(this,yamaha.class);
        startActivity(yam);
    }
}