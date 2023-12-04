package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class Screen4 extends AppCompatActivity {

    private int counter = 0;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);


        progressBar = findViewById(R.id.progressBar);

        Timer t  = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                //   counter = counter + 5;
                progressBar.setProgress(counter);

                if(counter == 100) {
                    t.cancel();
                    Intent i = new Intent(Screen4.this,MainActivity.class);
                    startActivity(i);
                }
            }
        };
        t.schedule(tt,0,100);

    }
}