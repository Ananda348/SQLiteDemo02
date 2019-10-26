package com.poliban.id.anandapratama.sqlitedemo02;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() ->{
            startActivity(new Intent(this, MainActivity.class));
            finish();
            },3000);
    }
}
