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

public class MainActivityhizlikilo extends AppCompatActivity {
TextView textView5,textView9,textView12,textView21;
Toolbar toolbar4;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityhizlikilo);
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

        textView5 = findViewById(R.id.textView5);
        textView9= findViewById(R.id.textView9);
        textView12=findViewById(R.id.textView12);
        toolbar4 = findViewById(R.id.toolbar4);
        toolbar4.setTitle("");
        setSupportActionBar(toolbar4);

        toolbar4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityhizlikilo.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        textView5.setText("Kahvaltı:\n" +
                "1 kase yarım yağlı yoğurt"+"\n" +"2 yemek kaşığı yulaf ezmesi"+"\n" +"1 porsiyon taze mevsim meyvesi ve toz tarçın  ilave edilerek yapılan yulaf lapası\n" +"\n"+
                "Ara Öğün:\n" +"\n"+
                "1 su bardağı otlu light ayran\n" +"\n"+
                "Öğle Yemeği:\n" +
                "Izgara tavuklu mevsim salata\n" +
                "1 kase pul biberli naneli light yoğurt\n" +
                "1 ince dilim tam buğday ekmeği\n" +"\n"+
                "Ara Öğün:\n" +
                "1 porsiyon meyve\n" +
                "1 kase light yoğurt\n" +"\n"+
                "Akşam Yemeği:\n" +
                "8 yemek kaşığı zeytinyağlı sebze yemeği\n" +
                "Bol salata\n" +
                "1 bardak light ayran\n" +
                "1 ince dilim tam buğday ekmeği\n" +"\n"+
                "Ara Öğün:\n" +
                "1 kase light yoğurt (zencefil+ zerdeçal+ toz tarçın isteğe bağlı olarak ilave edilebilir.)");

        textView9.setText("İlk gün:\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "1 bardak kahve ya da çay\n" +

                "Yarım greyfurt ya da meyve suyu\n" +

                "1 dilim fıstık ezmeli tost ekmeği\n" +"\n"+

                "ÖĞLE YEMEĞİ\n" +
                "\n" +
                "1 bardak çay ya da kahve\n" +

                "100-150 gram roka, domates salatası\n" +"\n"+

                "AKŞAM YEMEĞİ\n" +
                "\n" +
                "1 bardak kahve ya da çay\n" +

                "100 gram ton balığı ya da haşlanmış sığır eti\n" +

                "200 gram yeşil fasulye\n" +

                "1 adet elma\n" +
                "\n" +
                "İkinci gün\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "1 bardak kahve ya da çay\n" +

                "1 adet muz\n" +

                "1 tost ekmeği\n" +

                "1 haşlanmış yumurta\n" +"\n"+

                "ÖĞLE YEMEĞİ\n" +
                "\n" +
                "200 gram ton balığı\n" +

                "5 tane kraker çubuk\n" +

                "1 bardak kahve ya da çay\n" +"\n"+

                "AKŞAM YEMEĞİ\n" +
                "\n" +
                "1 adet muz\n" +

                "100 gram pişmiş havuç\n" +

                "100 gram vanilyalı puding\n" +

                "1 bardak kahve ya da çay\n" +

                "Üçüncü gün:\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "5 kraker\n" +

                "1 adet elma\n" +

                "1 bardak kahve ya da çay\n" +

                "30 gram peynir\n" +"\n"+

                "ÖĞLE YEMEĞİ\n" +

                "1 dilim tost ekmeği\n" +

                "1 bardak kahve ya da çay\n" +

                "1 haşlanmış yumurta\n" +"\n"+

                "AKŞAM YEMEĞİ\n" +
                "\n" +
                "1 bardak kahve ya da çay\n" +

                "100 gram vanilyalı puding\n" +

                "1 tane armut\n" +

                "100 gram pişmiş karnabahar\n" +

                "200 gram ton balığı");

        textView12.setText("KAHVALTI\n" +
                "\n" +
                "✔ 1 adet haşlanmış yumurta\n" +
                "\n" +
                "✔ Dilediğiniz kadar yeşillik\n" +
                "\n" +
                "✔ 5 adet zeytin\n" +
                "\n" +
                "✔ 1 dilim kepek ekmeği\n" +
                "\n" +
                "ARA ÖĞÜN\n" +
                "\n" +
                "✔ 1 bardak şekersiz limonata\n" +
                "\n" +
                "ÖĞLE YEMEĞİ\n" +
                "\n" +
                "✔ 1 kase yağsız yoğurt\n" +
                "\n" +"\n" +
                "✔ 1 avuç ceviz ya da fındık\n" +
                "ARA ÖĞÜN\n" +
                "\n" +
                "✔ 1 bardak limonlu su\n" +
                "\n" +
                "AKŞAM YEMEĞİ\n" +
                "\n" +
                "✔ Bir porsiyon ızgara tavuk/balık/kırmızı et\n" +
                "\n" +
                "✔ Dilediğiniz kadar zeytinyağlı salata\n" + "\n" +
                "YATMADAN ÖNCE\n" +
                "\n" +
                "✔ Bir bardak ılık limonlu su");

    }
}