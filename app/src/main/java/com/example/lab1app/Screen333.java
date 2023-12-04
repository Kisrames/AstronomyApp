package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Screen333 extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen333);

        tv = findViewById(R.id.tv);

        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("TextToSend");
            tv.setText(sentText);
        }catch ( RuntimeException e ){

           e.printStackTrace();

        }

    }
}