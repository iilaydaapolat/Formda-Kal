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

public class MainActivitydetox extends AppCompatActivity {
TextView textView45,textView47,textView51,textView53;
Toolbar toolbar3;
private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitydetox);
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
        textView45=findViewById(R.id.textView45);
        textView47=findViewById(R.id.textView47);
        textView51= findViewById(R.id.textView51);
        textView53= findViewById(R.id.textView53);

        toolbar3 = findViewById(R.id.toolbar3);
        toolbar3.setTitle("");
        setSupportActionBar(toolbar3);

        toolbar3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitydetox.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView45.setText("◾Detoks diyeti yaparken günde en az 2 litre su içmeniz gerekir.\n" + "\n" +
                "◾Detoks diyetinin amaçlarından biri de ödem atmaktır. Bu yüzden kafeinli içeceklerden uzak durmakta fayda var. Kahve, yeşil çay gibi içecekler kafein içerir. Detoks diyetinde kahve içilmemesi gerekir.\n" + "\n" +
                "◾Tuz tüketimi vücudun ödem tutmasına sebep olur ve vücuttan su atılmasına engeldir. Bu yüzden detoks diyetinde tuzu tamamen hayatınızdan çıkarmanız veya mümkün olduğunca azaltmanız gerekir.\n" + "\n" +
                "◾Hazırlanan detoks sıvıları ile günde 6 öğün beslenilmesi önerilir. 3 ana öğün, 3 de ara öğün olmak üzere günde 6 öğün tüketmek detoks diyeti için idealdir.\n" + "\n" +
                "◾Detoks diyetinde en çok tüketilen besinler meyve ve sebzelerdir. Gün içerisinde yaklaşık 5 veya 6 adet orta boy meyve yemeniz tavsiye edilir.");
        textView47.setText("Malzemeler: \n" +
                "\n" +
                " ✔ Maydanoz\n" +
                "\n" +
                " ✔ Kırmızı kapya biber\n" +
                "\n" +
                " ✔ Yarım Elma ( kırmızı, yeşil veya sarı tercih edebilirsiniz )\n" +
                "\n" +
                " ✔ Havuç ( 2 orta boy )\n" +
                "\n" +
                " ✔ Taze zencefil ( bir iş sarımsak boyutunda )\n" +
                "\n" +
                "Hazırlanışı: \n" +
                "\n" +
                "Tüm malzemeleri bir blender içerisine alın. İçerisine 1 su bardağı kadar su ekleyin. Dilerseniz sevdiğiniz bir bitki çayı da ekleyebilirsiniz. Su ve tüm malzemeleri blenderdan geçirin. Kıvamı koyu olduysa daha fazla su ekleyerek içeceğinizi sıvılaştırabilirsiniz.");
        textView51.setText("◾1 günlük detoks diyeti ile vücudun toksinlerden arınmasını sağlayabilirsiniz.\n" +
                "Kahvaltı: özellikle C vitamini içeren meyvelerden oluşan sıvı detoks içeceği\n" +
                "\n" +
                "Ara öğün: 1 adet orta boy meyve\n" +
                "\n" +
                "Öğle: sebzelerden oluşan sıvı detoks içeceği\n" +
                "\n" +
                "Ara öğün: 1 porsiyon meyve, beyaz çay\n" +
                "\n" +
                "Akşam: meyve ve kuruyemiş içeren sıvı detoks içeceği\n" +
                "\n" +
                "Ara öğün: 1 adet meyve");
        textView53.setText("◾3 gün boyunca bu detoks diyeti uygulayabilirsiniz. Bu diyet ile 3 günde yaklaşık 3 kilo kadar verebilirsiniz.\n" +
                "Kahvaltı: 1 adet yumurta, 40 gram peynir, 1 dilim ekmek\n" +
                "\n" +
                "Ara öğün: 2 ceviz içi veya 6 adet çiğ badem\n" +
                "\n" +
                "Öğle: sebze yemeği ( 5 kaşık ), 1 kase yoğurt\n" +
                "\n" +
                "Ara öğün: 1 dilim beyaz peynir 1 adet galeta\n"

        );
    }
}