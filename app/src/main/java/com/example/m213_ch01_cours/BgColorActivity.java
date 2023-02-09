package com.example.m213_ch01_cours;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BgColorActivity extends AppCompatActivity {
    Button btnRed, btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bg_color);

        btnRed = findViewById(R.id.btnRed);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);
    }

    public void changeBgColor(View view) {
        Button btn = (Button) view;

        if (btn.equals(btnRed))
            getWindow().getDecorView().setBackgroundColor(Color.RED);
        else if (btn.equals(btnGreen))
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        else if (btn.equals(btnBlue))
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
    }
}