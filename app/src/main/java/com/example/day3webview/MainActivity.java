package com.example.day3webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.wb);

        webView.setWebViewClient(new WebViewClient()); // needs to open every site inside your app

        webView.loadUrl("https://www.Google.com");   //it needs permissions and need to go in Android Manifest  ---> <uses-permission android:name="android.permission.INTERNET"></uses-permission>



    }
}