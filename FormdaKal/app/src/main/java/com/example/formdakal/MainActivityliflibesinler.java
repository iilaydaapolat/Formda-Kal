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

public class MainActivityliflibesinler extends AppCompatActivity {
TextView textView6,textView25,textView28,textView30,textView32;
Toolbar toolbar5;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityliflibesinler);
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
        textView6 = findViewById(R.id.textView6);
        textView25 = findViewById(R.id.textView25);
        textView28= findViewById(R.id.textView28);
        textView30 = findViewById(R.id.textView30);
        textView32 = findViewById(R.id.textView32);
        toolbar5 = findViewById(R.id.toolbar5);
        toolbar5.setTitle("");
        setSupportActionBar(toolbar5);

        toolbar5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityliflibesinler.this, MainActivity.class);
                startActivity(intent);
            }
        });
    textView6.setText(
            "\n" +
            "    Eğer lif açısından zengin besinler tüketmenin faydalarını en üst düzeylere taşımaya çalışıyorsanız," +
                    " öncelikle, her şeyin rahatça sindirilmesine yardımcı olacak kadar su tükettiğiniz konusunda emin olmanız gerekir.");
    textView25.setText("Vücudunuza ihtiyaç duyduğu lif ve diğer besin maddelerini yüksek miktarlarda sağlayabilecek bir gıda grubu varsa, o da sebze grubudur. Sebzeler kesinlikle diyetinizin değişmez bir parçası olmalıdır.\n" +
            "\n" +
            "Buna ek olarak, vücudunuzun kilo vermesine engel olan tüm toksinlerden temizlenmesine de yardımcı olurlar.");
    textView28.setText("Dutsu meyveler sağlığınız için çok yararlıdır. Antioksidanlar açısından zengindirler ve hedeflediğiniz kiloya ulaşmanıza yardımcı olurlar. Dutsu meyveler lif bakımından zengindir ve salatalarla birlikte ya da atıştırmalık olarak tüketmek için mükemmel bir seçenektir.\n" +
            "\n" +
            "Diyetinize dahil edebileceğiniz bazı seçenekler şunlardır:\n" +
            "\n" +
            "✔ Üzüm\n" +
            "✔ Çilekler\n" +
            "✔ Böğürtlenler\n" +
            "✔ Ahududu");
    textView30.setText("Tam tahıllar kan şekerini düzenler ve şişkinlikten kaynaklanabilen muhtemel rahatsızlıkları azaltır. Bu gıda grubu, kilo vermeyi amaçlayan diyetlerin önemli bir parçasıdır.");
    textView32.setText("Bunlar, E vitamini ve yüksek oranda lif sağlayan gıda gruplarında başı çeker.\n" +
            "\n" +
            "Kuru yemişler bize enerji verir ve tok hissetmemize yardımcı olurlar.\n" +
            "\n" +
            "En iyi türleri arasında yer alanlar :\n" +
            "\n" +
            "✔ Badem\n" +
            "✔ Fındık\n" +
            "✔ Ceviz\n" +
            "✔ Yer fıstığı");
    }
}