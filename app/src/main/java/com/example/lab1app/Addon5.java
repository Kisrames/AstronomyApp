package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Addon5 extends AppCompatActivity {

    private Button btu_play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon5);

        btu_play = findViewById(R.id.btu_play);

        btu_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(Addon5.this, R.raw.newpluto);
                mp.start();

            }
        });
    }
}