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
        textView45.setText("???Detoks diyeti yaparken g??nde en az 2 litre su i??meniz gerekir.\n" + "\n" +
                "???Detoks diyetinin ama??lar??ndan biri de ??dem atmakt??r. Bu y??zden kafeinli i??eceklerden uzak durmakta fayda var. Kahve, ye??il ??ay gibi i??ecekler kafein i??erir. Detoks diyetinde kahve i??ilmemesi gerekir.\n" + "\n" +
                "???Tuz t??ketimi v??cudun ??dem tutmas??na sebep olur ve v??cuttan su at??lmas??na engeldir. Bu y??zden detoks diyetinde tuzu tamamen hayat??n??zdan ????karman??z veya m??mk??n oldu??unca azaltman??z gerekir.\n" + "\n" +
                "???Haz??rlanan detoks s??v??lar?? ile g??nde 6 ??????n beslenilmesi ??nerilir. 3 ana ??????n, 3 de ara ??????n olmak ??zere g??nde 6 ??????n t??ketmek detoks diyeti i??in idealdir.\n" + "\n" +
                "???Detoks diyetinde en ??ok t??ketilen besinler meyve ve sebzelerdir. G??n i??erisinde yakla????k 5 veya 6 adet orta boy meyve yemeniz tavsiye edilir.");
        textView47.setText("Malzemeler: \n" +
                "\n" +
                " ??? Maydanoz\n" +
                "\n" +
                " ??? K??rm??z?? kapya biber\n" +
                "\n" +
                " ??? Yar??m Elma ( k??rm??z??, ye??il veya sar?? tercih edebilirsiniz )\n" +
                "\n" +
                " ??? Havu?? ( 2 orta boy )\n" +
                "\n" +
                " ??? Taze zencefil ( bir i?? sar??msak boyutunda )\n" +
                "\n" +
                "Haz??rlan??????: \n" +
                "\n" +
                "T??m malzemeleri bir blender i??erisine al??n. ????erisine 1 su barda???? kadar su ekleyin. Dilerseniz sevdi??iniz bir bitki ??ay?? da ekleyebilirsiniz. Su ve t??m malzemeleri blenderdan ge??irin. K??vam?? koyu olduysa daha fazla su ekleyerek i??ece??inizi s??v??la??t??rabilirsiniz.");
        textView51.setText("???1 g??nl??k detoks diyeti ile v??cudun toksinlerden ar??nmas??n?? sa??layabilirsiniz.\n" +
                "Kahvalt??: ??zellikle C vitamini i??eren meyvelerden olu??an s??v?? detoks i??ece??i\n" +
                "\n" +
                "Ara ??????n: 1 adet orta boy meyve\n" +
                "\n" +
                "????le: sebzelerden olu??an s??v?? detoks i??ece??i\n" +
                "\n" +
                "Ara ??????n: 1 porsiyon meyve, beyaz ??ay\n" +
                "\n" +
                "Ak??am: meyve ve kuruyemi?? i??eren s??v?? detoks i??ece??i\n" +
                "\n" +
                "Ara ??????n: 1 adet meyve");
        textView53.setText("???3 g??n boyunca bu detoks diyeti uygulayabilirsiniz. Bu diyet ile 3 g??nde yakla????k 3 kilo kadar verebilirsiniz.\n" +
                "Kahvalt??: 1 adet yumurta, 40 gram peynir, 1 dilim ekmek\n" +
                "\n" +
                "Ara ??????n: 2 ceviz i??i veya 6 adet ??i?? badem\n" +
                "\n" +
                "????le: sebze yeme??i ( 5 ka????k ), 1 kase yo??urt\n" +
                "\n" +
                "Ara ??????n: 1 dilim beyaz peynir 1 adet galeta\n"

        );
    }
}