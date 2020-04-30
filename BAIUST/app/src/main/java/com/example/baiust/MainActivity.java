package com.example.baiust;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView webobject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webobject = findViewById(R.id.BAIUSTpage);
        WebSettings wsetting = webobject.getSettings();
        wsetting.setJavaScriptEnabled(true);
        webobject.setWebViewClient(new WebViewClient());
        webobject.loadUrl("https://www.baiust.edu.bd/");

    }

    @Override
    public void onBackPressed() {
        if(webobject.canGoBack())
            webobject.goBack();
        else
            super.onBackPressed();
    }
}
