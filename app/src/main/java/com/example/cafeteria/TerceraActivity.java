package com.example.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class TerceraActivity extends AppCompatActivity {

    Button button3;
    Button register;

    EditText ingrenombre;
    EditText ingremail;

    TextInputEditText ingrcontas;
    TextInputEditText confircontas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercera);

        button3 = findViewById(R.id.button3);
        register = findViewById(R.id.register);

        ingrenombre = findViewById(R.id.ingrenombre);
        ingremail = findViewById(R.id.ingremail);
        ingrcontas = findViewById(R.id.ingrcontas);
        confircontas = findViewById(R.id.confircontas);

        button3.setOnClickListener(v -> {
            startActivity(new Intent(TerceraActivity.this, SegundaActivity.class));
        });

        register.setOnClickListener(v -> {

            String nombre = ingrenombre.getText().toString().trim();
            String email = ingremail.getText().toString().trim();
            String contraseña = ingrcontas.getText().toString().trim();
            String confirmar = confircontas.getText().toString().trim();

            // ✅ VALIDAR NOMBRE
            if (nombre.isEmpty()) {
                ingrenombre.setError("Ingrese su nombre");
                ingrenombre.requestFocus();
                return;
            }

            // ✅ VALIDAR EMAIL
            if (email.isEmpty()) {
                ingremail.setError("Ingrese su email");
                ingremail.requestFocus();
                return;
            }

            if (!email.contains("@")) {
                ingremail.setError("Email inválido");
                ingremail.requestFocus();
                return;
            }

            // ✅ VALIDAR CONTRASEÑA
            if (contraseña.isEmpty()) {
                ingrcontas.setError("Ingrese una contraseña");
                ingrcontas.requestFocus();
                return;
            }

            // ✅ VALIDAR CONFIRMACIÓN
            if (confirmar.isEmpty()) {
                confircontas.setError("Confirme la contraseña");
                confircontas.requestFocus();
                return;
            }

            // ✅ VALIDAR COINCIDENCIA
            if (!contraseña.equals(confirmar)) {
                confircontas.setError("Las contraseñas no coinciden");
                confircontas.requestFocus();
                return;
            }

            // 🔥 EXTRAER USUARIO DEL EMAIL
            String usuario = email.substring(0, email.indexOf("@"));

            Intent intent = new Intent(TerceraActivity.this, cuartoActivity.class);
            intent.putExtra("usuario", usuario);

            startActivity(intent);
        });
    }
}