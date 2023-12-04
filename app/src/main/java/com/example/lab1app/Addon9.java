package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;
public class Addon9 extends AppCompatActivity {

    private Button btu_next, btu_prev;
    private ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon9);

        viewFlipper = findViewById(R.id.view_flipper);
        btu_next = findViewById(R.id.btu_next);
        btu_prev = findViewById(R.id.btu_prev);

        btu_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(Addon9.this,R.anim.slide_in_left);
                viewFlipper.setOutAnimation(Addon9.this,R.anim.slide_out_right);
                viewFlipper.showNext();
            }
        });

        btu_prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setInAnimation(Addon9.this,R.anim.slide_in_right);
                viewFlipper.setOutAnimation(Addon9.this,R.anim.slide_out_left);
                viewFlipper.showPrevious();
            }
        });
    }
}