package com.poxs44.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoActivity extends AppCompatActivity {

    private EditText etAlcuadrado;
    private Button btAlcuadrado;
    private TextView tvAlcuadrado;
    private AlCuadradoViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcuadrado);

        configView();
    }

    private void configView(){
        viewModel= new ViewModelProvider(this).get(AlCuadradoViewModel.class);
        tvAlcuadrado = findViewById(R.id.tvAlcuardado);
        etAlcuadrado = findViewById(R.id.edAlcuadrado);
        btAlcuadrado = findViewById(R.id.btCalcular);


        btAlcuadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.alCuadrado(etAlcuadrado.getText().toString());
            }
        });

        final Observer<String> observer = new Observer<String>() {
            @Override
            public void onChanged(String resultado) {
                tvAlcuadrado.setText(resultado);
            }
        };
        viewModel.getResultado().observe(this,observer);
    }
}