package com.example.cafeteria;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        // Botón Empezar
        button.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    SegundaActivity.class
            );

            startActivity(intent);

        });

        // Botón Log In
        button2.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    SegundaActivity.class
            );

            startActivity(intent);

        });
    }
}