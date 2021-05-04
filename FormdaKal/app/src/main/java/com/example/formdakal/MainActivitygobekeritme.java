
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

public class MainActivitygobekeritme extends AppCompatActivity {
TextView textView36,textView38,textView40,textView42,textView44;
Toolbar toolbar6;
private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitygobekeritme);
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
        textView36=findViewById(R.id.textView36);
        textView38=findViewById(R.id.textView38);
        textView40=findViewById(R.id.textView40);
        textView42=findViewById(R.id.textView42);
        textView44=findViewById(R.id.textView44);
        toolbar6 = findViewById(R.id.toolbar6);
        toolbar6.setTitle("");
        setSupportActionBar(toolbar6);

        toolbar6.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivitygobekeritme.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView36.setText("Limonlu yoğurt kürü malzemeleri: \n" +
                "\n" +
                " ●Az yağlı 3 yemek kaşığı yoğurt\n" +
                " ●Yarım limon\n" +
                " ●Yarım çay kaşığı zerdeçal (yoksa 1 çay kaşığı hakiki pul biber de olabilir.)\n" +
                " Limonlu yoğurt kürü yapılışı\n" +
                "\n" +
                "Yoğurt, yarım limon suyu, zerdeçalı bir kapta karıştırın. Gece uyumadan önce bu karışımı tüketin ve daha sonrasında hiçbir şey yemeyin.\n" +
                "\n" +
                "Kürü uygularken dikkat etmemiz gerekenler:\n" +
                "\n" +
                "Hareketsiz bir insanın kilo vermesi çok zordur, bu nedenle daha fazla hareket etmeniz gerekir. Günde en az 1,5 litre su için. Beslenmenize daha fazla dikkat edin. Zayıflama süreci içinde tuzu, beyaz şekeri, beyaz ekmek, hamur işi tarzı tatlıları, kızartma ürünlerini hayatınızdan çıkarın. Önerilere uyulduğu taktirde kısa sürede hem zayıflayacaksınız hem de temiz bir cilde sahip olacaksınız.");
textView38.setText("Göbek eriten yoğurtlu kürü malzemeleri:\n" +
        "\n" +
        "●1 adet limon\n" +
        "●250 gram yoğurt\n" +
        "●4 dal maydanoz\n" +
        "●4 dal dereotu\n" +
        "Göbek eriten yoğurtlu kür yapılışı:\n" +
        "\n" +
        "Maydanoz ve dereotlarının hepsini bir kaba ince ince kıyın. Limon suyunu ve 250 gram yoğurdu da ekleyip karıştırın. Haftada en az 2 kez bu kürü uygulayın. Gece uyumadan 3 saat önce tüketmeyi unutmayın.\n" +
        "\n" );
textView40.setText("Göbek eriten soğanlı kür malzemeleri:\n" +
        "\n" +
        "●250 gram yoğurt\n" +
        "●4 dal nane\n" +
        "●1 avuç kadar semizotu\n" +
        "●1 dal taze soğan\n" +
        "Göbek eriten soğanlı kür yapılışı:\n" +
        "\n" +
        "Taze soğanı ve 4 dal naneyi ince ince kıyın. Semizotuyla karıştırın. 250 gram yoğurdu da ekleyin. Haftada 2 kez bu kürü uygulayın. Gece uyumadan tüketmeyi unutmayın.\n" +
        "\n"
        );
textView42.setText("Altın yoğurt kürü malzemeleri:\n" +
        "\n" +
        "●4-5 yemek kaşığı yağsız yoğurt\n" +
        "●1 çay kaşığı zencefil tozu\n" +
        "●1 çay kaşığı zeytinyağı\n" +
        "●1 çay kaşığı zerdeçal tozu\n" +
        "●1 çay kaşığı toz tarçın\n" +
        "Altın yoğurt kürü yapılışı:\n" +
        "\n" +
        "Yağsız yoğurdu bir kaseye boşaltın. İçine tüm malzemeleri teker teker koyun. Hazırladığınız yoğurt kürünü her gün aç karınla tüketin.");
textView44.setText("Göbek eriten sodalı yoğurt kürü malzemeleri:\n" +
        "\n" +
        "●1 şişe maden suyu\n" +
        "●Yarım limonun suyu\n" +
        "●3 yemek kaşığı yarım yağlı yoğurt\n" +
        "Sodalı yoğurt kürü yapılışı:\n" +
        "\n" +
        "3 yemek kaşığı yoğurdun üstüne yarım limon suyunu karıştırın. Bir tarafta iyice karıştırarak diğer taraftan yavaşça maden suyunu yoğurdun üzerine ekleyin. Sabahları kahvaltı yapmadan yaklaşık yarım saat önce ve gece uyumadan yaklaşık yarım saat önce tüketmelisiniz.");
    }
}