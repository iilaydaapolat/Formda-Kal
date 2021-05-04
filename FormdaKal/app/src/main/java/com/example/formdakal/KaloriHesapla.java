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

public class KaloriHesapla extends AppCompatActivity {
Toolbar toolbar2;


  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_kalori_hesapla);
      toolbar2 = findViewById(R.id.toolbar2);
      toolbar2.setTitle("");
      setSupportActionBar(toolbar2);
      RecyclerView recyclerview;
      toolbar2.setNavigationOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(KaloriHesapla.this, MainActivity.class);
              startActivity(intent);
          }
      });
      final List<Person> person_list;
      recyclerview = (RecyclerView)findViewById(R.id.recyclerview);

      LinearLayoutManager layoutManager = new LinearLayoutManager(this);

      layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
      layoutManager.scrollToPosition(0);

      recyclerview.setLayoutManager(layoutManager);

      person_list = new ArrayList<Person>();

      person_list.add(new Person("Bal","100 gram","307 kcal",""));
      person_list.add(new Person("Beyaz Peynir", "100 gram","275 kcal",""));
      person_list.add(new Person("Dil Peyniri", "100 gram","271 kcal","43434"));
      person_list.add(new Person("Kaymak", "100 gram","624 kcal","yghjk"));
      person_list.add(new Person("Kaşar Peyniri", "100 gram","413 kcal","43434"));
      person_list.add(new Person("Marmelat", "100 gram","280 kcal","yghjk"));
      person_list.add(new Person("Müsli", "1 yk","30 kcal","43434"));
      person_list.add(new Person("Pastırma", "100 gram","250 kcal","yghjk"));
      person_list.add(new Person("Pekmez", "1 yk","60 kcal","43434"));
      person_list.add(new Person("Poğaça", "1 adet","180 kcal","yghjk"));
      person_list.add(new Person("Reçel", "1 yk","50 kcal","43434"));
      person_list.add(new Person("Salam", "100 gram","446 kcal","yghjk"));
      person_list.add(new Person("Simit", "1 adet","280 kcal","43434"));
      person_list.add(new Person("Siyah Zeytin","1 adet","9 kcal","yghjk"));
      person_list.add(new Person("Sosis","1 adet","190 kcal","43434"));
      person_list.add(new Person("Sucuk", "100 gram","450 kcal","yghjk"));
      person_list.add(new Person("Tereyağı", "100 gram","754 kcal","43434"));
      person_list.add(new Person("Süt", "100 ml","68 kcal","yghjk"));
      person_list.add(new Person("Yoğurt", "100 ml","95 kcal","43434"));
      person_list.add(new Person("Yumurta", "1 adet","80 kcal","yghjk"));
      person_list.add(new Person("Dolma", "220 gram","226 kcal","43434"));
      person_list.add(new Person("Bulgur Pilavı","175 gram","291 kcal",""));
      person_list.add(new Person("Fırında Patates", "100 gram","109 kcal",""));
      person_list.add(new Person("Güveç","250 gram","461 kcal",""));
      person_list.add(new Person("Hamburger", "1 adet","260 kcal",""));
      person_list.add(new Person("Izgara Köfte","160 gram","309 kcal",""));
      person_list.add(new Person("Karnıyarık", "220 gram","270 kcal",""));
      person_list.add(new Person("Kumpir","1 adet","685 kcal",""));
      person_list.add(new Person("Kuru Fasülye", "250 gram","336 kcal",""));
      person_list.add(new Person("Bezelye","250 gram","298 kcal",""));
      person_list.add(new Person("Mercimek Çorbası", "1 tabak","183 kcal",""));
      person_list.add(new Person("Nohut","100 gram","96 kcal",""));
      person_list.add(new Person("Patates Kızartması", "100 gram","222 kcal",""));
      person_list.add(new Person("Patates Püresi","100 gram","77 kcal",""));
      person_list.add(new Person("Patlıcan Musakka", "250 gram","201 kcal",""));
      person_list.add(new Person("Pizza","küçüy boy","620 kcal",""));
      person_list.add(new Person("Türlü", "250 gram","238 kcal",""));
      person_list.add(new Person("Yayla Çorbası","1 porsiyon","115 kcal",""));
      person_list.add(new Person("Yeşil Mercimek", "100 gram","332 kcal",""));
      person_list.add(new Person("Zeytinyağlı Barbunya","230 gram","328 kcal",""));
      person_list.add(new Person("Zeytinyağlı Enginar", "1 porsiyon","170 kcal",""));
      person_list.add(new Person("Zeytinyağlı Fasülye","1 porsiyon","177 kcal",""));
      person_list.add(new Person("İzmir Köfte", "250 gram","343 kcal",""));
      person_list.add(new Person("Bakla","100 gram","72 kcal",""));
      person_list.add(new Person("Bamya", "100 gram","36 kcal",""));
      person_list.add(new Person("Bezelye","100 gram","89kcal",""));
      person_list.add(new Person("Brokoli", "100 gram","35 kcal",""));
      person_list.add(new Person("Börülce","100 gram","120 kcal",""));
      person_list.add(new Person("Domates", "1 adet","14 kcal",""));
      person_list.add(new Person("Havuç","100 gram","35 kcal",""));
      person_list.add(new Person("Kabak", "100 gram","25 kcal",""));
      person_list.add(new Person("Kara Lahana","100 gram","49 kcal",""));
      person_list.add(new Person("Mantar", "100 gram","14 kcal",""));
      person_list.add(new Person("Marul","100 gram","15 kcal",""));
      person_list.add(new Person("Maydanoz", "100 gram","9 kcal",""));
      person_list.add(new Person("Pancar","1 adet","34 kcal",""));
      person_list.add(new Person("Patates", "100 gram","100 kcal",""));
      person_list.add(new Person("Patlıcan","1 adet","28 kcal",""));
      person_list.add(new Person("Roka", "100 gram","31 kcal",""));
      person_list.add(new Person("Salatalık","1 adet","11 kcal",""));
      person_list.add(new Person("Semizotu", "100 gram","32 kcal",""));
      person_list.add(new Person("Soğan","100 gram","35 kcal",""));
      person_list.add(new Person("Tere", "100 gram","32 kcal",""));
      person_list.add(new Person("Turp","100 gram","20 kcal",""));
      person_list.add(new Person("Yeşil Biber", "100 gram","10 kcal",""));
      person_list.add(new Person("Ananas","100 gram","57 kcal",""));
      person_list.add(new Person("Ayva", "1 adet","142 kcal",""));
      person_list.add(new Person("Armut","1 adet","70 kcal",""));
      person_list.add(new Person("Böğürtlen", "100 gram","58 kcal",""));
      person_list.add(new Person("Dut","100 gram","93 kcal",""));
      person_list.add(new Person("Elma", "1 adet","70 kcal",""));
      person_list.add(new Person("Erik","1 adet","8 kcal",""));
      person_list.add(new Person("Karpuz", "1 dilim","100 kcal",""));
      person_list.add(new Person("Kavun", "1 dilim","40 kcal",""));
      person_list.add(new Person("Kayısı","1 adet","8 kcal",""));
      person_list.add(new Person("Kivi", "1 adet","34 kcal",""));
      person_list.add(new Person("Limon", "1 adet","27 kcal",""));
      person_list.add(new Person("Mandalina","1 adet","50 kcal",""));
      person_list.add(new Person("Muz", "1 adet","95 kcal",""));
      person_list.add(new Person("Nar", "100 gram","63 kcal",""));
      person_list.add(new Person("Portakal","1 adet","50 kcal",""));
      person_list.add(new Person("Vişne", "100 gram","55 kcal",""));
      person_list.add(new Person("Çilek", "100 gram","26 kcal",""));
      person_list.add(new Person("Üzüm","100 gram","57 kcal",""));
      person_list.add(new Person("İncir", "100 gram","41 kcal",""));
      person_list.add(new Person("Şeftali", "1 adet","50 kcal",""));
      person_list.add(new Person("Erik","1 adet","8 kcal",""));
      person_list.add(new Person("Karpuz", "1 dilim","100 kcal",""));



      SimpleRecyclerAdapterbesin adapter_items = new SimpleRecyclerAdapterbesin(person_list, new CustomItemClickListener() {
          @Override
          public void onItemClick(View v, int position) {
              Log.d("position", "Tıklanan Pozisyon:" + position);
              Person person = person_list.get(position);
              Toast.makeText(getApplicationContext(),""+" "+position+" "+"Egzersiz:"+person.getName(),Toast.LENGTH_SHORT).show();
          }
      });
      recyclerview.setHasFixedSize(true);

   recyclerview.setAdapter(adapter_items);

     recyclerview.setItemAnimator(new DefaultItemAnimator());


  }

}


