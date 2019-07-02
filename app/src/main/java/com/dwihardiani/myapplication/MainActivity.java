package com.dwihardiani.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_daftar;
    Button btn_daftar;
    Spinner spinner_Pilihan;
    String[] Pilihan = {"Mobile", "WEB", "Dekstop"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_daftar = findViewById(R.id.btn_daftar);
        spinner_Pilihan = findViewById(R.id.spiner_Pilihan);
        tv_daftar = findViewById(R.id.tv_daftar);

        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spinner_Pilihan.getSelectedItem().toString().equals("Mobile")) {
                    tv_daftar.setText("Syarat Bawa Smartphone");
                }else if (spinner_Pilihan.getSelectedItem().toString().equals("WEB")) {
                    tv_daftar.setText("Syarat Bawa Leptop dan XAMPP");
                }else if (spinner_Pilihan.getSelectedItem().toString().equals("Dekstop") ) {
                    tv_daftar.setText("Syarat Bawa Laptop Plu Ada Neatbeans");
                    }
                }

            });
        }
    }

