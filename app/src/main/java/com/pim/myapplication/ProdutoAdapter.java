package com.pim.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoAdapter.ProdutoViewHolder> {
    private List<Produto> listaDeProdutos;

    public ProdutoAdapter(List<Produto> listaDeProdutos) {
        this.listaDeProdutos = listaDeProdutos;
    }

    @Override
    public ProdutoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_produto, parent, false);
        return new ProdutoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ProdutoViewHolder holder, int position) {
        Produto produto = listaDeProdutos.get(position);
        holder.nomeProduto.setText(produto.getNome());
    }

    @Override
    public int getItemCount() {
        return listaDeProdutos.size();
    }

    public static class ProdutoViewHolder extends RecyclerView.ViewHolder {
        public TextView nomeProduto;

        public ProdutoViewHolder(View view) {
            super(view);
            nomeProduto = view.findViewById(R.id.nome_produto);
        }
    }
}
