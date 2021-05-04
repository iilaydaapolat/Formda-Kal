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

public class OnGundeZayifla extends AppCompatActivity {
Toolbar toolbar12;
    private AdView mAdView;
TextView textViewbir,textViewiki,textViewüc,textViewdört,textViewbes,textViewaltı,textViewyedi,textViewsekiz,textViewdokuz,textViewon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_on_gunde_zayifla);
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
textViewbir=findViewById(R.id.textViewbir);
textViewiki=findViewById(R.id.textViewiki);
        textViewüc=findViewById(R.id.textViewüc);
        textViewdört=findViewById(R.id.textViewdört);


        toolbar12 = findViewById(R.id.toolbar12);
        toolbar12.setTitle("");
        setSupportActionBar(toolbar12);


        toolbar12.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                Intent intent = new Intent(OnGundeZayifla.this, MainActivity.class);
                startActivity(intent);
            }
        });
textViewbir.setText("İlk seçenek:"+ "\n"+"Bir kase az yağlı yoğurt, yağsız jambon ve peynirden oluşan bir sandviç ve bir adet elma.\n" +"\n" +"\n" +
        "İkinci seçenek:"+"\n" +"Bir fincan sebze sütü, 4 adet tam tahıllı kraker, yağsız peynir ve bir adet portakal.\n" +"\n" +"\n" +
        "Üçüncü seçenek:"+"\n"+ "Bir bardak bitki çayı, az yağlı peynirden oluşan bir sandviç ve bir elma.\n"+"\n" +"\n");


textViewiki.setText("İlk seçenek:"+ "\n"+ "Zeytin yağlı beyaz veya mor lahana salatası, az miktarda ton balığı ve 2 adet haşlanmış yumurta.\n" +"\n" +"\n" +
        "İkinci seçenek:"+"\n"+"Bir kase karışık meyve salatası ve tavuk göğsü.\n" +"\n" +"\n" +
        "Üçüncü seçenek:"+"\n"+"Doğal domates soslu haşlanmış kabak, yanında peynir dilimleri ve baharatlar ile.\n" +"\n" +"\n" +
        "Dördüncü seçenek:"+"\n"+"150 gram ızgara balık, domates, marul ve soğandan oluşan karışık salata.");
textViewüc.setText("İlk seçenek:"+"\n"+"Bir bardak az yağlı yoğurt ve bir çay kaşığı chia tohumu.\n" +"\n" +"\n" +
        "İkinci seçenek:"+"\n"+"Bir porsiyon cupcake tipi kek ve bir bardak çay.\n" +"\n" +"\n" +
        "Üçüncü seçenek:"+"\n"+"Meyve salatası, bir bardak kaymak veya sebze sütü.\n" +"\n" +"\n");
textViewdört.setText("İlk seçenek:"+"\n"+"Izgara tavuk göğsü, 4 dilim haşlanmış kabak ve biraz doğranmış domates.\n" +"\n" +"\n" +
        "İkinci seçenek:"+"\n"+"Az miktarda yağsız kırmızı et ve bir tabak karışık salata.\n" +"\n" +"\n" +
        "Üçüncü seçenek:"+"\n"+"Sote mantar ve soğandan oluşan bir omlet.\n" +"\n" +"\n" +
        "Dördüncü seçenek:"+"\n"+"Doğranmış tavuk göğsü ve küçük porsiyon kahverengi pirinç pilavı.");


    }


}