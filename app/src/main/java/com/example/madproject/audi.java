package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class audi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi);
    }
    public void bank2(View view)
    {
        Intent audi=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        audi.putExtra("price-audi",s);
        startActivity(audi);
    }
}