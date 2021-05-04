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

public class MainKatejonik extends AppCompatActivity {
TextView textView19,textView76,textView78;
    Toolbar toolbar13;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_katejonik);
        textView19=findViewById(R.id.textView199);
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
                Intent intent = new Intent(MainKatejonik.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        textView76=findViewById(R.id.textView766);
        textView78=findViewById(R.id.textView78);
        textView78.setText("Ekmek\n" +
                "•Pilav, makarna, bulgur\n" +
                "•Yulaf\n" +
                "•Kuru baklagiller\n" +
                "•Süt ve süt ürünleri\n" +
                "•Meyve, bal-pekmez-reçel\n" +
                "•Karbonhidrat içeriği yüksek sebzeler\n" +
                "•Tüm şekerli besinler");
        textView19.setText("KAHVALTI\n" +
                "\n" +
                "•Zeytinyağlı mantarlı omlet\n" +
                "•Hindi füme\n" +
                "•Avokado veya zeytin\n" +
                "•Roka, maydanoz, salatalık\n" + "\n" +
                "ÖĞLEN YEMEĞİ\n" +
                "\n" +
                "•Fırında somon\n" +
                "•Yeşil Salata\n" + "\n" +
                "ARA ÖĞÜN\n" +
                "\n" +
                "•Ceviz veya badem\n" + "\n" +
                "AKŞAM YEMEĞİ\n" +
                "\n" +
                "•Izgara et\n" +
                "•Haşlanmış brokoli ve karnabahar");
        textView76.setText("•Et, tavuk, balık, hindi\n" +
                "•Yumurta\n" +
                "•Peynir\n" +
                "•Yağlı tohumlar\n" +
                "•Avokado\n" +
                "•Zeytin, zeytinyağı\n" +
                "•Hindistan cevizi yağı\n" +
                "•Yeşil yapraklı sebzeler\n" +
                " ");
    }
}