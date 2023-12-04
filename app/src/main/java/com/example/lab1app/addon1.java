package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class addon1 extends AppCompatActivity {

    private Button btu_store, btu_show;
    private EditText etx1;
    private SharedPreferences sp_database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon1);

        btu_store = findViewById(R.id.btu_store);
        btu_show = findViewById(R.id.btu_show);
        etx1 = findViewById(R.id.etx1);

        btu_store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp_database.edit();
                String txt = etx1.getText().toString();
                editor.putString("key_saved_text", txt);
                editor.commit();
                Toast.makeText(addon1.this, "Data Saved!",Toast.LENGTH_SHORT).show();
            }
        });

        btu_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sp_database = getApplicationContext().getSharedPreferences("table_store_text", MODE_PRIVATE);
                String name = sp_database.getString("key_saved_text", null);
                Toast.makeText(addon1.this, name, Toast.LENGTH_SHORT).show();
            }
        });


    }
}