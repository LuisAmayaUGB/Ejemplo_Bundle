package com.example.ejemplobundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button paso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paso=findViewById(R.id.btnpasar);

        paso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),Panta2.class);
                Bundle bundle = new Bundle();
                bundle.putString("key_1", "MainActivity greeted you with a HI");
                bundle.putBoolean("key_2", true);
                intent.putExtras(bundle);
                startActivity(intent);



            }
        });



    }
}