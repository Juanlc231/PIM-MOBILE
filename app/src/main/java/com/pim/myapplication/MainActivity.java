package com.pim.myapplication;

import android.annotation.SuppressLint;
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

        // Certifique-se de que está no método onCreate da MainActivity

// CardView para redirecionar à tela de Carrinho (com o ID card_carrinho)
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) CardView cardCarrinho = findViewById(R.id.card_carrinho);
        cardCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redirecionar para a CarinhoActivity
                Intent intent = new Intent(MainActivity.this, CarrinhoActivity.class);
                startActivity(intent);
            }
        });

        // CardView para redirecionar à tela de Status do Pedido (com o ID card_status_pedido)
        CardView cardStatusPedido = findViewById(R.id.card_status_pedido);
        cardStatusPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Redirecionar para a StatusPedidoActivity
                Intent intent = new Intent(MainActivity.this, StatusPedidoActivity.class);
                startActivity(intent);
            }
        });
    }
}
