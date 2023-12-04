package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Addon extends AppCompatActivity {

    private Button btu_db;
    private Button btu_tb;
    private Button btu_rand;
    private Button btu_mail;
    private Button btu_pod;
    private Button btu_solar;
    private Button btu_cal;
    private Button btu_cam;
    private Button btu_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon);

        ActivityOptions options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_out_left,
                R.anim.slide_out_right
        );

        btu_db = findViewById(R.id.btu_db);
        btu_db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, addon1.class);
                startActivity(i);
            }
        });

        btu_tb = findViewById(R.id.btu_tb);
        btu_tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon2.class);
                startActivity(i);
            }
        });
        btu_rand = findViewById(R.id.btu_rand);
        btu_rand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon3.class);
                startActivity(i);
            }
        });

        btu_mail = findViewById(R.id.btu_mail);
        btu_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon4.class);
                startActivity(i);
            }
        });

        btu_pod = findViewById(R.id.btu_pod);
        btu_pod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon5.class);
                startActivity(i);
            }
        });

        btu_solar = findViewById(R.id.btu_solar);
        btu_solar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon6.class);
                startActivity(i);
            }
        });

        btu_cal = findViewById(R.id.btu_cal);
        btu_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon7.class);
                startActivity(i);
            }
        });

        btu_cam = findViewById(R.id.btu_cam);
        btu_cam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon8.class);
                startActivity(i);
            }
        });

        btu_view = findViewById(R.id.btu_view);
        btu_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Addon.this, Addon9.class);
                startActivity(i,options.toBundle());

            }
        });
    }


}