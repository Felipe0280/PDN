package com.ifsc.contaclique;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.ifsc.contaclicks.R;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    int i=0;
    EditText edpeso,edaltura;
    TextView tvresultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edpeso=findViewById(R.id.edpeso);
        edaltura=findViewById(R.id.edaltura);
        tvresultado=findViewById(R.id.tvresultadoimc);
        buttonCalcular=findViewById(R.id.button);
        //define um tratamento do botão
        buttonCalcular.setOnClickListener(v->{
           Intent intent = new Intent(getApplicationContext(), MainActivityB.class);
            double valorPeso = Double.parseDouble(edpeso.getText().toString());
            double valorAltura = Double.parseDouble(edaltura.getText().toString());
            String resultado = String.valueOf(Double.valueOf(valorPeso/(valorAltura*valorAltura)));

           intent.putExtra("mensagem",resultado);
           startActivity(intent);
        });

    }

}