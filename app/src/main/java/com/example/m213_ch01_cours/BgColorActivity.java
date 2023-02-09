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

        btnRed.setOnClickListener(new ChangeBgColor());
        btnGreen.setOnClickListener(new ChangeBgColor());
        btnBlue.setOnClickListener(new ChangeBgColor());

        btnRed.setTag(Color.RED);
        btnGreen.setTag(Color.GREEN);
        btnBlue.setTag(Color.BLUE);
    }

    class ChangeBgColor implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Button btn = (Button) v;
            int color = Integer.parseInt(btn.getTag().toString());

            getWindow().getDecorView().setBackgroundColor(color);
        }
    }
}