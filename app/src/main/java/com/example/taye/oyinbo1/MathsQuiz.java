package com.example.taye.oyinbo1;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by TAYE on 13/03/2017.
 */

public class MathsQuiz extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
