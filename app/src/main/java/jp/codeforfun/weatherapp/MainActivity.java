package jp.codeforfun.weatherapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button place_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        place_1 = findViewById(R.id.place_1);
    }

    public void tap_place(View view){
        Snackbar.make(view, "ボタンが押されました！", Snackbar.LENGTH_SHORT).show();
        // どのボタンが押されたか
        Button tap_button = findViewById(view.getId());
        String btnText = tap_button.getText().toString();
        String function = "null";
        String place_name = "null";

        if (btnText.equals("栃木")) {
            function = "weather";
            place_name = "tochigi";
        }
        else if(btnText.equals("愛知")){
            function = "weather";
            place_name = "aichi";
        }
        else if(btnText.equals("福岡")){
            function = "weather";
            place_name = "fukuoka";
        }
        else if(btnText.equals("電卓")){
            function = "calculator";
            place_name = "null";
        }

        // 画面遷移
        if (function.equals("weather")){
            // 天気予報画面へ遷移
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            intent.putExtra("selected_place", place_name);
            startActivity(intent);
        }
        else if(function.equals("calculator")){
            // 電卓画面へ遷移
            Intent intent = new Intent(MainActivity.this, CalculatorActivity.class);
            startActivity(intent);
        }
    }

}