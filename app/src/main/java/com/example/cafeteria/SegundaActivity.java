package com.example.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SegundaActivity extends AppCompatActivity {

    Button iniciarsesion;
    TextView sincuenta;

    TextInputEditText ingrecontraseña;

    android.widget.EditText ingreemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        iniciarsesion = findViewById(R.id.iniciarsesion);

        sincuenta = findViewById(R.id.sincuenta);

        ingreemail = findViewById(R.id.ingreemail);

        ingrecontraseña = findViewById(R.id.ingrecontraseña);

        // BOTON INICIAR SESION
        iniciarsesion.setOnClickListener(v -> {

            String email = ingreemail.getText().toString().trim();

            String contraseña = ingrecontraseña.getText().toString().trim();

            // VALIDAR EMAIL
            if(email.isEmpty()){

                ingreemail.setError("Ingrese su email");

                ingreemail.requestFocus();

                return;
            }

            // VALIDAR CONTRASEÑA
            if(contraseña.isEmpty()){

                ingrecontraseña.setError("Ingrese su contraseña");

                ingrecontraseña.requestFocus();

                return;
            }

            // ABRIR ACTIVITY
            Intent intent = new Intent(
                    SegundaActivity.this,
                    cuartoActivity.class
            );

            startActivity(intent);

        });

        // CREAR CUENTA
        sincuenta.setOnClickListener(v -> {

            Intent intent = new Intent(
                    SegundaActivity.this,
                    TerceraActivity.class
            );

            startActivity(intent);

        });
    }
}