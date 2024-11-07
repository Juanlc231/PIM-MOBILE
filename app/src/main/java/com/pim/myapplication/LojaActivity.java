package com.pim.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class LojaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loja);

        // Configurar o RecyclerView para exibir os produtos
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Produto> suaListaDeProdutos = new ArrayList<>();
        suaListaDeProdutos.add(new Produto("Banana Prata"));  // Exemplo de adição de produto
        // Adicione mais produtos conforme necessário

        ProdutoAdapter adapter = new ProdutoAdapter(suaListaDeProdutos);
        recyclerView.setAdapter(adapter);

        // Configurar o botão para redirecionar para CarinhoActivity
        Button buttonCarrinho = findViewById(R.id.button_carrinho);
        buttonCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Iniciar a CarinhoActivity ao clicar no botão
                Intent intent = new Intent(LojaActivity.this, CarinhoActivity.class);
                startActivity(intent);
            }
        });
    }
}
