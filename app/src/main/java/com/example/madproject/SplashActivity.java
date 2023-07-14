package com.example.madproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_DELAY = 5000; // Splash screen delay in milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the layout for the splash activity
        setContentView(R.layout.activity_splash);

        // Create a handler to delay the navigation
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the main activity or another appropriate screen
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close the splash activity
            }
        }, SPLASH_DELAY);
    }
}
