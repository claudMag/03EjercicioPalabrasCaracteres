package com.example.a03ejerciciopalabrascaracteres;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.IllegalFormatCodePointException;
import java.util.Set;
import java.util.StringTokenizer;

public class PalabraActivity extends AppCompatActivity {

    private EditText txtResultado; //ha usato un textview
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palabra);

        inicializaVistas();

        //Obtener informacion enviada
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null){
            String frase = bundle.getString("FRASE");
            int operacion = bundle.getInt("OPERACION");
            //if (operacion == MainActivity.PALABRAS){
            if (operacion == R.id.btnPalabrasMain){
                int resultado = contarPalabras(frase);
                txtResultado.setText("Palabras: "+resultado);
            }
            else if(operacion == R.id.btnCaracteresMain){
               int resultado = contarCaracteres(frase);
               txtResultado.setText("Caracteres: "+resultado);
            }
            else{
                txtResultado.setText("ERROR OPERACIÓN");
            }
        }
    }

    private int contarCaracteres(String frase) {
        return frase.length();
    }

    private int contarPalabras(String frase) {
        //elimina todos los tokens que se quedan vacios, por defecto el separador es el espacio
        //si no seria new StringTokenizer(frase, "-");
        StringTokenizer stringTokenizer = new StringTokenizer(frase);

        return stringTokenizer.countTokens();
    }

    private void inicializaVistas() {

        txtResultado = findViewById(R.id.txtResultadoPalabra);
    }
}