package com.example.foodreviewproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FacebookActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);

        webView = findViewById(R.id.facebookWV);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/cryingc0w");
    }
}