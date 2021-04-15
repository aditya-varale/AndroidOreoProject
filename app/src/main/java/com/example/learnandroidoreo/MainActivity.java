package com.example.learnandroidoreo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learnandroidoreo.GameConnect.GameConnectActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Introduction(View view) {
    }

    public void GameConnect(View view) {
        Intent intent = new Intent(MainActivity.this, GameConnectActivity.class);
        startActivity(intent);
    }
}