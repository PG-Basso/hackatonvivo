package com.example.thiago.muitogelo;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Date;

public class VivoDbDAO {
    SQLiteDatabase db;
    IdManager idm;

    public VivoDbDAO(Context context) {
    	VivoDbHelper mDbHelper = new VivoDbHelper(context);
        db = mDbHelper.getWritableDatabase();
        idm = new IdManager(context);
    }

    public void insertUser(
            String fullName,
            String dateOfBirth,
            String email,
            String phoneNumber,
            boolean isVivo,
            String city,
            String state,
            String street,
            String district) {
        ContentValues values = new ContentValues();
        values.put(VivoDbContract.UserTable.COLUMN_FULLNAME, fullName);
        values.put(VivoDbContract.UserTable.COLUMN_DATEOFB, dateOfBirth);
        values.put(VivoDbContract.UserTable.COLUMN_EMAIL, email);
        values.put(VivoDbContract.UserTable.COLUMN_PHONENUM, phoneNumber);
        values.put(VivoDbContract.UserTable.COLUMN_ISVIVO, (isVivo?1:0));
        values.put(VivoDbContract.UserTable.COLUMN_CITY, city);
        values.put(VivoDbContract.UserTable.COLUMN_STATE, state);
        values.put(VivoDbContract.UserTable.COLUMN_STREET, street);
        values.put(VivoDbContract.UserTable.COLUMN_DISTRICT, district);
        db.insert(VivoDbContract.UserTable.TABLE_NAME, null, values);
        idm.addUser();
    }

    public void insertSite(
            String type,
            String address,
            String city,
            String district,
            String state,
            String cep,
            double latitude,
            double longitude,
            double altitude) {
        ContentValues values = new ContentValues();
        values.put(VivoDbContract.SiteTable.COLUMN_USERID, idm.getUserId());
        values.put(VivoDbContract.SiteTable.COLUMN_TYPE, type);
        values.put(VivoDbContract.SiteTable.COLUMN_ADDRESS, address);
        values.put(VivoDbContract.SiteTable.COLUMN_CITY, city);
        values.put(VivoDbContract.SiteTable.COLUMN_DISTRICT, district);
        values.put(VivoDbContract.SiteTable.COLUMN_STATE, state);
        values.put(VivoDbContract.SiteTable.COLUMN_CEP, cep);
        values.put(VivoDbContract.SiteTable.COLUMN_LAT, latitude);
        values.put(VivoDbContract.SiteTable.COLUMN_LONG, longitude);
        values.put(VivoDbContract.SiteTable.COLUMN_ALT, altitude);
        db.insert(VivoDbContract.SiteTable.TABLE_NAME, null, values);
        idm.addSite();
    }


    public void insertSiteL(
            String name,
            String ownerName,
            String ownerPhoneNumber,
            String ownerAddress,
            String repName,
            String repPhoneNumber,
            String repAddress,
            String syndName,
            String syndPhoneNumber,
            boolean isDeedAvailable,
            boolean isDocAvailable) {
        ContentValues values = new ContentValues();
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_SITEID, idm.getSiteId());
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_NAME, name);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_OWNERNAME, ownerName);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_OWNERPHONENUM, ownerPhoneNumber);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_OWNERADDRESS, ownerAddress);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_REPNAME, repName);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_REPPHONENUM, repPhoneNumber);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_REPADDRESS, repAddress);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_SYNDNAME, syndName);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_SYNDPHONENUM, syndPhoneNumber);
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_ISDEEDAV, (isDeedAvailable?1:0));
        values.put(VivoDbContract.SiteLDetailsTable.COLUMN_ISDOCAV, (isDocAvailable?1:0));
        db.insert(VivoDbContract.SiteLDetailsTable.TABLE_NAME, null, values);
        idm.addSiteL();
    }


    public void insertSiteP(
            int floorNumber,
            String closestAvenue,
            boolean isAccessAvailable,
            String howAccessProvided,
            boolean isPowerAvailable,
            String availablePower,
            String nearestPowerSupply,
            String powerSupplier,
            boolean isObstructed,
            double totalArea,
            String existingConstruction,
            boolean elevatorAccess,
            boolean ladderAccess,
            boolean craneAccess,
            boolean openAccess,
            String comments) {
        ContentValues values = new ContentValues();
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_SITEID, idm.getSiteId());
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_FLOORNUM, floorNumber);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_CLOSESTAV, closestAvenue);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_ISACCESSAV, (isAccessAvailable?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_HOWACCPROV, howAccessProvided);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_ISPOWAV, (isPowerAvailable?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_AVPOWER, availablePower);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_NEARPOWSUP, nearestPowerSupply);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_POWSUPPLIER, powerSupplier);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_ISOBSTRUCTED, (isObstructed?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_TOTALAREA, totalArea);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_EXISTCONSTR, existingConstruction);
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_ELEVATORACC, (elevatorAccess?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_LADDERACC, (ladderAccess?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_CRANEACC, (craneAccess?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_OPENACC, (openAccess?1:0));
        values.put(VivoDbContract.SitePDetailsTable.COLUMN_COMMENTS, comments);
        db.insert(VivoDbContract.SitePDetailsTable.TABLE_NAME, null, values);
        idm.addSiteP();
    }
}