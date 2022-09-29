package com.example.a03ejerciciopalabrascaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;
import java.util.Set;

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
            if (bundle.containsKey("PALABRAS")){
                String frase = bundle.getString("PALABRAS");
                String[] palabras = frase.split(" ");
                txtResultado.setText("NÚMERO PALABRAS: "+palabras.length);

            }
            if (bundle.containsKey("CARACTERES")){
                String frase = bundle.getString("CARACTERES");
                txtResultado.setText("NÚMERO CARACTERES: "+frase.length());
            }

        }
    }

    private void inicializaVistas() {
        txtResultado = findViewById(R.id.txtResultadoPalabra);
    }
}