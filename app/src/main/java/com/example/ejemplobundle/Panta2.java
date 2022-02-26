package com.example.ejemplobundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Panta2 extends AppCompatActivity {

    private Button recu;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panta2);

        recu=findViewById(R.id.btnrecuperar);
        texto=findViewById(R.id.txtvista);

        recu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = getIntent().getExtras();
                String title = bundle.getString("key_1");
                boolean b = bundle.getBoolean("key_2");
                texto.setText(title+b);

            }
        });

    }
}