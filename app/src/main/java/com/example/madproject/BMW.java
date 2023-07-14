package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BMW extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmw);
    }
    public void bank3(View view)
    {
        Intent bmw=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        bmw.putExtra("price-audi",s);
        startActivity(bmw);
    }
}