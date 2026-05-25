package com.example.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_tercera);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());

            v.setPadding(systemBars.left, systemBars.top,
                    systemBars.right, systemBars.bottom);

            return insets;
        });

        // BOTONES
        button3 = findViewById(R.id.button3);

        register = findViewById(R.id.register);

        // CAMPOS
        ingrenombre = findViewById(R.id.ingrenombre);

        ingremail = findViewById(R.id.ingremail);

        ingrcontas = findViewById(R.id.ingrcontas);

        confircontas = findViewById(R.id.confircontas);

        // BOTON LOGIN
        button3.setOnClickListener(v -> {

            Intent intent = new Intent(
                    TerceraActivity.this,
                    SegundaActivity.class
            );

            startActivity(intent);

        });

        // BOTON REGISTRARSE
        register.setOnClickListener(v -> {

            String nombre = ingrenombre.getText().toString().trim();

            String email = ingremail.getText().toString().trim();

            String contraseña = ingrcontas.getText().toString().trim();

            String confirmar = confircontas.getText().toString().trim();

            // VALIDAR NOMBRE
            if(nombre.isEmpty()){

                ingrenombre.setError("Ingrese su nombre");

                ingrenombre.requestFocus();

                return;
            }

            // VALIDAR EMAIL
            if(email.isEmpty()){

                ingremail.setError("Ingrese su email");

                ingremail.requestFocus();

                return;
            }

            // VALIDAR CONTRASEÑA
            if(contraseña.isEmpty()){

                ingrcontas.setError("Ingrese una contraseña");

                ingrcontas.requestFocus();

                return;
            }

            // VALIDAR CONFIRMAR CONTRASEÑA
            if(confirmar.isEmpty()){

                confircontas.setError("Confirme la contraseña");

                confircontas.requestFocus();

                return;
            }

            // VALIDAR SI COINCIDEN
            if(!contraseña.equals(confirmar)){

                confircontas.setError("Las contraseñas no coinciden");

                confircontas.requestFocus();

                return;
            }

            // ABRIR LOGIN
            Intent intent = new Intent(
                    TerceraActivity.this,
                    SegundaActivity.class
            );

            startActivity(intent);

        });
    }
}