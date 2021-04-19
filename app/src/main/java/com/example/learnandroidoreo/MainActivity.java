package com.example.learnandroidoreo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.learnandroidoreo.ActionBarMenu.ActionBarMenuActivity;
import com.example.learnandroidoreo.AlertDialog.AlertDialogActivity;
import com.example.learnandroidoreo.Audio.AudioActivity;
import com.example.learnandroidoreo.BrainTrainer.BrainTrainerActivity;
import com.example.learnandroidoreo.DownloadImage.DownloadImageActivity;
import com.example.learnandroidoreo.DownloadImage.DownloadWebActivity;
import com.example.learnandroidoreo.GameConnect.GameConnectActivity;
import com.example.learnandroidoreo.GuessTheCelebrity.GuessTheCelebrityActivity;
import com.example.learnandroidoreo.NewsApp.NewsAppActivity;
import com.example.learnandroidoreo.Notes.NotesActivity;
import com.example.learnandroidoreo.SQLite.SQliteActivity;
import com.example.learnandroidoreo.SharedPreferences.SharedPrefActivity;
import com.example.learnandroidoreo.Timers.TimersActivity;
import com.example.learnandroidoreo.TimesTable.TimesTableActivity;
import com.example.learnandroidoreo.Video.VideoActivity;
import com.example.learnandroidoreo.Weather.JSONParseActivity;
import com.example.learnandroidoreo.Weather.WeatherShowActivity;
import com.example.learnandroidoreo.maps.MainMapsActivity;
import com.example.learnandroidoreo.webview.WebViewActivity;

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

    public void VideoMenu(View view) {
        Intent intent = new Intent(MainActivity.this, VideoActivity.class);
        startActivity(intent);
    }

    public void AudioMenu(View view) {
        Intent intent = new Intent(MainActivity.this, AudioActivity.class);
        startActivity(intent);
    }

    public void TimesTable(View view) {
        Intent intent = new Intent(MainActivity.this, TimesTableActivity.class);
        startActivity(intent);
    }

    public void Timer(View view) {
        Intent intent = new Intent(MainActivity.this, TimersActivity.class);
        startActivity(intent);
    }

    public void BrainTrainer(View view) {
        Intent intent = new Intent(MainActivity.this, BrainTrainerActivity.class);
        startActivity(intent);
    }

    public void DownloadImage(View view) {
        Intent intent = new Intent(MainActivity.this, DownloadImageActivity.class);
        startActivity(intent);
    }


    public void DownloadWeb(View view) {
        Intent intent = new Intent(MainActivity.this, DownloadWebActivity.class);
        startActivity(intent);
    }

    public void GuessTheCelebrity(View view) {
        Intent intent = new Intent(MainActivity.this, GuessTheCelebrityActivity.class);
        startActivity(intent);
    }

    public void DownloadJson(View view) {
        Intent intent = new Intent(MainActivity.this, JSONParseActivity.class);
        startActivity(intent);
    }

    public void WeatherApp(View view) {
        Intent intent = new Intent(MainActivity.this, WeatherShowActivity.class);
        startActivity(intent);
    }

    public void MapActivity(View view) {

        Intent intent = new Intent(MainActivity.this, MainMapsActivity.class);
        startActivity(intent);
    }

    public void SharedPreferences(View view) {
        Intent intent = new Intent(MainActivity.this, SharedPrefActivity.class);
        startActivity(intent);
    }

    public void ActionBarMenu(View view) {
        Intent intent = new Intent(MainActivity.this, ActionBarMenuActivity.class);
        startActivity(intent);
    }

    public void AlertDialogButton(View view) {
        Intent intent = new Intent(MainActivity.this, AlertDialogActivity.class);
        startActivity(intent);
    }

    public void NoteApplication(View view) {
        Intent intent = new Intent(MainActivity.this, NotesActivity.class);
        startActivity(intent);
    }

    public void SqliteDatabase(View view) {
        Intent intent = new Intent(MainActivity.this, SQliteActivity.class);
        startActivity(intent);
    }

    public void WebViewButton(View view) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
    }

    public void NewsApp(View view) {
        Intent intent = new Intent(MainActivity.this, NewsAppActivity.class);
        startActivity(intent);
    }
}