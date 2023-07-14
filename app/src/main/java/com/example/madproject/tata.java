package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata);
    }
    public void bank8(View view)
    {
        Intent tata=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        tata.putExtra("price-audi",s);
        startActivity(tata);
    }
}