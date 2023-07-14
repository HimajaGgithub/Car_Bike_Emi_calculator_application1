package com.example.madproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {
    private static final String dbname="emi.db";

    public DbManager(Context context)
    {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry="create table register(name TEXT,emailid TEXT primary key,password TEXT)";
        db.execSQL(qry);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS register");
        onCreate(db);


    }
    public String addRecord(String p1,String p2,String p3)
    {
        SQLiteDatabase db=this.getWritableDatabase();

        ContentValues cvv=new ContentValues();
        cvv.put("emailid",p1);
        cvv.put("name",p2);
        cvv.put("password",p3);

        long res=db.insert("register",null,cvv);

        if(res==-1)
            return " Failed";
        else
            return"Successfully inserted";
    }


}
