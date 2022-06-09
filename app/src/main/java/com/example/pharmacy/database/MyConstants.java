package com.example.pharmacy.database;

import android.content.Intent;

public class MyConstants {
    public static final String TABLE_NAME = "medicals";
    public static final String _ID = "_id";
    public static final String TITLE = "title";
    public static final String DESCRIPTION = "description";
    public static final String COMPOSITION = "composition";
    public static final String EFFECT = "effect";
    public static final String INDICATIONS = "indications";
    public static final String CONTRAINDICATIONS = "contraindications";
    public static final String APPLICATION_METHOD = "method of application";
    public static final String SIDE_EFFECT = "side effects";
    public static final String OVERDOSE = "overdose";
    public static final String STORAGE_CONDITIONS = "storage conditions";
    public static final String PIC_ADDRESS = "address";

    public static final String DB_NAME = "med_db.db";
    public static final int DB_VERSION = 1;

    public static final String TABLE_STRUCTURE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    _ID + " INTEGER PRIMARY KEY," +
                    TITLE + " TEXT," +
                    DESCRIPTION + " TEXT," +
                    COMPOSITION + " TEXT," +
                    EFFECT + " TEXT," +
                    INDICATIONS + " TEXT," +
                    CONTRAINDICATIONS + " TEXT," +
                    APPLICATION_METHOD + " TEXT," +
                    SIDE_EFFECT + " TEXT," +
                    OVERDOSE + " TEXT," +
                    STORAGE_CONDITIONS + " TEXT," +
                    PIC_ADDRESS + " TEXT)";

    public static final String DROP_TABLE =
            "DROP TABLE IF EXISTS " + TABLE_NAME;
}
