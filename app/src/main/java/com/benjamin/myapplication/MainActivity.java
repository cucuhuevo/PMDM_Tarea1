package com.benjamin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Se ejecuta cuando se presiona el botón para comprobar si el número es primo */
    public void presionarBotonComprobar(View view) {
        Intent intent = new Intent(this, ResultadoComprobarPrimo.class);
        EditText editTextNumero = (EditText) findViewById(R.id.editTextNumero);
        String message = editTextNumero.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
