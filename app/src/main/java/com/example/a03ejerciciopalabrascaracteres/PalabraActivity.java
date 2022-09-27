package com.example.a03ejerciciopalabrascaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class PalabraActivity extends AppCompatActivity {

    private EditText txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabra);

        inicializaVistas();

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();


        if (bundle != null){
            String frase = (String) bundle.getString("FRASE");
            String[] palabras = frase.split(" ");
            txtResultado.setText("NÚMERO PALABRAS: "+palabras.length);

        }
    }

    private void inicializaVistas() {
        txtResultado = findViewById(R.id.txtResultadoPalabra);
    }
}