package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Addon4 extends AppCompatActivity {

    private ImageView imageView5,imageView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addon4);

        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);

        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tom@ait.ie"});
                email.putExtra(Intent.EXTRA_SUBJECT, "New Astronomy News!");
                email.putExtra(Intent.EXTRA_TEXT, "Pluto is no longer a planet :(");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Send Mail Using :"));
            }
        });

        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("smsto:2345612345");
                Intent msg = new Intent(Intent.ACTION_SENDTO, uri);
                msg.putExtra("sms_body", "The SMS text");
                startActivity(Intent.createChooser(msg, "Send sms Using :"));
            }
        });
    }
}