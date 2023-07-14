package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class jawa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jawa);
    }
    public void bank6(View view)
    {
        Intent jw=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        jw.putExtra("price-audi",s);
        startActivity(jw);
    }
}