package jp.codeforfun.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class CalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void fn_cal_plus(View view) {
        EditText editText1 = (EditText)findViewById(R.id.cal_Number1);
        EditText editText2 = (EditText)findViewById(R.id.cal_Number2);
        String num1  = editText1.getText().toString();
        String num2  = editText2.getText().toString();
        String ans = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
        EditText editText3 = (EditText)findViewById(R.id.cal_ans);
        editText3.setText(ans);
    }

    public void fn_cal_minus(View view) {
        EditText editText1 = (EditText)findViewById(R.id.cal_Number1);
        EditText editText2 = (EditText)findViewById(R.id.cal_Number2);
        String num1  = editText1.getText().toString();
        String num2  = editText2.getText().toString();
        String ans = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
        EditText editText3 = (EditText)findViewById(R.id.cal_ans);
        editText3.setText(ans);

    }

    public void fn_cal_times(View view) {
        EditText editText1 = (EditText)findViewById(R.id.cal_Number1);
        EditText editText2 = (EditText)findViewById(R.id.cal_Number2);
        String num1  = editText1.getText().toString();
        String num2  = editText2.getText().toString();
        String ans = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
        EditText editText3 = (EditText)findViewById(R.id.cal_ans);
        editText3.setText(ans);

    }

    public void fn_cal_divid(View view) {
        EditText editText1 = (EditText)findViewById(R.id.cal_Number1);
        EditText editText2 = (EditText)findViewById(R.id.cal_Number2);
        String num1  = editText1.getText().toString();
        String num2  = editText2.getText().toString();
        String ans = String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
        EditText editText3 = (EditText)findViewById(R.id.cal_ans);
        editText3.setText(ans);

    }

}