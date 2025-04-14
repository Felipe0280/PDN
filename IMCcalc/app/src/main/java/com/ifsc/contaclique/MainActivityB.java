package com.ifsc.contaclique;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ifsc.contaclicks.R;

public class MainActivityB extends AppCompatActivity {
    ImageView imageview;
    Integer[] imagens= new Integer[]{
            R.drawable.spinosaurus
    };
    int posicao = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

            Bundle bundle= getIntent().getExtras();
            String msg= bundle.getString("mensaqem");
            TextView txtView = findViewById(R.id.txtAtt2);
            txtView.setText(msg);

           //imageview.setImageResource(imagens(posicao));

        };
    }
