
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
        textView36.setText("Limonlu yo??urt k??r?? malzemeleri: \n" +
                "\n" +
                " ???Az ya??l?? 3 yemek ka???????? yo??urt\n" +
                " ???Yar??m limon\n" +
                " ???Yar??m ??ay ka???????? zerde??al (yoksa 1 ??ay ka???????? hakiki pul biber de olabilir.)\n" +
                " Limonlu yo??urt k??r?? yap??l??????\n" +
                "\n" +
                "Yo??urt, yar??m limon suyu, zerde??al?? bir kapta kar????t??r??n. Gece uyumadan ??nce bu kar??????m?? t??ketin ve daha sonras??nda hi??bir ??ey yemeyin.\n" +
                "\n" +
                "K??r?? uygularken dikkat etmemiz gerekenler:\n" +
                "\n" +
                "Hareketsiz bir insan??n kilo vermesi ??ok zordur, bu nedenle daha fazla hareket etmeniz gerekir. G??nde en az 1,5 litre su i??in. Beslenmenize daha fazla dikkat edin. Zay??flama s??reci i??inde tuzu, beyaz ??ekeri, beyaz ekmek, hamur i??i tarz?? tatl??lar??, k??zartma ??r??nlerini hayat??n??zdan ????kar??n. ??nerilere uyuldu??u taktirde k??sa s??rede hem zay??flayacaks??n??z hem de temiz bir cilde sahip olacaks??n??z.");
textView38.setText("G??bek eriten yo??urtlu k??r?? malzemeleri:\n" +
        "\n" +
        "???1 adet limon\n" +
        "???250 gram yo??urt\n" +
        "???4 dal maydanoz\n" +
        "???4 dal dereotu\n" +
        "G??bek eriten yo??urtlu k??r yap??l??????:\n" +
        "\n" +
        "Maydanoz ve dereotlar??n??n hepsini bir kaba ince ince k??y??n. Limon suyunu ve 250 gram yo??urdu da ekleyip kar????t??r??n. Haftada en az 2 kez bu k??r?? uygulay??n. Gece uyumadan 3 saat ??nce t??ketmeyi unutmay??n.\n" +
        "\n" );
textView40.setText("G??bek eriten so??anl?? k??r malzemeleri:\n" +
        "\n" +
        "???250 gram yo??urt\n" +
        "???4 dal nane\n" +
        "???1 avu?? kadar semizotu\n" +
        "???1 dal taze so??an\n" +
        "G??bek eriten so??anl?? k??r yap??l??????:\n" +
        "\n" +
        "Taze so??an?? ve 4 dal naneyi ince ince k??y??n. Semizotuyla kar????t??r??n. 250 gram yo??urdu da ekleyin. Haftada 2 kez bu k??r?? uygulay??n. Gece uyumadan t??ketmeyi unutmay??n.\n" +
        "\n"
        );
textView42.setText("Alt??n yo??urt k??r?? malzemeleri:\n" +
        "\n" +
        "???4-5 yemek ka???????? ya??s??z yo??urt\n" +
        "???1 ??ay ka???????? zencefil tozu\n" +
        "???1 ??ay ka???????? zeytinya????\n" +
        "???1 ??ay ka???????? zerde??al tozu\n" +
        "???1 ??ay ka???????? toz tar????n\n" +
        "Alt??n yo??urt k??r?? yap??l??????:\n" +
        "\n" +
        "Ya??s??z yo??urdu bir kaseye bo??alt??n. ????ine t??m malzemeleri teker teker koyun. Haz??rlad??????n??z yo??urt k??r??n?? her g??n a?? kar??nla t??ketin.");
textView44.setText("G??bek eriten sodal?? yo??urt k??r?? malzemeleri:\n" +
        "\n" +
        "???1 ??i??e maden suyu\n" +
        "???Yar??m limonun suyu\n" +
        "???3 yemek ka???????? yar??m ya??l?? yo??urt\n" +
        "Sodal?? yo??urt k??r?? yap??l??????:\n" +
        "\n" +
        "3 yemek ka???????? yo??urdun ??st??ne yar??m limon suyunu kar????t??r??n. Bir tarafta iyice kar????t??rarak di??er taraftan yava????a maden suyunu yo??urdun ??zerine ekleyin. Sabahlar?? kahvalt?? yapmadan yakla????k yar??m saat ??nce ve gece uyumadan yakla????k yar??m saat ??nce t??ketmelisiniz.");
    }
}