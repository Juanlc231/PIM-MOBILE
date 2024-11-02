// CarrinhoActivity.java
package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class CarrinhoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        // Obtendo a referência ao botão
        Button buttonStatusPedido = findViewById(R.id.button_pedido);

        // Configurando o evento de clique no botão
        buttonStatusPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciando a StatusPedidoActivity
                Intent intent = new Intent(CarrinhoActivity.this, StatusPedidoActivity.class);
                startActivity(intent);
            }
        });
    }
}
