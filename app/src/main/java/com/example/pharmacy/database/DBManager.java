package com.example.pharmacy.database;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DBManager {
    private Context context;
    private DBHelper dbHelper;
    private SQLiteDatabase database;

    public DBManager(Context context){
        this.context = context;
        dbHelper = new DBHelper(context);
    }

    public DBHelper getDbHelper(){
        return dbHelper;
    }

    public SQLiteDatabase getDatabase(){
        return this.database;
    }


    public void openDB(){
        database = dbHelper.getWritableDatabase();
    }


    public void insertToDB(String title, String description){
//                           String composition, String effect,
//                           String indications, String contraindication, String method, String sideEffect,
//                           String overdose, String storageConditions){
//                       String address){

        ContentValues content = new ContentValues();
        content.put(MyConstants.TITLE, title);
        content.put(MyConstants.DESCRIPTION, description);
//        content.put(MyConstants.COMPOSITION, composition);
//        content.put(MyConstants.EFFECT, effect);
//        content.put(MyConstants.INDICATIONS, indications);
//        content.put(MyConstants.CONTRAINDICATIONS, contraindication);
//        content.put(MyConstants.APPLICATION_METHOD, method);
//        content.put(MyConstants.SIDE_EFFECT, sideEffect);
//        content.put(MyConstants.OVERDOSE, overdose);
//        content.put(MyConstants.STORAGE_CONDITIONS, storageConditions);
//        content.put(MyConstants.PIC_ADDRESS, address);
        //content.put(String.valueOf(MyConstants.PIC_ADDRESS), picture);
        database.insert(MyConstants.TABLE_NAME, null, content);
    }

    public List<String> getFromDB(){
        List<String> tempList = new ArrayList<>();
        Cursor cursor = database.query(MyConstants.TABLE_NAME, null, null,
                null, null, null, null);

        while(cursor.moveToNext()){
            String title = cursor.getString(cursor.getColumnIndexOrThrow(MyConstants.TITLE));
            tempList.add(title);
        }
        cursor.close();
        return tempList;
    }

    public void closeDB(){
        dbHelper.close();
    }

}
