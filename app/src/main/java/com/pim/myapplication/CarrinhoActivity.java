package com.pim.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class CarrinhoActivity extends AppCompatActivity {
    private AppCompatTextView Nomep;
    private AppCompatTextView PrecoP;
    private AppCompatTextView QuantiP;
    private AppCompatTextView Subtotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrinho);

        // Inicializando as TextViews
        Nomep = findViewById(R.id.nome_produto1);
        PrecoP = findViewById(R.id.preco_produto1);
        QuantiP = findViewById(R.id.quantidadeP);
        Subtotal = findViewById(R.id.subtotal);

        // Configurando o botão para o próximo passo (Frete)
        Button buttonFrete = findViewById(R.id.para_frete);
        buttonFrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Pegando os dados dos TextViews
                String nomeProduto = Nomep.getText().toString();
                String precoProduto = PrecoP.getText().toString();
                String quantidadeProduto = QuantiP.getText().toString();
                String subtotalProduto = Subtotal.getText().toString();

                // Verificando se os campos não estão vazios
                if (nomeProduto.isEmpty() || precoProduto.isEmpty() || quantidadeProduto.isEmpty() || subtotalProduto.isEmpty()) {
                    Toast.makeText(CarrinhoActivity.this, "Todos os campos devem ter valores", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    // Convertendo os dados dos TextViews para os tipos adequados
                    double preco = Double.parseDouble(precoProduto);
                    int quantidade = Integer.parseInt(quantidadeProduto);
                    double subtotal = Double.parseDouble(subtotalProduto);

                    // Criando o objeto CarrinhoD com os dados dos TextViews
                    CarrinhoD carinho = new CarrinhoD(
                            nomeProduto,   // Nome do produto
                            preco,         // Preço do produto
                            quantidade,    // Quantidade
                            subtotal       // Subtotal
                    );

                    // Executando a inserção de dados no banco de dados de forma assíncrona
                    new InsertCarrinhoTask().execute(carinho); // Passando o objeto 'carrinho'

                } catch (NumberFormatException e) {
                    // Caso algum dos campos numéricos tenha formato inválido
                    Toast.makeText(CarrinhoActivity.this, "Erro ao processar os dados. Verifique os valores.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    // Classe AsyncTask para inserir os dados no banco de forma assíncrona
    private class InsertCarrinhoTask extends AsyncTask<CarrinhoD, Void, Integer> {

        @Override
        protected Integer doInBackground(CarrinhoD... params) {
            // Recebendo o objeto carrinho
            CarrinhoD carinhoD = params[0]; // Pegando o objeto passado
            return CarinhoDados.insertCarrinho(carinhoD, CarrinhoActivity.this);
        }

        @Override
        protected void onPostExecute(Integer resposta) {
            super.onPostExecute(resposta);

            if (resposta > 0) {
                Toast.makeText(CarrinhoActivity.this, "Produto adicionado ao carrinho", Toast.LENGTH_SHORT).show();
                // Navegar para a próxima tela (FreteActivity)
                Intent intent = new Intent(CarrinhoActivity.this, FreteActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(CarrinhoActivity.this, "Falha ao adicionar produto", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
