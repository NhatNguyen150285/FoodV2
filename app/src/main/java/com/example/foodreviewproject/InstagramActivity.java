package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstagramActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        webView = findViewById(R.id.instagramWV);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.instagram.com/khangggne/");
    }
}