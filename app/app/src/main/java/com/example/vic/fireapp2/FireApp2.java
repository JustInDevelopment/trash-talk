package com.example.vic.fireapp2;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Vic on 1/15/2018.
 */

public class FireApp2 extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
