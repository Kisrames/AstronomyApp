package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OldFeatures extends AppCompatActivity {

    private Button nbtn1;
    private Button nbtn2;
    private Button nbtn3;
    private Button nbtn4;
    private Button nbtn5;
    private Button nbtn6;
    private Button nbtn7;
    private Button nbtn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_features);

        nbtn1 = findViewById(R.id.nbtn1);
        nbtn2 = findViewById(R.id.nbtn2);
        nbtn3 = findViewById(R.id.nbtn3);
        nbtn4 = findViewById(R.id.nbtn4);
        nbtn5 = findViewById(R.id.nbtn5);
        nbtn6 = findViewById(R.id.nbtn6);
        nbtn7 = findViewById(R.id.nbtn7);
        nbtn8 = findViewById(R.id.nbtn8);


        nbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen2.class);
                startActivity(i);

            }
        });

        nbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen4.class);
                startActivity(i);

            }
        });

        nbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen33.class);
                startActivity(i);

            }
        });

        nbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen5.class);
                startActivity(i);

            }
        });

        nbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_VIEW);
                i.setData(Uri.parse("geo:48.8584,2.2945"));
                startActivity(i);
            }
        });

        nbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent();
                i.setAction(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:" + "999"));
                startActivity(i);
            }
        });

        nbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen6.class);
                startActivity(i);

            }
        });

        nbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OldFeatures.this, Screen7.class);
                startActivity(i);

            }
        });
    }
}