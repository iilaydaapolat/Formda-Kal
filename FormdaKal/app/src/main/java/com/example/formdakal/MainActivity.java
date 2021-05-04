package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vorlonsoft.android.rate.AppRate;
import com.vorlonsoft.android.rate.OnClickButtonListener;
import com.vorlonsoft.android.rate.StoreType;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button2;
    final String PREFS_NAME = "MyPrefsFile";
    final String SHAREDPREF_DATE = "SharedPrefDate";
    ImageView form,imageButtonkalori,imageButtondiyetlist,imageButtonegsersiz,imageButtoncay,imageButtonnot,imageButtonongünde,imageButtonyagyak,detox,lifbesinler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        form = findViewById(R.id.form);
        button2 = findViewById(R.id.button2);
        imageButtonkalori = findViewById(R.id.imageButtonkalori);
        imageButtondiyetlist = findViewById(R.id.imageButtondiyetlist);
        imageButtonegsersiz = findViewById(R.id.imageButtonegzersiz);
        imageButtoncay = findViewById(R.id.imageButtoncay);
        imageButtonnot = findViewById(R.id.imageButtonnot);
        imageButtoncay = findViewById(R.id.imageButtoncay);
        imageButtonongünde = findViewById(R.id.imageButtonongünde);
        imageButtonyagyak = findViewById(R.id.imageButtonyagyak);
        lifbesinler = findViewById(R.id.lifbesinler);
        detox = findViewById(R.id.detox);
        detox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitydetox.class);
                startActivity(intent);

            }
        });

        form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivityForm.class);
                startActivity(intent);

            }
        });
        imageButtonkalori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, KaloriHesapla.class);
                startActivity(intent);
            }
        });
        imageButtonyagyak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivitygobekeritme.class);
                startActivity(intent);
            }
        });
        imageButtondiyetlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitydiyetler.class);
                startActivity(intent);
            }
        });
        imageButtonegsersiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityegzersiz.class);
                startActivity(intent);
            }
        });
        imageButtonnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivitynotdefteri.class);
                startActivity(intent);
            }
        });
        imageButtoncay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityCay.class);
                startActivity(intent);
            }
        });
        lifbesinler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityliflibesinler.class);
                startActivity(intent);
            }
        });

    }

    public void ongün(View view){
        Intent intent = new Intent(MainActivity.this,OnGundeZayifla.class);
        startActivity(intent);

    }
    public void button(View view) {
        String[] toastMessages = new String[]{"Yeterli uyuyun. Birçok çalışmaya göre, her gece 7 - 8 saat uyuyan insanların metabolizması daha hızlı çalışıyor.", "Susamadan su için. Günlük 3 litre su tüketerek yağ yakımını kolaylaştırın!", "Salatalarınıza yağlı soslar almayınız.Kremalı, soslu, kızartma tarzı yemekleri tercih etmeyiniz.", "Kas kitlenizi artırmak için spor yapın.", "Bitki çayları için, baharatlar kullanın.", "Kafein metabolizmayı hızlandırır fakat aşırı kullanmaktan kaçının. Kafeini kahve ile almak en doğrusu, gazlı içeceklerden uzaklaşın.", "Yeterli kalsiyum alın (süt, süt ürünleri, koyu yeşil sebzeler, brokoli, kabak).", "Yüksek Glisemik Indeks’li gıdalardan (şeker, reçel, patates, mısır, beyaz pirinç) kaçının.", "Tokluk hissi (ne kadar çok yemek yeseniz de) yavaş oluşur. Bu yüzden açken yemeği fazla kaçırmamak için küçük lokmalarla tüketin ve acele etmeyin.", "Açken sağlıksız seçimler yapmaya daha eğilimli olunur ve yemeyi fazla kaçırabilirsiniz. Bunu önlemek için günde 3 öğün yemek yemeye özen göstermelisiniz.", "Beğendiğiniz yiyeceklerin tamamından vazgeçmek zorunda değilsiniz! Seçeceğiniz peynirin daha az yağlı olanını tercih edebilir, sevdiğiniz yiyeceği hayatınızda tutabilirsiniz.", "Haftada bir tartılarak günlük oynamalardan dolayı ( ödem vb değişikler olabilir) kendinizi kötü hissetmeden tartılmalısınız"};
        int randomMsgIndex = new Random().nextInt(toastMessages.length - 1);

        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText(toastMessages[randomMsgIndex]);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();

// Get an index between 0 and the last index in the messages array
        AppRate.with(this)
                .setStoreType(StoreType.GOOGLEPLAY) //default is GOOGLEPLAY (Google Play), other options are
                //           AMAZON (Amazon Appstore) and
                //           SAMSUNG (Samsung Galaxy Apps)
                .setInstallDays((byte) 0) // default 10, 0 means install day
                .setLaunchTimes((byte) 3) // default 10
                .setRemindInterval((byte) 2) // default 1
                .setRemindLaunchTimes((byte) 2) // default 1 (each launch)
                .setShowLaterButton(true) // default true
                .setDebug(false) // default false
                //Java 8+: .setOnClickButtonListener(which -> Log.d(MainActivity.class.getName(), Byte.toString(which)))
                .setOnClickButtonListener(new OnClickButtonListener() { // callback listener.
                    @Override
                    public void onClickButton(byte which) {
                        Log.d(MainActivity.class.getName(), Byte.toString(which));
                    }
                })
                .monitor();

        if (AppRate.with(this).getStoreType() == StoreType.GOOGLEPLAY) {
            //Check that Google Play is available
            if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this) != ConnectionResult.SERVICE_MISSING) {
                // Show a dialog if meets conditions
                AppRate.showRateDialogIfMeetsConditions(this);
            }
        } else {
            // Show a dialog if meets conditions
            AppRate.showRateDialogIfMeetsConditions(this);

        }
    }
}