package com.example.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class SegundaActivity extends AppCompatActivity {

    Button iniciarsesion;
    TextView sincuenta;

    EditText ingreemail;
    TextInputEditText ingrecontraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        iniciarsesion = findViewById(R.id.iniciarsesion);
        sincuenta = findViewById(R.id.sincuenta);

        ingreemail = findViewById(R.id.ingreemail);
        ingrecontraseña = findViewById(R.id.ingrecontraseña);

        iniciarsesion.setOnClickListener(v -> {

            String email = ingreemail.getText().toString().trim();
            String contraseña = ingrecontraseña.getText().toString().trim();

            // ✅ VALIDACIÓN EMAIL OBLIGATORIO
            if (email.isEmpty()) {
                ingreemail.setError("Ingrese su email");
                ingreemail.requestFocus();
                return;
            }

            // (opcional pero recomendable)
            if (!email.contains("@")) {
                ingreemail.setError("Email inválido");
                ingreemail.requestFocus();
                return;
            }

            // ✅ VALIDACIÓN CONTRASEÑA OBLIGATORIA
            if (contraseña.isEmpty()) {
                ingrecontraseña.setError("Ingrese su contraseña");
                ingrecontraseña.requestFocus();
                return;
            }

            // 🔥 EXTRAER NOMBRE DEL EMAIL
            String usuario = email.substring(0, email.indexOf("@"));

            Intent intent = new Intent(SegundaActivity.this, cuartoActivity.class);
            intent.putExtra("usuario", usuario);

            startActivity(intent);
        });

        sincuenta.setOnClickListener(v -> {
            Intent intent = new Intent(SegundaActivity.this, TerceraActivity.class);
            startActivity(intent);
        });
    }
}