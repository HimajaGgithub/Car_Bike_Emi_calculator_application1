package com.example.madproject;
import android.content.Intent;
import android.os.Bundle;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EMI extends AppCompatActivity {
    Button emiCalcBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);
        final EditText P = (EditText) findViewById(R.id.editText);
        final EditText I = (EditText) findViewById(R.id.editText2);
        final EditText Y = (EditText) findViewById(R.id.editText3);
        final EditText TI = (EditText) findViewById(R.id.editText5);
        final EditText result = (EditText) findViewById(R.id.editTextText);
        final EditText amount=(EditText) findViewById(R.id.editTextText2);
        emiCalcBtn = (Button) findViewById(R.id.button);
        String rate2=getIntent().getStringExtra("keyname");
        I.setText(rate2);
        String price1=getIntent().getStringExtra("pricee");
        P.setText(price1);
        emiCalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st1 = P.getText().toString();
                String st2 = I.getText().toString();
                String st3 = Y.getText().toString();
                if (TextUtils.isEmpty(st1)) {
                    P.setError("Enter Principal Amount");
                    P.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(st2)) {
                    I.setError("Enter Interest Rate");
                    I.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(st3) || (Integer.parseInt(st3)>5)){
                    Y.setError("Enter less than 5Years");
                    Y.requestFocus();
                    return;
                }
                float p = Float.parseFloat(st1);
                float i = Float.parseFloat(st2);
                float y = Float.parseFloat(st3);
                float Principal = calPric(p);
                float Rate = calInt(i);
                float Months = calMonth(y);
                float Dvdnt = calDvdnt(Rate, Months);
                float FD = calFinalDvdnt(Principal, Rate, Dvdnt);
                float D = calDivider(Dvdnt);
                float emi = calEmi(FD, D);
                float TA = calTa(emi, Months);
                float ti = calTotalInt(TA, Principal);
                result.setText(String.valueOf(emi)+" rs");
                TI.setText(String.valueOf(ti+ " rs"));
                float amt=ti+p;
                amount.setText(String.valueOf(amt)+" rs");



            }
        });
        Button reset=(Button)findViewById(com.example.madproject.R.id.button2);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                P.setText("");
                I.setText("");
                Y.setText("");
            }
        });
    }

    public void home(View view)
    {
        Intent ho=new Intent(this,Home.class);
        startActivity(ho);
    }
    public float calPric(float p) {
        return (float)(p);
    }
    public float calInt(float i) {
        return (float)(i / 12 / 100);
    }
    public float calMonth(float y) {
        return (float)(y * 12);
    }
    public float calDvdnt(float Rate, float Months) {
        return (float)(Math.pow(1 + Rate, Months));
    }
    public float calFinalDvdnt(float Principal, float Rate, float Dvdnt) {
        return (float)(Principal * Rate * Dvdnt);
    }
    public float calDivider(float Dvdnt) {
        return (float)(Dvdnt - 1);
    }
    public float calEmi(float FD, Float D) {
        return (float)(FD / D);
    }
    public float calTa(float emi, Float Months) {
        return (float)(emi * Months);
    }
    public float calTotalInt(float TA, float Principal) {
        return (float)(TA - Principal);
    }
}