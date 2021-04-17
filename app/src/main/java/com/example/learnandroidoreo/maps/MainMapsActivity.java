package com.example.learnandroidoreo.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learnandroidoreo.MainActivity;
import com.example.learnandroidoreo.R;

public class MainMapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_maps);
    }

    public void MapsActivity(View view) {
        Intent intent = new Intent(MainMapsActivity.this, MapsActivity.class);
        startActivity(intent);
    }

    public void LocationUpdate(View view) {
        Intent intent = new Intent(MainMapsActivity.this, LocationUpdateActivity.class);
        startActivity(intent);
    }

    public void UserLocationOnMaps(View view) {

        Intent intent = new Intent(MainMapsActivity.this, UserLocationOnMapsActivity.class);
        startActivity(intent);
    }

    public void MemorablePlaces(View view) {
        Intent intent = new Intent(MainMapsActivity.this, MemorablePlaceActivity.class);
        startActivity(intent);
    }
}