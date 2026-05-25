package com.example.cafeteria;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import androidx.activity.EdgeToEdge;

public class cuartoActivity extends AppCompatActivity {

    TextView txtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cuarto);

        txtUsuario = findViewById(R.id.txtUsuario);

        String usuario = getIntent().getStringExtra("usuario");

        if (usuario != null) {
            txtUsuario.setText("Bienvenido " + usuario);
        }
    }
}