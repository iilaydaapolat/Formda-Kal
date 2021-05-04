package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivitydiyetler extends AppCompatActivity {
  TextView vejetaryan,dukan,karatay,aralikli,ketojenik;
Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitydiyetler);
        vejetaryan = findViewById(R.id.vejetaryan);
        dukan = findViewById(R.id.dukan);

        karatay=findViewById(R.id.karatay);
        aralikli= findViewById(R.id.aralikli);
        ketojenik = findViewById(R.id.ketojenik);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, MainActivity.class);
                startActivity(intent);
            }
        });

        dukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, Maindukan.class);
                startActivity(intent);
            }
        });

        karatay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, Mainkaratay.class);
                startActivity(intent);
            }
        });
        aralikli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, Mainaraliklioruc.class);
                startActivity(intent);
            }
        });
        ketojenik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, MainKatejonik.class);
                startActivity(intent);
            }
        });
        vejetaryan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydiyetler.this, Mainvejeteryan.class);
                startActivity(intent);
            }
        });
    }


}

