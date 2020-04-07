package com.example.latihan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Regis extends AppCompatActivity {
    
    private String pass1 = "NAMA";
    private String pass2 = "UMUR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        Button send = findViewById(R.id.next);
        final EditText editText2 = findViewById(R.id.editText2);
        final EditText editText3 = findViewById(R.id.editText3);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = editText2.getText().toString();
                String umur = editText3.getText().toString();

                Intent i = new Intent(Regis.this, Last.class);
                i.putExtra(pass1,nama);
                i.putExtra(pass2,umur);
                startActivity(i);

            }
        });


    }
}
