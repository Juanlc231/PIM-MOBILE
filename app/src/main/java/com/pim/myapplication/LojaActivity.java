package com.pim.myapplication;

import android.os.Bundle;
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

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Produto> suaListaDeProdutos = new ArrayList<>();
        suaListaDeProdutos.add(new Produto("Banana Prata"));  // Exemplo de adição de produto
        // Adicione mais produtos conforme necessário

        ProdutoAdapter adapter = new ProdutoAdapter(suaListaDeProdutos);
        recyclerView.setAdapter(adapter);
    }
}
