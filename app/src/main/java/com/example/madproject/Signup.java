package com.example.madproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Signup extends AppCompatActivity {
    
EditText name,emailtext,passwordtext,confirmtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        name=findViewById(R.id.editTextname);
        emailtext=findViewById(R.id.editTextemail);
        passwordtext=findViewById(R.id.editTextTextPassword2);
        confirmtext=findViewById(R.id.editTextTextPassword3);

    }
    public void signup(View view)
    {
        String n=name.getText().toString();
        String email=emailtext.getText().toString();
        String pass=passwordtext.getText().toString();
        String con=confirmtext.getText().toString();
        DbManager db = new DbManager(this);
        String res=db.addRecord(email,n,pass);
        if(!(isvalidpassword(pass)) || !(isvalidemail(email)) || !(con.equals(pass)))
        {
            Toast.makeText(this,"Enter valid password",Toast.LENGTH_LONG).show();
            return;
        }
        Intent obj=new Intent(this, MainActivity1.class);
        obj.putExtra("email",email);
        obj.putExtra("password",pass);
        startActivity(obj);

    }
    Pattern lowercase=Pattern.compile("^.*[a-z].*$");
    Pattern uppercase=Pattern.compile("^.*[A-Z].*$");
    Pattern numcase=Pattern.compile("^.*[0-9].*$");
    Pattern specialcase=Pattern.compile("^.*[^a-zA-Z0-9].*$");
    public boolean isvalidpassword(String pass)
    {
        if((pass.length()<8))
        {
            return false;
        }
        if(!(lowercase.matcher(pass).matches()))
        {
            return false;
        }
        if(!(uppercase.matcher(pass).matches()))
        {
            return false;
        }
        if(!(numcase.matcher(pass).matches()))
        {
            return false;
        }
        if(!(specialcase.matcher(pass).matches()))
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