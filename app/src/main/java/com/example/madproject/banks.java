package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class banks extends AppCompatActivity {
EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banks);
        ed=findViewById(R.id.editTextText3);
        String ed2=getIntent().getStringExtra("price-audi");
        ed.setText(ed2);
    }
    public void emi(View view)
    {
        Button btn=(Button) view;
        String s=btn.getText().toString();
        String ed3= ed.getText().toString();
        Intent em= new Intent(this, EMI.class);
        em.putExtra("pricee",ed3);
        em.putExtra("keyname",s);
        startActivity(em);

    }
}