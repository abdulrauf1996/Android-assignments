package com.example.acer.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;

/**
 * Created by acer on 3/10/2017.
 */
public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try
        {
            db.execSQL("create table tbl_reg(id integer auto_increment primarykey,first_name varchar,last_name varchar,address varchar,mobile integer,Email varchar,Password password)");
        }
        catch (SQLiteException e)
        {
            Log.d("error",e.getLocalizedMessage().toString());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists tbl_reg");
        onCreate(db);
    }
    public boolean insertData(String first_name,String last_name,String address,int mobile,String email,String password)
    {
        long result=-1;
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues mycontent=new ContentValues();
        mycontent.put("first_name",first_name);
        mycontent.put("last_name",last_name);
        mycontent.put("address",address);
        mycontent.put("mobile",mobile);
        mycontent.put("email",email);
        mycontent.put("password",password);

        try
        {
            result=db.insert("tbl_reg",null,mycontent);

        }
        catch (SQLiteException e)
        {
            Log.d("error in insertion",e.getLocalizedMessage().toString());
        }
        if (result==-1)
        {
            return false;
        }
        else{
            return true;}
    }
}
