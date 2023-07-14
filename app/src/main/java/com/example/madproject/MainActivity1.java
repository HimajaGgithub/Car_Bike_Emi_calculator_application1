package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity {

    EditText emailtext,passwordtext;

    String remail,rpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailtext=findViewById(R.id.editTextem);
        passwordtext=findViewById(R.id.editTextTextPassword);
        remail=getIntent().getStringExtra("email").toString();
        rpassword=getIntent().getStringExtra("password").toString();
    }
    public void sign(View view)
    {
        Intent ref=new Intent(this,Signup.class);
        startActivity(ref);
    }
    public void login(View view)
    {
        String email=emailtext.getText().toString();
        String password=passwordtext.getText().toString();
        if(!(email.equals(remail)) && (password.equals(rpassword)))
        {
            Toast.makeText(this,"Password or email is incorrect",Toast.LENGTH_LONG).show();
        }
        else
        {
            Intent re=new Intent(this,Home.class);
            startActivity(re);
        }
    }

}