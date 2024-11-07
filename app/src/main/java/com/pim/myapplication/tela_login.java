package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class tela_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encontrar o botão de login
        Button loginButton = findViewById(R.id.card_loja);

        // Definir a ação ao clicar no botão de login
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redirecionar para a MainActivity após o login
                Intent intent = new Intent(tela_login.this, LojaActivity.class);
                startActivity(intent);
            }
        });
    }
}
