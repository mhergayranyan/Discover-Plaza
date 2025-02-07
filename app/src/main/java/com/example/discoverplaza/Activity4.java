package com.example.discoverplaza;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class Activity4 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    // Handle back button press
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}