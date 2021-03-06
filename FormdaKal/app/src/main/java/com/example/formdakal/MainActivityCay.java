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
        textView48.setText("???Ye??il ??ay, limon ve maden suyu birlikteli??i ile olu??an soda limon ??ay??, kilo verme s??recinde olanlar i??in son derece etkili bir ??ayd??r.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "???Yar??m litre kaynar su\n" +
                "???2 tatl?? ka???????? ye??il ??ay\n" +
                "???Yar??m limon\n" +
                "???1 ??i??e maden suyu\n" +
                "Haz??rlan??????:\n" +
                "\n" +
                "Yar??m litre kaynar suya iki tatl?? ka???????? ye??il ??ay?? ilave edin ve 10 dakika demlenmesini bekleyin.\n" +
                "Yar??m limonu kaynayan ??aya s??karak kabu??u ile birlikte ??ay??n i??ine at??n.\n" +
                "Ard??ndan maden suyunu da ekleyerek ??ay?? haz??r hale getirebilirsiniz.\n" +
                "Her g??n ??????n aralar??nda oda s??cakl??????nda t??ketiniz.");
        textView49.setText("???Yap??lan bir ara??t??rmada, saatte bir nane ya???? koklayan ki??ilerin ayl??k ortalama 2,5 kilogram daha fazla verdi??i g??r??lm????t??r. Nane kokusu beyinde a??l??k duygusunu bast??ran bir reaksiyonu tetikliyor. Bu sayede ki??i yemekle olan ili??kisini daha sa??l??kl?? bir hale getirebiliyor.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "???10-15 yaprak taze nane\n" +
                "???1 kupa kaynam???? su\n" +
                "???Tatland??rmak i??in 1 ??ay ka???????? bal\n" +
                "Haz??rlan??????:\n" +
                "\n" +
                "Elinizde bulunan kupaya kaynam???? suyu ve nane yapraklar??n?? koyun.\n" +
                "??zerini kapatarak demlenmesi i??in 5-10 dakika kadar bekleyin.\n" +
                "Nane yapraklar??n?? s??zerek servise ????kart??n ve i??erisinde nane yokken bal?? ilave ederek t??ketebilirsiniz.");
        textView56.setText("???Beyaz ??ay en do??al ve en sa??l??kl?? ??aylardan bir tanesidir. Yap??lan bir ara??t??rmada beyaz ??ay??n ya?? h??creleri ??zerindeki etkileri incelenmi??tir. Beyaz ??ay??n i??erisinde bulunan EGCG isimli antioksidan??n ya??lanmay?? azaltmada etkili oldu??u g??r??lm????t??r.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "???1 kupa kaynam???? su\n" +
                "???1 po??et beyaz ??ay\n" +
                "?????eftali dilimleri\n" +
                "Haz??rlan??????:\n" +
                "\n" +
                "Kaynatm???? oldu??unuz suyun i??erisine beyaz ??ay?? ekleyin ve 6-8 dakika demlenmesini bekleyin.\n" +
                "Daha sonra ??eftali dilimleri ile servis edebilirsiniz.");
        textView57.setText("???Ye??il ??ay??n zay??flamaya ve ya?? yakmaya olan etkisi ????phesiz ki ara??t??rmalarla kan??tlanm????t??r. Ye??il ??ay zay??flat??r m?? sorular??n??n cevab?? evet olarak verilir. Ye??il ??ay t??keten insanlarda g??zle g??r??lebilir de??i??imler g??zlenmeye devam etmektedir.\n" +
                "\n" +
                "Malzemeler:\n" +
                "\n" +
                "???1 po??et ye??il ??ay\n" +
                "???1 kupa kaynam???? su\n" +
                "???Limon dilimleri\n" +
                "???1 tutam zencefil tozu\n" +
                "Haz??rlan??????:\n" +
                "\n" +
                "Ye??il ??ay??, limon dilimlerini ve toz zencefili kupan??z??n i??erisine al??n.\n" +
                "Kaynam???? su ile 3-4 dakika boyunca demleyin.\n" +
                "Daha sonra bir s??zge?? yard??m?? ile s??z??n.\n" +
                "Oda s??cakl??????na geldikten sonra bol buz ve limon dilimleri ile servis edin.");
    }
}