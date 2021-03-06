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

public class Maindukan extends AppCompatActivity {
TextView textView67,textView69,textView71,textView73,textView75;
Toolbar toolbar14;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maindukan);
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
        textView67= findViewById(R.id.textView67);
        textView69= findViewById(R.id.textView69);
        textView71=findViewById(R.id.textView71);
        textView73= findViewById(R.id.textView73);
        textView75=findViewById(R.id.textView75);
        toolbar14 = findViewById(R.id.toolbar14);
        toolbar14.setTitle("");
        setSupportActionBar(toolbar14);

        toolbar14.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Maindukan.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        textView71.setText("Kahvalt??: 2 yemek ka???????? Yulaf ezmesi ve ya??s??z s??t ile haz??rlanm???? kar??????m\n" +
                "\n" +

                "????len: 150 gram k??yma ile haz??rlanm???? omlet, 2 yumurta ile\n" +
                "\n" +
                "Ak??am: 3 adet yumurta (3 damla s??v?? ya?? ile haz??rlanm????), 1 paket sade quark");
        textView67.setText("Kahvalt??: 2 adet ha??lanm???? yumurta, (ya??s??z s??t ve dana jambon ile haz??rlanm???? ya??s??z yumurta)\n" +
                "\n" +
                "????len: Ya??s??z beyaz peynir ve 2 dilim dana jambon, 1 paket sade quark\n" +
                "\n" +
                "Ak??am: Izgara Dana eti (3 damla s??v?? ya??, soya sosu, zencefil, sar??msak, karanfil, karabiber ile sos haz??rlanabilir)");
        textView69.setText("Kahvalt??: 1 kase ya??s??z yo??urt, 1,5 yemek ka???????? yulaf ezmesi ( kar????t??rarak t??ketilir )\n" +

                "????len: 200 gr Ku??ba???? do??ranm???? tavuk g??????s, 1 paket sade quark ( i??erisine1,5 yemek ka???????? yulaf ezmesi eklenmi??)\n" +
                "\n" +
                "Ak??am: Izgara Bal??k (3 damla s??v?? ya?? ile haz??rlanm????), do??ranm???? ye??illik salatas??");
textView73.setText("Kahvalt??: 2 yumurta, 1,5 yemek ka???????? yulaf ezmesi ve ya??s??z s??t ile haz??rlanm???? omlet\n" +
        "\n" +
        "????len: 2 yumurta ile haz??rlanm???? 1 yemek ka???????? zeytinya??l?? salata\n" +
        "\n" +
        "Ak??am: 200 gr somon bal??????, ha??lanm???? ku??konmaz veya brokoli");
textView75.setText("Kahvalt??: 2 yumurta ile haz??rlanm???? yulafl?? omlet ( 2 yemek ka???????? yulaf )\n" +
        "\n" +
        "????len: 200 gr Ku??ba???? do??ranm???? tavuk g??????s, 1 paket sade quark\n" +
        "\n" +
        "Ak??am: Izgara Bal??k (3 damla s??v?? ya?? ile haz??rlanm????), do??ranm???? ye??illik salatas??\n" +
        "\n" +
        "\n");
    }
}