package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText emailtext, passwordtext;

    String remail, rpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailtext = findViewById(R.id.editTextem);
        passwordtext = findViewById(R.id.editTextTextPassword);

    }

    public void sign(View view) {
        new DbManager(this);
        startActivity(new Intent(this, Signup.class));
    }

    public void login(View view) {
        String email = emailtext.getText().toString();
        String password = passwordtext.getText().toString();
        if (!(isvalidpassword(password)) || !(isvalidemail(email))) {
            Toast.makeText(this, "Enter proper credentials", Toast.LENGTH_LONG).show();
            return;
        }
        {
            Intent re = new Intent(this, Home.class);
            startActivity(re);
        }
    }

    Pattern lowercase = Pattern.compile("^.*[a-z].*$");
    Pattern uppercase = Pattern.compile("^.*[A-Z].*$");
    Pattern numcase = Pattern.compile("^.*[0-9].*$");
    Pattern specialcase = Pattern.compile("^.*[^a-zA-Z0-9].*$");

    public boolean isvalidpassword(String pass)
    {
        if ((pass.length() < 8))
        {
            return false;
        }
        if (!(lowercase.matcher(pass).matches()))
        {
            return false;
        }
        if (!(uppercase.matcher(pass).matches()))
        {
            return false;
        }
        if (!(numcase.matcher(pass).matches()))
        {
            return false;
        }
        if (!(specialcase.matcher(pass).matches()))
        {
            return false;
        }
        return true;
    }
    Pattern mail = Pattern.compile("^.*[@gmail.com].*$");
    public boolean isvalidemail(String em)
    {
        if(!(lowercase.matcher(em).matches()))
        {
            return false;
        }
        if(!(mail.matcher(em).matches())) {
            return false;
        }
        return true;
    }

}