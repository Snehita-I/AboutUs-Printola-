package com.example.abousus_printola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class ConnectPage extends AppCompatActivity {
    Context ctx;
    String url;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connect_page);
        Bundle extras = getIntent().getExtras();
        String infoUrl = extras.getString("url");
        WebView wv = findViewById(R.id.webview);
        wv.loadUrl(infoUrl);

    }

}