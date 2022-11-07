package com.example.reading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.ToggleButton;

import com.google.android.material.button.MaterialButton;

public class HomeActivity extends AppCompatActivity {

        String[] country = { "India", "USA", "China", "Japan", "Other"};
    private Object AdapterView;
    private Object arg1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        MaterialButton map = (MaterialButton) findViewById(R.id.Loginbtn);
        ToggleButton togglebtn = (ToggleButton) findViewById(R.id.togglebtn);
        WebView web = (WebView)findViewById(R.id.webview) ;
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner.setAdapter(aa);


            togglebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                web.loadUrl("https://www.free-ebooks.net/");
                web.getSettings().setJavaScriptEnabled(true);
                web.setWebViewClient(new WebViewClient());

            }
        });



            map.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(HomeActivity.this, MapsActivity.class));

                }
            });


        }
}