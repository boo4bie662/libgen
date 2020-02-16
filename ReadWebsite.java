package com.example.infogenesis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.EditText;


public class ReadWebsite extends AppCompatActivity {
    public String userInput;
    public String readWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_website);
        EditText editText = findViewById(R.id.editText);
        userInput = editText.getText().toString();
        WebView webView = findViewById(R.id.website);
        webView.loadUrl(userInput);

    }

}

