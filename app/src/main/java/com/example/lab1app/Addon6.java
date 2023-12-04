package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
public class Addon6 extends AppCompatActivity {

    private ListView listview;
    private ArrayList<String> planets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon6);

        listview = findViewById(R.id.listview);

        planets = new ArrayList<String>();
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        ArrayAdapter<String> planetsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                planets
        );

        listview.setAdapter(planetsAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(Addon6.this,planets.get(i), Toast.LENGTH_SHORT).show();


            }
        });
    }
}