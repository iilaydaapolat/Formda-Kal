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

public class MainActivityyagyak extends AppCompatActivity {
TextView textView59;
Toolbar toolbar8;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityyagyak);
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
        textView59= findViewById(R.id.textView59);
        toolbar8 = findViewById(R.id.toolbar8);
        toolbar8.setTitle("");
        setSupportActionBar(toolbar8);

        toolbar8.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityyagyak.this, MainActivity.class);
                startActivity(intent);
            }
        });
        textView59.setText(" ◾Pazartesi\n" +
                "\n" +
                "Kahvaltı: 300 ml yağsız süt 1 çay kaşığı bal ile... 45 gr yulaf; 200 ml elma suyu.\n" +
                "Aperatif: Yaban mersini, 120gr az yağlı yoğurt bal ilavesi ile...\n" +
                "Öğle Yemeği: Kepekli ekmek ile ızgara tavuk (1 tavuk göğsü)\n" +
                "atıştırmalık: Smoothie - 25 gr peynir altı suyu proteini , 80 gr ahududu, 80 gr yaban mersini, 50 gr böğürtlen ve su .\n" +
                "Akşam yemeği: tavada kızartılmış brokoli, mantar, yeşil fasulye, susam ve yağ ile... 120 gr ton balığı; 70 gr kahverengi pirinç.\n" +
                "Aperatif: 250ml yağsız süt.\n" +
                "\n" +
                "▸Günlük toplam: 1,835 kalori, 136g protein, 229 g karbonhidrat, 33 gr yağ\n" +
                "\n" +
                " ◾Salı\n" +
                "\n" +
                "Kahvaltı: Smoothie - 25 gr peynir altı suyu proteini, 300 ml yağsız süt, 100 gr çilek ve bir muz.\n" +
                "Aperatif: 120 gr az yağlı yoğurt, yaban mersini ve bal.\n" +
                "Öğle yemeği: Kepekli ekmek üzerinde ton balıklı sandviç; 200ml yağsız süt.\n" +
                "Aperatif: Karışık fındık, kuru üzüm ve kızılcık.\n" +
                "Akşam yemeği: 100g tavuk, pastırma ve avokado salatası.\n" +
                "Aperatif: 2 tatlı kaşığı doğal fıstık ezmesi ile 1 elma .\n" +
                "\n" +
                "▸Günlük toplam: 1,802 kalori, 131g protein, 219g karbonhidrat, 37g yağ\n" +
                "\n" +
                " ◾Çarşamba\n" +
                "\n" +
                "Kahvaltı: Smoothie - 25 gr peynir altı suyu proteini, 300 ml yağsız süt, 100 gr çilek ve bir muz.\n" +
                "Aperatif: 1 dilim kepekli tost üzerinde 90g uskumru.\n" +
                "Öğle yemeği: 1 elma; kepekli ekmek tavuk salatası sandviç.\n" +
                "Aperatif: 1 muz.\n" +
                "Akşam yemeği: 120gr ıspanaklı fileto biftek ve 2 adet ızgara domates.\n" +
                "Atıştırmalık: 100 gr az yağlı süzme peynir ve ananas.\n" +
                "\n" +
                "▸Günlük toplam: 1,821 kalori, 138g protein, 222 g karbonhidrat, 35 gr yağ\n" +
                "\n" +
                " ◾Perşembe\n" +
                "Kahvaltı: 2 parça kepekli tost üzerinde 4 adet yumurta akı.\n" +
                "Aperatif: Yoğurdun içerisine yaban mersini, 1 avuç yulaf, bal.\n" +
                "Öğle Yemeği: 25 gr peynir altı suyu proteini, 80 gr ahududu, 80 gr yaban mersini, 50 gr böğürtlen ve su karışımı; 30g Brezilya fıstığı.\n" +
                "Atıştırmalık: 100 gr az yağlı süzme peynir ve ananas.\n" +
                "Akşam yemeği: Tuna niçoise salatası (100g ton balığı, karışık salata yaprakları, domates, kırmızı biber)\n" +
                "Aperatif: 250ml yağsız süt.\n" +
                "\n" +
                "▸Günlük toplam: 1,835 kalori, 136g protein, 229 g karbonhidrat, 33 gr yağ\n" +
                "\n" +
                " ◾Cuma\n" +
                "\n" +
                "Kahvaltı: 300 ml yağsız süt ve 1 çay bal ile 45g yulaf.\n" +
                "Aperatif: Balzamik salata sosu ile 10 adet turp.\n" +
                "Öğle Yemeği: 1 adet pancarlı ton balığı konservesi; 1 kase az yağlı yoğurt.\n" +
                "Ara öğün: Smoothie, 25 gr peynir altı suyu proteini, 80 gr ahududu, 80 gr yaban mersini ve 50 gr böğürtlen .\n" +
                "Akşam yemeği: 120gr barbekülü tavuk kebabı, biber ve 70 gr kahverengi pirinç.\n" +
                "Aperatif: 100g süzme peynir; üzüm.\n" +
                "\n" +
                "▸Günlük toplam: 1,808 kalori, 133g protein, 219g karbonhidrat, 34g yağ\n" +
                "\n" +
                " ◾Cumartesi\n" +
                "\n" +
                "Kahvaltı: 2 yumurtadan yapılan peynirli omlet\n" +
                "Ara öğün: Smoothie: 25gr protein, 1 elma, 50 gr yaban mersini, 50 gr böğürtlen ve su ile bir muz karıştırın.\n" +
                "Öğle yemeği: 1 dilim kepekli tost üzerinde 90gr sardalya.\n" +
                "Aperatif: 150g çiğ havuç ve humus.\n" +
                "Akşam yemeği: Yeşil fasulye, kuşkonmaz ve 70 gr kahverengi pirinç ile 100 gr ızgara somon.\n" +
                "Aperatif: 200 ml yağsız süt.\n" +
                "\n" +
                "▸Günlük toplam: 1,822 kalori, 135g protein, 221 g karbonhidrat, 36 gr yağ\n" +
                "\n" +
                " ◾Pazar\n" +
                "\n" +
                "Kahvaltı: 2 kepekli ekmek üzerine 4 adet yumurta akı; 1 adet greyfurt.\n" +
                "Atıştırmalık: Smoothie, 25 gr protein, 300 ml yağsız süt, 50 gr yaban mersini, 50 gr böğürtlen ve bir muz karıştırın.\n" +
                "Öğle yemeği: Kepekli ekmek üzerinde ton balığı, 1 armut.\n" +
                "Aperatif: Karışık fındık ve meyve barı.\n" +
                "Akşam yemeği: 1 adet ufak boy patates, ıspanak ve 1 ızgara domates ile 120 gr fileto biftek.\n" +
                "Aperatif: 2 tatlı kaşığı doğal fıstık ezmesi ile 1 elma.\n" +
                "\n" +
                "▸Günlük toplam: 1.840 kalori, 140gr protein, 228 gr karbonhidrat, 39gr yağ\n" +
                "\n" +
                "Not: Yağ yakmak için uygulayacağınız bu diyet planı sadece 1 haftalıktır. Ancak siz yağ yakmaya yardımcı olan bu diyet programını dört hafta boyunca tekrarlayabilirsiniz. Yağ yakmaya yardımcı olan ve 1 haftada 3 kilo verdiren bu diyet programını 4 hafta boyunca tekrarlamak sıkıcı gelirse eğer yağ yakan diğer sevdiğiniz besinlerle diyet programını kendinizde planlayabilirsiniz. Füme ve uskumru sevmiyorsanız bunun yerine ton balığı tüketebilir, turp tüketmeyi sevmiyorsanız da bu besinin yerine enginar tüketebilirsiniz.\n" +
                "\n" +
                "1 haftada 3 kilo verdiren yağ yakıcı diyet programını uygularken nelere dikkat edilmelidir?\n" +
                "\n" +
                "✔ Bol miktarda su tüketin\n" +
                "Su içmek birçok insan için yağ yakmak ve sağlıklı bir şekilde beslenmek konusunda önemli bir role sahiptir. Günde 2 veya 3 litre su tüketmek, yağın taşınmasını ve yağ yakmanıza yardımcı olur. Bunların dışında vücudun su ihtiyacını karşılamak daha iyi hissetmenize de yardımcı olacaktır.\n" +
                "\n" +
                "✔ Nişastalı karbonhidrat alımını azaltın\n" +
                "\n" +
                "✔ Makarna, ekmek ve pirinç gibi nişastalı yiyecekler tüketmek (özellikle hepsi bir arada) vücuda glikojen depoları ve enerji için ihtiyaç duyduğundan daha fazlasını sağlar, geride kalan her şey yağ olarak depolanır.\n" +
                "\n" +
                "✔Düşük Karbonhidratlı Sebzeler\n" +
                "\n" +
                "Brokoli\n" +
                "Karnabahar\n" +
                "Ispanak\n" +
                "Domates\n" +
                "Süs lahanası\n" +
                "Brüksel lahanası\n" +
                "Lahana\n" +
                "İsviçre pazı\n" +
                "Marul\n" +
                "Salatalık\n" +
                "\n" +
                "Tabağınızı bu düşük karbonhidratlı sebzelerle doldurmaktan korkmayın. Günde 20-50 net karbonhidrat tüketmeden bu listesini vermiş olduğumuz besinlerden yiyebilirsiniz.\n" +
                "\n" +
                "Çoğunlukla ete ve sebzeye dayalı bir diyet, sağlıklı olmanız için gereken tüm lif, vitamin ve mineralleri içerir.\n" +
                "\n" +
                "\n" +
                "Haftada 3 Kez Ağırlık Kaldırın\n" +
                "\n" +
                "Yağ yakıcı diyet programını uygularken egzersiz yapmanız şart değildir ancak tavsiye edilmektedir.\n" +
                "\n" +
                "Hızlı bir şekilde yağ yakabilmeniz için en iyi seçenek, haftada 3-4 kez spor salonuna gitmek. Bir ısınma yapın ve bazı ağırlıkları kaldırın. Spor salonuna yeniyseniz, bazı öneriler için bir eğitmene danışın.\n" +
                "\n" +
                "Ağırlıkları kaldırarak, çok fazla kalori yakacak ve metabolizmanızın yavaşlamasını engelleyeceksiniz, bu da kilo vermenizi ve yağ yakmanızı kolaylaştıracaktır.\n" +
                "\n" +
                "Yeşil çay tüketin\n" +
                "\n" +
                "Öğünlerinizde az miktarda hayvansal protein ve bitkisel protein yiyerek , kuruyemiş, avokado, hindistan cevizi yağı gibi sağlıklı yağları, sebze ve salataları ne kadar çok yerseniz o kadar hızlı yağ yakmanız mümkün olacaktır.\n" +
                "Ayrıca yeşil çay içmek yağ yakmanıza yardımcı olur.\n" +
                "\n" +
                "Lifli yiyecekler tüketmek\n" +
                "\n" +
                "Lifli yiyecekler tüketmenin yağ yakımı üzerindeki etkisi oldukça fazladır. Lifli yiyecekler metabolizma hızını arttıracağından yağ yakımınıda kolaylaştıracaktır.");
    }
}