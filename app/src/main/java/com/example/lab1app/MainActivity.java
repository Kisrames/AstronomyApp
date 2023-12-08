package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btu_old;
    private Button btu_new;
    private Button btu_fin1;
    private Button btu_fin2;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btu_new = findViewById(R.id.btu_new);
        btu_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Addon.class);
                startActivity(i);
            }
        });

        btu_old = findViewById(R.id.btu_old);
        btu_old.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OldFeatures.class);
                startActivity(i);
            }
        });

        btu_fin1 = findViewById(R.id.btu_fin1);
        btu_fin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, solarAnim.class);
                startActivity(i);
            }
        });

        btu_fin2 = findViewById(R.id.btu_fin2);
        btu_fin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, clock.class);
                startActivity(i);
            }
        });

    }
}