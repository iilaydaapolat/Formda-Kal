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

public class Mainkaratay extends AppCompatActivity {
Toolbar toolbar13;
TextView textView19,textView65;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainkaratay);
        toolbar13 = findViewById(R.id.toolbar13);
        textView19= findViewById(R.id.textView199);
        textView65=findViewById(R.id.textView65);
        toolbar13.setTitle("");
        setSupportActionBar(toolbar13);
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
        textView65.setText("Bu örnek diyet listesini 1 hafta boyunca uygulayabilirsiniz.\n" + "\n" +
                "Kahvaltı:\n" +
                "\n" +
                "haşlanmış 1 adet yumurta, veya 2 yumurta ile hazırlanmış menemen\n" +
                "\n" +
                "2 ince dilim beyaz peynir ( tulum veya ezine olmayacak )\n" +
                "\n" +
                "8-10 adet zeytin (üzerine zeytinyağı, kekik ve pul biber ekleyebilirsiniz )\n" +
                "\n" +
                "6 adet ceviz içi veya fındık\n" +
                "\n" +
                "Öğlen:\n" +
                "\n" +
                "Zeytinyağlı sebze yemeği ( 6 kaşık ), 1 bardak ayran, bol yeşil salata ( zeytinyağlı )\n" +
                "\n" +
                "Veya\n" +
                "\n" +
                "1 porsiyon meyve ( kabuğu ile tüketilen lifli meyve tercih etmeniz önerilir ), 1 avuç ceviz veya çiğ badem\n" +
                "\n" +
                "Akşam:\n" +
                "\n" +
                "Izgara balık veya tavuk eti veya kırmızı et, zeytinyağlı bol yeşil salata, 1 kase yoğurt ( ev yoğurdu tavsiye edilir )\n" +
                "\n" +
                "Ara öğünler: şekersiz ve tatlandırıcısız bitki çayı tüketilebilir veya şekersiz ve kremasız kahve içilebilir.");
        textView19.setText("•Karatay diyetinde glisemik indeksi yüksek karbonhidrat tüketilmemelidir. Pilav, patates, ekmek gibi besinler yasaklı yiyeceklerdendir.\n" +"\n" +
                "•Özellikle kahvaltıda ekmek yerine ceviz, badem, fındık gibi kuruyemişlerin tüketilmesi tavsiye edilir.\n" +"\n" +
                "•Salata ve yemeklerde ayçiçeği yağı kullanılması yasaktır. Bunun yerine zeytinyağı ve tereyağı kullanılmaktadır.\n" +"\n" +
                "•Güne başlarken sağlıklı bir kahvaltı yapılması en önemli adımlardan biridir. Protein açısından zengin bir kahvaltı yapılması önerilmektedir.\n" +"\n" +
                "•Karatay diyetinde ara öğün yoktur. Gün içerisinde 3 ana öğün ile beslenilir. 4-5 saat ara vererek bir diğer öğüne geçilir.\n" +"\n" +
                "•Turşu en faydalı besinler arasında yer almaktadır. Özellikle evde hazırlanmış bol sirkeli ve az tuzlu turşunun tüketilmesi tavsiye edilir.\n" +"\n" +
                "•Karatay diyetinde tüketilecek olan besinlerin pişirilme yöntemi düşük ısıda ve uzun süreli olmalıdır.\n" +"\n" +
                "•Gün içerisinde şekersiz çay ve kahve tüketilmesinde bir sakınca yoktur.\n" +"\n" +
                "•Alkol, meyve suları, şekerli ve gazlı içecekler kesinlikle yasaklı yiyeceklerdendir.\n" +"\n" +
                "•Diyet sırasında su tüketimi oldukça önemlidir. Gün içerisinde en az 2 litre su içilmelidir. Suyunuza limon sıkarak içmeniz de yağ yakımını hızlandıracaktır.\n" +"\n" +
                "•Her diyette olduğu gibi Karatay diyetinde de egzersiz yapmak kilo vermeyi hızlandıracaktır. Gün içerisinde 45 dakika veya 1 saatlik yürüyüşler daha etkili sonuç almanıza yardımcı olur.");
        toolbar13.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mainkaratay.this,MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
    }
}