package com.ifsc.contaclique;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

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
            //calcular imc
            //recuperar os dados de peso e altura
            double peso,altura,imc;
            peso = Double.parseDouble(edpeso.getText().toString());
            altura = Double.parseDouble(edaltura.getText().toString());
            imc = peso/altura;
            //Formatando 00,00

            DecimalFormat decimalformat=new DecimalFormat("##.##");
            tvresultado.setText(decimalformat.format(imc));
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Ciclo de vida","metodo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Ciclo de vida","metodo onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Ciclo de vida","metodo onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Ciclo de vida","metodo onRestart");
    }
}