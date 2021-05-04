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

public class Mainaraliklioruc extends AppCompatActivity {
TextView textView199,textView766;
Toolbar toolbar13;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_mainaraliklioruc);
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
        textView199=findViewById(R.id.textView199);
        textView766=findViewById(R.id.textView766);
        toolbar13 = findViewById(R.id.toolbar13);
        toolbar13.setTitle("");
        setSupportActionBar(toolbar13);

        toolbar13.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainaraliklioruc.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        textView766.setText("• Aralıklı oruç diyetinin daha uzun yaşamanıza yardımcı olabileceğine dair de bazı kanıtlar vardır. Kemirgenlerde yapılan araştırmalara göre kalori kısıtlamasının ömrü uzatabildiğini göstermektedir. \n" +
                "\n" +
                "• Ayrıca kalp hastalığı, diyabet, kanser, Alzheimer gibi hastalıklara karşı korunmaya yardımcı olabileceği öne sürülüyor.\n" +
                "\n" +
                "• Sağlığını iyileştirirken aynı zamanda hayatı da kolaylaştırır. \n" +
                "\n" +
                "• Planlanması gerekilen ne kadar az öğün olursa, hayat o kadar kolay olacaktır. Günde 3-4+ kez yemek zorunda kalmamak (hazırlık ve temizlik dahil) zaman kazandırır. \n" +
                "\n" +
                "• Çalışmalar, aralıklı açlığın çok güçlü bir kilo verme aracı olabileceğini göstermektedir. Aralıklı oruç diyeti ile insanlar bel çevresinin %4–7'sini de kaybediyorlar ve bu da ciddi derecede karın yağı kaybı demektir.\n" +
                "\n" +
                "• Aralıklı oruç diyetinin diğer standart diyet yöntemlerinden daha az kas kaybına neden olduğu bilinmektedir.");
        textView199.setText("•16-8 diyetinde günün 16 saati oruç tutmak, yani hiçbir şey yememek gerekiyor. Yemek yenebilen 8 saatlik aralık için genelde öğlen 12 ile akşam 8 arası tercih ediliyor.\n" + "\n" +
                "•5-2 diyetinde haftanın arka arkaya olmayan iki günü, günlük alınması gereken kalorinin sadece yüzde 25'i alınıyor.\n" + "\n" +
                "•24 saatlik oruçta da haftanın ya da ihtiyaca göre sadece ayın bir günü hiçbir şey yenmiyor.");
    }
}