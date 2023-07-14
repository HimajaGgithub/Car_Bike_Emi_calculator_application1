package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class bajaj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajaj);
    }
    public void bank7(View view)
    {
        Intent baj=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        baj.putExtra("price-audi",s);
        startActivity(baj);
    }
}