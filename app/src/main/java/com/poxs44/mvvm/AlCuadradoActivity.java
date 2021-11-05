package com.poxs44.mvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoActivity extends AppCompatActivity {

    private EditText etAlcuadrado;
    private Button btAlcuadrado;
    private TextView tvAlcuadrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcuadrado);

        configView();
    }

    private void configView(){
        tvAlcuadrado = findViewById(R.id.tvAlcuardado);
        etAlcuadrado = findViewById(R.id.edAlcuadrado);
        btAlcuadrado = findViewById(R.id.btCalcular);

    }
}