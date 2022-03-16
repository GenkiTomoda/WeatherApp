package jp.codeforfun.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // テストコード　ここから
        Intent intent = getIntent();
        String data = intent.getStringExtra("selected_place");
        Snackbar.make(findViewById(R.id.sample_text), data + "がタップされました", Snackbar.LENGTH_SHORT).show();
        // テストコード　ここまで
    }
}