package com.example.learnandroidoreo.SharedPreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import com.example.learnandroidoreo.R;

import java.util.ArrayList;

public class SharedPrefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        //SaveSharedPrefrences();
        GetShredPreferences();
    }

    private void GetShredPreferences() {
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.zappycode.sharedprefrences", Context.MODE_PRIVATE);
        ArrayList<String> newFriends = new ArrayList<>();

        try {
            newFriends = (ArrayList<String>) ObjectSerializer.deserialize(sharedPreferences.getString("friends", ObjectSerializer.serialize(new ArrayList<String>())));
        } catch (Exception e) {
            e.printStackTrace();
        }

        Log.i("new Friends",newFriends.toString());
    }

    private void SaveSharedPrefrences() {
        SharedPreferences sharedPreferences = this.getSharedPreferences("com.example.zappycode.sharedprefrences", Context.MODE_PRIVATE);

        ArrayList<String> friends = new ArrayList<>();

        friends.add("Fido");
        friends.add("Sarah");
        friends.add("Jones");

        try {
            sharedPreferences.edit().putString("friends",ObjectSerializer.serialize(friends)).apply();

            Log.i("friends",ObjectSerializer.serialize(friends));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}