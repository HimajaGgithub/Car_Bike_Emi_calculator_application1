package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class royalenfield extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_royalenfield);
    }
    public void bank5(View view)
    {
        Intent re=new Intent(this, banks.class);
        Button btn=(Button) view;
        String s=btn.getText().toString();
        re.putExtra("price-audi",s);
        startActivity(re);
    }
}