package com.ifsc.contaclique;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int i=0;
    EditText edPeso, edAltura;

    TextView textIMC;
    Button  btnCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edPeso=findViewById(R.id.edPeso);
        edAltura=findViewById(R.id.edAltura);
        textIMC=findViewById(R.id.textIMC);
        btnCalc=findViewById(R.id.btnCalc);


        btnCalc.setOnClickListener(v->{
            float peso=Float.parseFloat(edPeso.getText().toString());
            float altura=Float.parseFloat(edAltura.getText().toString());
            float IMC = peso/(altura*altura);

            textIMC.setText(Float.toString(IMC));
        });
    }
}