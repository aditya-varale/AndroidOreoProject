package com.example.learnandroidoreo.ActionBarMenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.learnandroidoreo.R;

public class ActionBarMenuActivity extends AppCompatActivity {

    private static final String TAG = "ActionBarMenuActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);

        switch (item.getItemId())
        {
            case R.id.setting:
                Log.i(TAG, "onOptionsItemSelected: Setting");
                break;

            case R.id.help:
                Log.i(TAG, "onOptionsItemSelected: Help");
                break;
        }
        return true;
    }
}