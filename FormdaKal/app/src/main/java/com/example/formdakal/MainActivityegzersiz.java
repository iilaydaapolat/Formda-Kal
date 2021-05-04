package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityegzersiz extends AppCompatActivity {
Toolbar toolbar9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityegzersiz);

        RecyclerView recycler_view;
        toolbar9 = findViewById(R.id.toolbar9);
        toolbar9.setTitle("");
        setSupportActionBar(toolbar9);

        toolbar9.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityegzersiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
      final List<Person> person_list;
        recycler_view = (RecyclerView)findViewById(R.id.recycler_view);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);

        recycler_view.setLayoutManager(layoutManager);

        person_list = new ArrayList<Person>();

        person_list.add(new Person("AEROBİK","30 dakika","204 kcal","30 dakika"));
        person_list.add(new Person("AĞIRLIK ÇALIŞMAK", "30 dakika","135 kcal","yghjk"));
        person_list.add(new Person("ARABA KULLANMAK", "30 dakika","70 kcal","43434"));
        person_list.add(new Person("ATA BİNMEK", "30 dakika","125 kcal","yghjk"));
        person_list.add(new Person("BİLGİSAYAR KULLANMAK", "30 dakika","45 kcal","43434"));
        person_list.add(new Person("BİSİKLETE BİNMEK", "30 dakika","312 kcal","yghjk"));
        person_list.add(new Person("BULAŞIK YIKAMAK", "30 dakika","12 kcal","43434"));
        person_list.add(new Person("DANS ETMEK", "30 dakika","75 kcal","yghjk"));
        person_list.add(new Person("ESNEME HAREKETLERİ", "30 dakika","90 kcal","43434"));
        person_list.add(new Person("FUTBOL OYNAMAK", "30 dakika","240 kcal","yghjk"));
        person_list.add(new Person("İP ATLAMAK", "30 dakika","52 kcal","43434"));
        person_list.add(new Person("KAYAK", "30 dakika","270 kcal","yghjk"));
        person_list.add(new Person("KOŞMAK", "30 dakika","250 kcal","43434"));
        person_list.add(new Person("MERDİVEN ÇIKMAK","30 dakika","36 kcal","yghjk"));
        person_list.add(new Person("TEMİZLİK YAPMAK","30 dakika","105 kcal","43434"));
        person_list.add(new Person("TENİS OYNAMAK", "30 dakika","117 kcal","yghjk"));
        person_list.add(new Person("UYUMAK", "30 dakika","40 kcal","43434"));
        person_list.add(new Person("ÜTÜ YAPMAK", "30 dakika","44 kcal","yghjk"));
        person_list.add(new Person("VOLEYBOL OYNAMAK", "30 dakika","90 kcal","43434"));
        person_list.add(new Person("YÜRÜYÜŞ YAPMAK", "30 dakika","140 kcal","yghjk"));
        person_list.add(new Person("YÜZMEK", "30 dakika","324 kcal","43434"));




        SimpleRecyclerAdapter adapter_items = new SimpleRecyclerAdapter(person_list, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Log.d("position", "Tıklanan Pozisyon:" + position);
                Person person = person_list.get(position);
                Toast.makeText(getApplicationContext(),""+" "+position+" "+"Egzersiz:"+person.getName(),Toast.LENGTH_SHORT).show();
            }
        });
        recycler_view.setHasFixedSize(true);

        recycler_view.setAdapter(adapter_items);

        recycler_view.setItemAnimator(new DefaultItemAnimator());


    }

}
