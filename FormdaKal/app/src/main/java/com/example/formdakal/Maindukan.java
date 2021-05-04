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
        textView71.setText("Kahvaltı: 2 yemek kaşığı Yulaf ezmesi ve yağsız süt ile hazırlanmış karışım\n" +
                "\n" +

                "Öğlen: 150 gram kıyma ile hazırlanmış omlet, 2 yumurta ile\n" +
                "\n" +
                "Akşam: 3 adet yumurta (3 damla sıvı yağ ile hazırlanmış), 1 paket sade quark");
        textView67.setText("Kahvaltı: 2 adet haşlanmış yumurta, (yağsız süt ve dana jambon ile hazırlanmış yağsız yumurta)\n" +
                "\n" +
                "Öğlen: Yağsız beyaz peynir ve 2 dilim dana jambon, 1 paket sade quark\n" +
                "\n" +
                "Akşam: Izgara Dana eti (3 damla sıvı yağ, soya sosu, zencefil, sarımsak, karanfil, karabiber ile sos hazırlanabilir)");
        textView69.setText("Kahvaltı: 1 kase yağsız yoğurt, 1,5 yemek kaşığı yulaf ezmesi ( karıştırarak tüketilir )\n" +

                "Öğlen: 200 gr Kuşbaşı doğranmış tavuk göğüs, 1 paket sade quark ( içerisine1,5 yemek kaşığı yulaf ezmesi eklenmiş)\n" +
                "\n" +
                "Akşam: Izgara Balık (3 damla sıvı yağ ile hazırlanmış), doğranmış yeşillik salatası");
textView73.setText("Kahvaltı: 2 yumurta, 1,5 yemek kaşığı yulaf ezmesi ve yağsız süt ile hazırlanmış omlet\n" +
        "\n" +
        "Öğlen: 2 yumurta ile hazırlanmış 1 yemek kaşığı zeytinyağlı salata\n" +
        "\n" +
        "Akşam: 200 gr somon balığı, haşlanmış kuşkonmaz veya brokoli");
textView75.setText("Kahvaltı: 2 yumurta ile hazırlanmış yulaflı omlet ( 2 yemek kaşığı yulaf )\n" +
        "\n" +
        "Öğlen: 200 gr Kuşbaşı doğranmış tavuk göğüs, 1 paket sade quark\n" +
        "\n" +
        "Akşam: Izgara Balık (3 damla sıvı yağ ile hazırlanmış), doğranmış yeşillik salatası\n" +
        "\n" +
        "\n");
    }
}