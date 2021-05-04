package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Mainvejeteryan extends AppCompatActivity {
TextView textView199,textView64;
Toolbar toolbar13;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainvejeteryan);
        textView199= findViewById(R.id.textView199);
        textView64= findViewById(R.id.textView64);
        toolbar13 = findViewById(R.id.toolbar13);
        toolbar13.setTitle("");
        setSupportActionBar(toolbar13);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        toolbar13.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainvejeteryan.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        textView64.setText("•Ağırlıklı olarak sıvı gıdalar, çorbalar, sebzeler tüketilmelidir.\n" +
                "•Vejeteryan diyeti listesini uygularken egzersiz hareketleri ile desteklerseniz istediğiniz kilolara daha kolay ulaşabilirsiniz. ");
        textView199.setText("Kahvaltı:\n" + "\n"+
                "Bir fincan yeşil çay\n" +
                "Yağsız peynir (1 dilim)\n" +
                "Zeytin (5 adet)\n" +
                "Yumurta (haşlanmış olsun)\n" +
                "marul, tere, semiz otundan yapılmış salata\n" +
                "İki dilim kepekli ekmek.\n" +"\n"+
                "Ara Öğünler:\n" +"\n"+
                "Domates, salatalık, tere, semiz otu, maydanoz, marul ile yapılmış mevsim salata.\n" +
                "Vejeteryan Diyeti Öğle Yemeği\n" +
                "Lahana Çorbası\n" +
                "1 kase yoğurt\n" +
                "iki dilim çavdar\n" +
                "Mevsim salata\n" +"\n"+
                "Akşam:\n" +"\n"+
                "Taze fasulye yemeği\n" +
                "3 yemek kaşığı pilav\n" +
                "yoğurt 1 kase olacak\n" +
                "Sebze mevsim salatası\n" +
                "Yatmadan Önce:\n" +"\n"+"\n"+
                "Yeşil çay\n" +
                "Alternatif olarak yağsız sütte içilebilir.");
    }
}