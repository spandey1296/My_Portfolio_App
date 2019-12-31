package com.example.my_portfolio_app;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
            private WebView myWebView;






    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window w = getWindow(); // in Activity's onCreate() for instance
        w.setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);


        setContentView(R.layout.activity_main);
           myWebView=(WebView)findViewById(R.id.webView);
        WebSettings webSettings=myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://spandey1296.github.io");
        myWebView.setWebViewClient(new WebViewClient());




    }

    @Override

    public void onBackPressed(){

        if(myWebView.canGoBack())
        {
            myWebView.goBack();
        }
        else
        {
            super.onBackPressed();
        }


    }






}


