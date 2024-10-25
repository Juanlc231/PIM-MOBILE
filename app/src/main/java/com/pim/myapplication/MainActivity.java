package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView; // Certificando que estamos usando CardView

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // CardView para redirecionar à loja (mantendo o ID card_loja)
        CardView cardLoja = findViewById(R.id.card_loja);
        cardLoja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redirecionar para a LojaActivity
                Intent intent = new Intent(MainActivity.this, LojaActivity.class);
                startActivity(intent);
            }
        });
    }
}
