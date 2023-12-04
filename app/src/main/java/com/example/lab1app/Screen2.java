package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Screen2 extends AppCompatActivity {


    private Button btn2;
    private Button changeBack;
    private ConstraintLayout cons1;
    private ImageView img2;
    private Button changeimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        cons1 =findViewById(R.id.cons1);
        img2 = findViewById(R.id.img2);

        btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen2.this, MainActivity.class);
                startActivity(i);

            }
        });

        changeBack = findViewById(R.id.changeBack);
        changeBack.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cons1.setBackgroundColor(Color.MAGENTA);
            }
        });

        changeimg = findViewById(R.id.changeimg);
        changeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2.setImageResource(R.drawable.android_1);
            }
        });


    }
}