package com.pim.myapplication;

import android.content.Context;
import java.sql.PreparedStatement;

public class CarinhoDados {

    public static int insertCarrinho(CarrinhoD carrinhoD, Context ctx){ //CarrinhoD = Dados do carrinho
        int resposta = 0;

        try {
            PreparedStatement pst = Conexao.conectar(ctx).prepareStatement(
                    "Insert Into Carrinho(Produto,Preco,Quantidade,Subtotal" +
                            "values(?,?,?,?)"//os itens "Produto,Preco,Quantidade,Subtotal" entraram aqui, nas interrogacoes.
            );
            pst.setString(1,carrinhoD.getProduto());
            pst.setDouble(2,carrinhoD.getPreco());
            pst.setInt(3,carrinhoD.getQuantidade());
            pst.setDouble(4,carrinhoD.getSubtotal());

            resposta = pst.executeUpdate();
        }catch (Exception e)  {
            e.getMessage();
        }
        return resposta;
    }
}
