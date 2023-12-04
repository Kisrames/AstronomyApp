package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Screen33 extends AppCompatActivity {

    private Button btu;
    private RadioGroup radioChoiceGroup;
    private RadioButton choiceSelected;

    private TextView tv;
    private EditText etx;
    private Button gback;
    private Button npage;
    private Button color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen33);

        btu = findViewById(R.id.btn1);
        etx = findViewById(R.id.editText);
        tv = findViewById(R.id.textView);
        gback = findViewById(R.id.goback);
        npage = findViewById(R.id.btn3);

        radioChoiceGroup = findViewById(R.id.radioChoiceGroup);
        color = findViewById(R.id.button5);

         color.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 int selectedId = radioChoiceGroup.getCheckedRadioButtonId();
                 choiceSelected = findViewById(selectedId);
                 Toast.makeText(Screen33.this, choiceSelected.getText(), Toast.LENGTH_SHORT).show();
             }
         });


        btu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(etx.getText());
            }
        });

        gback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen33.this, MainActivity.class);
                startActivity(i);
            }
        });

        npage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Screen33.this, Screen333.class);
                String myText = etx.getText().toString();
                i.putExtra("TextToSend", myText);
                startActivity(i);
            }
        });
    }
}