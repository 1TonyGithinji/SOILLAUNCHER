package com.example.anthony.soillauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main2Activity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        webview=(WebView)findViewById(R.id.webview);
        WebSettings settings=webview.getSettings();
        settings.setJavaScriptEnabled(true);
        webview.loadUrl("file:///android_asset/index.html");
    }
}
