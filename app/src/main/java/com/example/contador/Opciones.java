package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Opciones extends AppCompatActivity {

    Button Return;
    Button Graficos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciones);
        Return = findViewById(R.id.button8);
        Graficos = findViewById(R.id.button9);
        Return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irReturn();

            }
        });
        Graficos.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            irGraficos();

        }
    });
    }
    public void irReturn() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void irGraficos() {
        Intent intent = new Intent(this, Graficos.class);
        startActivity(intent);
    }
}
