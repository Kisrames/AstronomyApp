package com.example.lab1app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class solarAnim extends AppCompatActivity {

    public WebView WebViewNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_anim);

        WebViewNew = findViewById(R.id.WebViewNew);
        WebViewNew.getSettings().setJavaScriptEnabled(true);
        WebViewNew.setWebViewClient(new WebViewClient());
        WebViewNew.loadUrl("https://solar-system-svg.netlify.app");
    }
}