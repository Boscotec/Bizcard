package com.boscotec.bizcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crash.FirebaseCrash;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        //FirebaseCrash.log("Activity created");
        mFirebaseAnalytics.logEvent("ActivityCreated", savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
