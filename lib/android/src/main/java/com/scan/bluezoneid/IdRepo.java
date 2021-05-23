package com.scan.bluezoneid;

import android.content.Context;

public class IdRepo {
    private static final String PREFS = "contact_tracing_prefs";
    private static final String UUID_KEY = "contact_tracing_uuid";
    private Context context;

    public IdRepo(Context context) {
        this.context = context;
    }

    public void setId(String id) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).edit().putString(UUID_KEY, id).commit();
    }

    public String getId() {
        return context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(UUID_KEY, "null");
    }
}