package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private Button btu_yt;
    private Button btu_maps;
    private Button btu_phone;
    private Button prog;
    private Button btnn;
    private Button btu_scroll;
    private Button btu_new;

    private Button astro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnn = findViewById(R.id.btn2);

        astro = findViewById(R.id.button3);
        astro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen5.class);
                startActivity(i);
            }
        });

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen2.class);
                startActivity(i);

            }
        });

        prog = findViewById(R.id.button2);
        prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen4.class);
                startActivity(i);
            }
        });

        btnn = findViewById(R.id.btn2);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen33.class);
                startActivity(i);
            }
        });

        btu_maps = findViewById(R.id.button4);
        btu_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:48.8584,2.2945"));
                startActivity(i);
            }
        });

        btu_phone = findViewById(R.id.button6);
        btu_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "999"));
                startActivity(i);
            }
        });

        btu_scroll = findViewById(R.id.button7);
        btu_scroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen6.class);
                startActivity(i);
            }
        });

        btu_yt = findViewById(R.id.button8);
        btu_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Screen7.class);
                startActivity(i);
            }
        });

        btu_new = findViewById(R.id.btu_new);
        btu_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Addon.class);
                startActivity(i);
            }
        });

    }
}