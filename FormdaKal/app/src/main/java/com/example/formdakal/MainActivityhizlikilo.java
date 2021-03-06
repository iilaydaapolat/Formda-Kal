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
        textView5.setText("Kahvalt??:\n" +
                "1 kase yar??m ya??l?? yo??urt"+"\n" +"2 yemek ka???????? yulaf ezmesi"+"\n" +"1 porsiyon taze mevsim meyvesi ve toz tar????n  ilave edilerek yap??lan yulaf lapas??\n" +"\n"+
                "Ara ??????n:\n" +"\n"+
                "1 su barda???? otlu light ayran\n" +"\n"+
                "????le Yeme??i:\n" +
                "Izgara tavuklu mevsim salata\n" +
                "1 kase pul biberli naneli light yo??urt\n" +
                "1 ince dilim tam bu??day ekme??i\n" +"\n"+
                "Ara ??????n:\n" +
                "1 porsiyon meyve\n" +
                "1 kase light yo??urt\n" +"\n"+
                "Ak??am Yeme??i:\n" +
                "8 yemek ka???????? zeytinya??l?? sebze yeme??i\n" +
                "Bol salata\n" +
                "1 bardak light ayran\n" +
                "1 ince dilim tam bu??day ekme??i\n" +"\n"+
                "Ara ??????n:\n" +
                "1 kase light yo??urt (zencefil+ zerde??al+ toz tar????n iste??e ba??l?? olarak ilave edilebilir.)");

        textView9.setText("??lk g??n:\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "1 bardak kahve ya da ??ay\n" +

                "Yar??m greyfurt ya da meyve suyu\n" +

                "1 dilim f??st??k ezmeli tost ekme??i\n" +"\n"+

                "????LE YEME????\n" +
                "\n" +
                "1 bardak ??ay ya da kahve\n" +

                "100-150 gram roka, domates salatas??\n" +"\n"+

                "AK??AM YEME????\n" +
                "\n" +
                "1 bardak kahve ya da ??ay\n" +

                "100 gram ton bal?????? ya da ha??lanm???? s??????r eti\n" +

                "200 gram ye??il fasulye\n" +

                "1 adet elma\n" +
                "\n" +
                "??kinci g??n\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "1 bardak kahve ya da ??ay\n" +

                "1 adet muz\n" +

                "1 tost ekme??i\n" +

                "1 ha??lanm???? yumurta\n" +"\n"+

                "????LE YEME????\n" +
                "\n" +
                "200 gram ton bal??????\n" +

                "5 tane kraker ??ubuk\n" +

                "1 bardak kahve ya da ??ay\n" +"\n"+

                "AK??AM YEME????\n" +
                "\n" +
                "1 adet muz\n" +

                "100 gram pi??mi?? havu??\n" +

                "100 gram vanilyal?? puding\n" +

                "1 bardak kahve ya da ??ay\n" +

                "??????nc?? g??n:\n" +
                "\n" +
                "KAHVALTI\n" +
                "\n" +
                "5 kraker\n" +

                "1 adet elma\n" +

                "1 bardak kahve ya da ??ay\n" +

                "30 gram peynir\n" +"\n"+

                "????LE YEME????\n" +

                "1 dilim tost ekme??i\n" +

                "1 bardak kahve ya da ??ay\n" +

                "1 ha??lanm???? yumurta\n" +"\n"+

                "AK??AM YEME????\n" +
                "\n" +
                "1 bardak kahve ya da ??ay\n" +

                "100 gram vanilyal?? puding\n" +

                "1 tane armut\n" +

                "100 gram pi??mi?? karnabahar\n" +

                "200 gram ton bal??????");

        textView12.setText("KAHVALTI\n" +
                "\n" +
                "??? 1 adet ha??lanm???? yumurta\n" +
                "\n" +
                "??? Diledi??iniz kadar ye??illik\n" +
                "\n" +
                "??? 5 adet zeytin\n" +
                "\n" +
                "??? 1 dilim kepek ekme??i\n" +
                "\n" +
                "ARA ??????N\n" +
                "\n" +
                "??? 1 bardak ??ekersiz limonata\n" +
                "\n" +
                "????LE YEME????\n" +
                "\n" +
                "??? 1 kase ya??s??z yo??urt\n" +
                "\n" +"\n" +
                "??? 1 avu?? ceviz ya da f??nd??k\n" +
                "ARA ??????N\n" +
                "\n" +
                "??? 1 bardak limonlu su\n" +
                "\n" +
                "AK??AM YEME????\n" +
                "\n" +
                "??? Bir porsiyon ??zgara tavuk/bal??k/k??rm??z?? et\n" +
                "\n" +
                "??? Diledi??iniz kadar zeytinya??l?? salata\n" + "\n" +
                "YATMADAN ??NCE\n" +
                "\n" +
                "??? Bir bardak ??l??k limonlu su");

    }
}