package com.example.thiago.muitogelo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by caio on 26/09/16.
 */

public class VivoDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Vivo.db";

    public VivoDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(VivoDbContract.UserTable.SQL_CREATE);
        db.execSQL(VivoDbContract.SiteTable.SQL_CREATE);
        db.execSQL(VivoDbContract.SiteLDetailsTable.SQL_CREATE);
        db.execSQL(VivoDbContract.SitePDetailsTable.SQL_CREATE);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(VivoDbContract.SiteLDetailsTable.SQL_DELETE);
        db.execSQL(VivoDbContract.SitePDetailsTable.SQL_DELETE);
        db.execSQL(VivoDbContract.SiteTable.SQL_DELETE);
        db.execSQL(VivoDbContract.UserTable.SQL_DELETE);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
