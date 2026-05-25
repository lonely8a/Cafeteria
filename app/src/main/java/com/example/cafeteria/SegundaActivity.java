package com.example.cafeteria;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends  AppCompatActivity {
    Button iniciarsesion;
    TextView sincuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        iniciarsesion = findViewById(R.id.iniciarsesion);

        sincuenta = findViewById(R.id.sincuenta);

        // BOTON INICIAR SESION -> ACTIVITY_CUARTO
        iniciarsesion.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SegundaActivity.this,
                    cuartoActivity.class
            );

            startActivity(intent);

        });

        // TEXTO CREAR UNA CUENTA -> ACTIVITY_TERCERA
        sincuenta.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SegundaActivity.this,
                    TerceraActivity.class
            );

            startActivity(intent);
        });
    }
}