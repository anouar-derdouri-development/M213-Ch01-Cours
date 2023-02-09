package com.example.m213_ch01_cours;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ShowMessageActivity extends AppCompatActivity {
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //region AlertDialog

//                AlertDialog.Builder builder = new AlertDialog.Builder(ShowMessageActivity.this);

//                builder.setTitle("Greetings");
//                builder.setMessage("Salam");
//                builder.setIcon(android.R.drawable.ic_dialog_info);
//                builder.show();

//                builder.setTitle("Greetings")
//                        .setMessage("Salam")
//                        .setIcon(android.R.drawable.ic_dialog_alert).show();

                //endregion

                //region Snackbar

                Snackbar snackbar = Snackbar.make(btnShow, "Salam", Snackbar.LENGTH_INDEFINITE);

                snackbar.setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(ShowMessageActivity.this, "GOOD", Toast.LENGTH_SHORT).show();
                    }
                });

                snackbar.show();

                //endregion
            }
        });
    }
}