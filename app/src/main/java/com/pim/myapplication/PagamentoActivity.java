package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PagamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagamento);

        Button buttonCarrinho = findViewById(R.id.voltar_carrinho);
        buttonCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PagamentoActivity.this, CarrinhoActivity.class);
                startActivity(intent);
            }
        });

        Button buttonFrete = findViewById(R.id.voltar_frete);
        buttonFrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PagamentoActivity.this, FreteActivity.class);
                startActivity(intent);
            }
        });

        Button buttonPedido = findViewById(R.id.button_confirmar_pedido);
        buttonPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PagamentoActivity.this, StatusPedidoActivity.class);
                startActivity(intent);
            }
        });
    }
}
