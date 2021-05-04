package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivitynotdefteri extends AppCompatActivity {
 Button buttonekle;
ListView listview;
ArrayAdapter arrayAdapter;
ArrayList<String>nameArray;
Toolbar toolbar11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitynotdefteri);
listview= findViewById(R.id.listview);
buttonekle =findViewById(R.id.buttonekle);

        toolbar11 = findViewById(R.id.toolbar11);
        toolbar11.setTitle("");
        setSupportActionBar(toolbar11);

        toolbar11.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitynotdefteri.this,MainActivitynotekle.class);
                startActivity(intent);
            }
        });

nameArray = new ArrayList<>();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_checked,nameArray);


        listview.setAdapter(arrayAdapter);
  getData();
        buttonekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitynotdefteri.this, MainActivitynotekle.class);
                startActivity(intent);
            }
        });
    }
    
    public void getData() {
        try {
            SQLiteDatabase database = this.openOrCreateDatabase("Arts", MODE_PRIVATE, null);
            Cursor cursor = database.rawQuery("SELECT* FROM arts", null);
            int noteIx = cursor.getColumnIndex("artname");
            while (cursor.moveToNext()) {
                nameArray.add(cursor.getString(noteIx));
            }
            arrayAdapter.notifyDataSetChanged();
            cursor.close();
        }catch (Exception e) {
        }
        }
    }
