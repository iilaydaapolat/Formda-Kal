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
                "???Pilav, makarna, bulgur\n" +
                "???Yulaf\n" +
                "???Kuru baklagiller\n" +
                "???S??t ve s??t ??r??nleri\n" +
                "???Meyve, bal-pekmez-re??el\n" +
                "???Karbonhidrat i??eri??i y??ksek sebzeler\n" +
                "???T??m ??ekerli besinler");
        textView19.setText("KAHVALTI\n" +
                "\n" +
                "???Zeytinya??l?? mantarl?? omlet\n" +
                "???Hindi f??me\n" +
                "???Avokado veya zeytin\n" +
                "???Roka, maydanoz, salatal??k\n" + "\n" +
                "????LEN YEME????\n" +
                "\n" +
                "???F??r??nda somon\n" +
                "???Ye??il Salata\n" + "\n" +
                "ARA ??????N\n" +
                "\n" +
                "???Ceviz veya badem\n" + "\n" +
                "AK??AM YEME????\n" +
                "\n" +
                "???Izgara et\n" +
                "???Ha??lanm???? brokoli ve karnabahar");
        textView76.setText("???Et, tavuk, bal??k, hindi\n" +
                "???Yumurta\n" +
                "???Peynir\n" +
                "???Ya??l?? tohumlar\n" +
                "???Avokado\n" +
                "???Zeytin, zeytinya????\n" +
                "???Hindistan cevizi ya????\n" +
                "???Ye??il yaprakl?? sebzeler\n" +
                " ");
    }
}