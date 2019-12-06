package com.benjamin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoComprobarPrimo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_comprobar_primo);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textViewResultado);

        try {

            if (NumerosPrimos.esPrimo(Integer.parseInt(message))) {
                textView.setText("El número " + message + " sí es primo");
            } else {
                textView.setText("El número " + message + " no es primo");
            }
        } catch (NumberFormatException nfe){
            textView.setText("No se ha introducido un número entero válido");
        }
    }


}
