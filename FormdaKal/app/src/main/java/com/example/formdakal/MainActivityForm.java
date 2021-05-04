package com.example.formdakal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivityForm extends AppCompatActivity {
    EditText editTextboy, editTextkilo, editTextname;
    Button buttonhesapla;
    TextView textView2;
    TextView textViewaciklama;
    Toolbar toolbar;
    TextView textView;
    CheckBox checkBox2, checkBox3;
    private DecimalFormat df;

    private static String thousandSeparator;
    private static String decimalMarker;
    private int cursorPosition;
    private RadioButton maleRadio;
    private RadioButton femaleRadio;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_form);


        editTextboy = findViewById(R.id.editTextboy);

        editTextkilo = findViewById(R.id.editTextkilo);
        buttonhesapla = findViewById(R.id.buttonhesapla);
        textView2 = findViewById(R.id.textView2);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        editTextboy.getBackground().setColorFilter(getResources().getColor(R.color.mor), PorterDuff.Mode.SRC_ATOP);
        editTextkilo.getBackground().setColorFilter(getResources().getColor(R.color.mor), PorterDuff.Mode.SRC_ATOP);
        textViewaciklama = findViewById(R.id.textViewaciklama);


        textView = findViewById(R.id.textView);
        toolbar = findViewById(R.id.toolbar1);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        String strUserName = editTextboy.getText().toString();
        if (TextUtils.isEmpty(editTextboy.getText().toString())) {
            Toast.makeText(MainActivityForm.this,
                    "Lütfen tüm alanları doldurunuz!",
                    Toast.LENGTH_LONG).show();

        } else if
        (TextUtils.isEmpty(editTextkilo.getText().toString())) {
            Toast.makeText(MainActivityForm.this,
                    "Lütfen tüm alanları doldurunuz!",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(MainActivityForm.this,
                    "Proceed..",
                    Toast.LENGTH_SHORT).show();
        }


        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {

                    checkBox3.setChecked(false);
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    checkBox2.setChecked(false);

                }
            }
        });

        textView.setText("Vücut kitle indeksi, temel anlamda boyunuzun kilonuza oranıdır ve sizlere sahip olmanız gereken ideal ağırlığı gösterir. ");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back button pressed
                Intent intent = new Intent(MainActivityForm.this, MainActivity.class);
                startActivity(intent);
            }
        });

        buttonhesapla.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (editTextkilo.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivityForm.this, "Lütfen Kilonuzu Giriniz..", Toast.LENGTH_SHORT).show();
                } else if (editTextboy.getText().toString().trim().isEmpty()) {
                    Toast.makeText(MainActivityForm.this, "Lütfen Boyunuzu Giriniz..", Toast.LENGTH_SHORT).show();}
                 else if (checkBox2.getText().toString().trim().isEmpty()) {
                        Toast.makeText(MainActivityForm.this, "Cinsiyetinizi Boş Bırakmayınız..", Toast.LENGTH_SHORT).show();}
                        else if (checkBox3.getText().toString().trim().isEmpty()) {
                            Toast.makeText(MainActivityForm.this, "Cinsiyetinizi Boş Bırakmayınız..", Toast.LENGTH_SHORT).show();}
                            else{
                                Toast.makeText(MainActivityForm.this, "İdeal BMI Indexiniz Hesaplanıyor..", Toast.LENGTH_SHORT).show();

                }


                double boy = Double.parseDouble(editTextboy.getText().toString());
                double kilo;
                double bmi;
                kilo = Double.parseDouble(editTextkilo.getText().toString());
                double bayami;


                bayami = (boy / 100 * boy / 100);

                bmi = (kilo / (bayami));


                textView2.setText("Vücut Kitle İndeksiniz: " + String.valueOf(bmi));
                if (bmi <= 18) {
                    textViewaciklama.setText("İdeal kilonuzdan daha zayıfsınız");
                } else if (bmi >= 18 && bmi < 25) {
                    textViewaciklama.setText("İdeal kilonuzdasınız!");
                } else if (bmi >= 25) {
                    textViewaciklama.setText("İdeal kilonuzdan daha kilolusunuz!");
                }


            }

        });
    }

//Toast veya AlertDialog ile uyarı ver.


        public void check_checkbox () {

            int CB_count = 0;
            if (checkBox2.isChecked()) {
                CB_count = CB_count + 1;
            }
            if (checkBox3.isChecked()) {
                CB_count = CB_count + 1;
            }

            if (CB_count == 1) {

                //do your magic

            } else {
                Toast.makeText(getApplicationContext(), "you only can select 1 checkbox", Toast.LENGTH_SHORT).show();
            }
        }
        private boolean isEmpty (EditText editTextboy){
            if (editTextboy.getText().toString().trim().length() > 0)
                return false;

            return true;
        }
    }

