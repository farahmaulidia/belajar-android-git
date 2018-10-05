package com.aderufaidah.simpleapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {
    PreferencesHelper instance;
    private PreferencesHelper PreferencesHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        instance = PreferencesHelper, getInstance(getApplicationContext);
        int splashInterval = 10;
        new Handler().postDelayed(){
            if (!Instance.isLogin()) {
                starActivity(new Intent(SplashScreen.this, LoginActivity.class));
            } else {
                starActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        }, splashInterval;
    }
}
