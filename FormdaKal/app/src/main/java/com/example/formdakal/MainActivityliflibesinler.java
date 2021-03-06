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
            "    E??er lif a????s??ndan zengin besinler t??ketmenin faydalar??n?? en ??st d??zeylere ta????maya ??al??????yorsan??z," +
                    " ??ncelikle, her ??eyin rahat??a sindirilmesine yard??mc?? olacak kadar su t??ketti??iniz konusunda emin olman??z gerekir.");
    textView25.setText("V??cudunuza ihtiya?? duydu??u lif ve di??er besin maddelerini y??ksek miktarlarda sa??layabilecek bir g??da grubu varsa, o da sebze grubudur. Sebzeler kesinlikle diyetinizin de??i??mez bir par??as?? olmal??d??r.\n" +
            "\n" +
            "Buna ek olarak, v??cudunuzun kilo vermesine engel olan t??m toksinlerden temizlenmesine de yard??mc?? olurlar.");
    textView28.setText("Dutsu meyveler sa??l??????n??z i??in ??ok yararl??d??r. Antioksidanlar a????s??ndan zengindirler ve hedefledi??iniz kiloya ula??man??za yard??mc?? olurlar. Dutsu meyveler lif bak??m??ndan zengindir ve salatalarla birlikte ya da at????t??rmal??k olarak t??ketmek i??in m??kemmel bir se??enektir.\n" +
            "\n" +
            "Diyetinize dahil edebilece??iniz baz?? se??enekler ??unlard??r:\n" +
            "\n" +
            "??? ??z??m\n" +
            "??? ??ilekler\n" +
            "??? B??????rtlenler\n" +
            "??? Ahududu");
    textView30.setText("Tam tah??llar kan ??ekerini d??zenler ve ??i??kinlikten kaynaklanabilen muhtemel rahats??zl??klar?? azalt??r. Bu g??da grubu, kilo vermeyi ama??layan diyetlerin ??nemli bir par??as??d??r.");
    textView32.setText("Bunlar, E vitamini ve y??ksek oranda lif sa??layan g??da gruplar??nda ba???? ??eker.\n" +
            "\n" +
            "Kuru yemi??ler bize enerji verir ve tok hissetmemize yard??mc?? olurlar.\n" +
            "\n" +
            "En iyi t??rleri aras??nda yer alanlar :\n" +
            "\n" +
            "??? Badem\n" +
            "??? F??nd??k\n" +
            "??? Ceviz\n" +
            "??? Yer f??st??????");
    }
}