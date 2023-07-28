package com.anup.customtoaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Hello Parent Toast", Toast.LENGTH_LONG).show();
        TextView txt = findViewById(R.id.welcomeText);
        txt.setText(Util.addString("Welcome ", "Anup"));



    }
}