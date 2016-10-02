package com.example.thiago.muitogelo;

import android.content.Context;
import android.content.SharedPreferences;

public class IdManager {
    private static final String SPFILE = "MUITO_GELO_PE_PI_AI";
    private static final String USERID = "userId";
    private static final String SITEID = "siteId";
    private static final String SITELID = "siteLDetailsId";
    private static final String SITEPID = "sitePDetailsId";

    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    private int userId;
    private int siteId;
    private int siteLDetailsId;
    private int sitePDetailsId;

    public IdManager(Context context) {
        sharedPref = context.getSharedPreferences(SPFILE, Context.MODE_PRIVATE);
        userId = sharedPref.getInt(USERID, 0);
        siteId = sharedPref.getInt(SITEID, 0);
        siteLDetailsId = sharedPref.getInt(SITELID, 0);
        sitePDetailsId = sharedPref.getInt(SITEPID, 0);
    }

    public int getUserId() {
    	return userId;
    }

    public int getSiteId() {
    	return siteId;
    }

    public int getSiteLId() {
    	return siteLDetailsId;
    }

    public int getSitePId() {
    	return sitePDetailsId;
    }

    public void addUser() {
        editor = sharedPref.edit();
        editor.putInt(USERID, ++userId);
        editor.commit();
    }

    public void addSite() {
        editor = sharedPref.edit();
        editor.putInt(SITEID, ++siteId);
        editor.commit();
    }

    public void addSiteL() {
        editor = sharedPref.edit();
        editor.putInt(SITELID, ++siteLDetailsId);
        editor.commit();
    }

    public void addSiteP() {
        editor = sharedPref.edit();
        editor.putInt(SITEPID, ++sitePDetailsId);
        editor.commit();
    }
}