package com.ifsc.contaclique;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);


            Bundle bundle= getIntent().getExtras();
            String msg= bundle.getString("mensaqem");
            TextView txtView = findViewById(R.id.txtAtt2);
            txtView.setText(msg);
        };
    }
