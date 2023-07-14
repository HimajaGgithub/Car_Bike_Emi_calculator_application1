package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yamaha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yamaha);
    }
    public void bank4(View view)
    {
        Intent yama=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        yama.putExtra("price-audi",s);
        startActivity(yama);
    }
}