package com.example.reading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = (EditText) findViewById(R.id.inputEmail);
        EditText password = (EditText) findViewById(R.id.inputPassword);
        DatePicker date = (DatePicker) findViewById(R.id.date);
        MaterialButton signin = (MaterialButton) findViewById(R.id.SignIn);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent();
            }
        });

    }


    private void intent(){

        Intent switchActivityIntent = new Intent(this, HomeActivity.class);
        startActivity(switchActivityIntent);


    }
}