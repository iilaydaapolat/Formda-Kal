package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivitynotekle extends AppCompatActivity {
    EditText editText;

    SQLiteDatabase database;
    Toolbar toolbar10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitynotekle);


        editText = findViewById(R.id.editText);
        toolbar10= findViewById(R.id.toolbar10);
        toolbar10.setTitle("");

        setSupportActionBar(toolbar10);

        toolbar10.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitynotekle.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
       public void Button(View view){
        Intent intent = new Intent(MainActivitynotekle.this,MainActivitynotdefteri.class);
        startActivity(intent);
            String artName = editText.getText().toString();
     try{
 SQLiteDatabase database = this.openOrCreateDatabase("Arts",MODE_PRIVATE,null);
 database.execSQL("CREATE TABLE IF NOT EXISTS arts(artname VARCHAR)");

    String sql = "INSERT INTO arts (artname) VALUES (?)";
    SQLiteStatement sqLiteStatement = database.compileStatement(sql);
    sqLiteStatement.bindString(1,artName);
    sqLiteStatement.execute();
     }catch (Exception e){


        }
     finish();
    }}
