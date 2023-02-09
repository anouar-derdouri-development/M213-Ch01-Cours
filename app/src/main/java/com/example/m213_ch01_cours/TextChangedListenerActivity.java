package com.example.m213_ch01_cours;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class TextChangedListenerActivity extends AppCompatActivity {
    EditText etMessage;
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_changed_listener);

        etMessage = findViewById(R.id.etMessage);
        tvMessage = findViewById(R.id.tvMessage);

        etMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
//                tvMessage.setText(etMessage.getText());
                tvMessage.setText(s);
            }
        });
    }
}