package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class honda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honda);
    }
    public void bank1(View view)
    {
        Intent honda=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        honda.putExtra("price-audi",s);
        startActivity(honda);

    }

}