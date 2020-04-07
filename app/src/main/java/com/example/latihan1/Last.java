package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Last extends AppCompatActivity {
    private String nama,umur;
    private String pass1 ="NAMA";
    private String pass2 ="UMUR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        TextView txtLast = findViewById(R.id.txtLast);


        nama = getIntent().getStringExtra(pass1);
        umur = getIntent().getStringExtra(pass2);
        txtLast.setText("Beres! Sekarang "+nama+" udah bisa ngecek penggunaan HP mu tiap hari buat kamu ngatur waktu :)");

    }
}
