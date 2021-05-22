package com.example.trolley;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.webkit.WebView;

import android.webkit.WebSettings;
import android.view.KeyEvent;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn_map, btn_nfc;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn_map = findViewById(R.id.button_map);
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebPage.class);
                startActivity(intent);
            }
        });
        btn_nfc = findViewById((R.id.button_nfc));
        btn_nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NFCActivity.class);
                startActivity(intent);
            }
        });
    }
}