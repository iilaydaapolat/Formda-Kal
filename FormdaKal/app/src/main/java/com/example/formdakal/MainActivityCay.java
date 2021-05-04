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

public class MainActivityCay extends AppCompatActivity {
TextView textView48,textView49,textView56,textView57;
Toolbar toolbar7;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cay);
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
        textView48= findViewById(R.id.textView48);
        textView49=findViewById(R.id.textView49);
        textView56= findViewById(R.id.textView56);
        textView57=findViewById(R.id.textView57);
        toolbar7 = findViewById(R.id.toolbar7);
        toolbar7.setTitle("");
        setSupportActionBar(toolbar7);

        toolbar7.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityCay.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView48.setText("◾Yeşil çay, limon ve maden suyu birlikteliği ile oluşan soda limon çayı, kilo verme sürecinde olanlar için son derece etkili bir çaydır.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "✔Yarım litre kaynar su\n" +
                "✔2 tatlı kaşığı yeşil çay\n" +
                "✔Yarım limon\n" +
                "✔1 şişe maden suyu\n" +
                "Hazırlanışı:\n" +
                "\n" +
                "Yarım litre kaynar suya iki tatlı kaşığı yeşil çayı ilave edin ve 10 dakika demlenmesini bekleyin.\n" +
                "Yarım limonu kaynayan çaya sıkarak kabuğu ile birlikte çayın içine atın.\n" +
                "Ardından maden suyunu da ekleyerek çayı hazır hale getirebilirsiniz.\n" +
                "Her gün öğün aralarında oda sıcaklığında tüketiniz.");
        textView49.setText("◾Yapılan bir araştırmada, saatte bir nane yağı koklayan kişilerin aylık ortalama 2,5 kilogram daha fazla verdiği görülmüştür. Nane kokusu beyinde açlık duygusunu bastıran bir reaksiyonu tetikliyor. Bu sayede kişi yemekle olan ilişkisini daha sağlıklı bir hale getirebiliyor.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "✔10-15 yaprak taze nane\n" +
                "✔1 kupa kaynamış su\n" +
                "✔Tatlandırmak için 1 çay kaşığı bal\n" +
                "Hazırlanışı:\n" +
                "\n" +
                "Elinizde bulunan kupaya kaynamış suyu ve nane yapraklarını koyun.\n" +
                "Üzerini kapatarak demlenmesi için 5-10 dakika kadar bekleyin.\n" +
                "Nane yapraklarını süzerek servise çıkartın ve içerisinde nane yokken balı ilave ederek tüketebilirsiniz.");
        textView56.setText("◾Beyaz çay en doğal ve en sağlıklı çaylardan bir tanesidir. Yapılan bir araştırmada beyaz çayın yağ hücreleri üzerindeki etkileri incelenmiştir. Beyaz çayın içerisinde bulunan EGCG isimli antioksidanın yağlanmayı azaltmada etkili olduğu görülmüştür.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "✔1 kupa kaynamış su\n" +
                "✔1 poşet beyaz çay\n" +
                "✔Şeftali dilimleri\n" +
                "Hazırlanışı:\n" +
                "\n" +
                "Kaynatmış olduğunuz suyun içerisine beyaz çayı ekleyin ve 6-8 dakika demlenmesini bekleyin.\n" +
                "Daha sonra şeftali dilimleri ile servis edebilirsiniz.");
        textView57.setText("◾Yeşil çayın zayıflamaya ve yağ yakmaya olan etkisi şüphesiz ki araştırmalarla kanıtlanmıştır. Yeşil çay zayıflatır mı sorularının cevabı evet olarak verilir. Yeşil çay tüketen insanlarda gözle görülebilir değişimler gözlenmeye devam etmektedir.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "✔1 poşet yeşil çay\n" +
                "✔1 kupa kaynamış su\n" +
                "✔Limon dilimleri\n" +
                "✔1 tutam zencefil tozu\n" +
                "Hazırlanışı:\n" +
                "\n" +
                "Yeşil çayı, limon dilimlerini ve toz zencefili kupanızın içerisine alın.\n" +
                "Kaynamış su ile 3-4 dakika boyunca demleyin.\n" +
                "Daha sonra bir süzgeç yardımı ile süzün.\n" +
                "Oda sıcaklığına geldikten sonra bol buz ve limon dilimleri ile servis edin.");
    }
}