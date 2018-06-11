// DONE (5) Create a new class called SunshineSyncIntentService that extends IntentService
//  DONE (6) Create a constructor that calls super and passes the name of this class
//  DONE (7) Override onHandleIntent, and within it, call SunshineSyncTask.syncWeather
package com.example.android.sunshine.sync;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class SunshineSyncIntentService extends IntentService {

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public SunshineSyncIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        SunshineSyncTask.syncWeather(this);
    }
}
