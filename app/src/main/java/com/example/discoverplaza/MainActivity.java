package com.example.discoverplaza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.discoverplaza.Activity1;
import com.example.discoverplaza.Activity2;
import com.example.discoverplaza.Activity3;
import com.example.discoverplaza.Activity4;
import com.example.discoverplaza.Activity5;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView icon1 = findViewById(R.id.icon1);
        ImageView icon2 = findViewById(R.id.icon2);
        ImageView icon3 = findViewById(R.id.icon3);
        ImageView icon4 = findViewById(R.id.icon4);
        ImageView icon5 = findViewById(R.id.icon5);

        icon1.setOnClickListener(v -> openNewPage(Activity1.class));
        icon2.setOnClickListener(v -> openNewPage(Activity2.class));
        icon3.setOnClickListener(v -> openNewPage(Activity3.class));
        icon4.setOnClickListener(v -> openNewPage(Activity4.class));
        icon5.setOnClickListener(v -> openNewPage(Activity5.class));
    }

    private void openNewPage(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
