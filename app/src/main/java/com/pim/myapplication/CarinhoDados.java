package com.pim.myapplication;

import java.sql.PreparedStatement;
import java.sql.Connection;
import android.content.Context;
import java.sql.SQLException;

public class CarinhoDados {

    public static int insertCarrinho(CarrinhoD carrinhoD, Context ctx) {
        int resposta = 0;
        Connection con = null;  // Definir a conexão aqui, para garantir que ela seja fechada no final

        try {
            // Criando a instância da classe Conexao e obtendo a conexão
            con = new Conexao().conectar();

            if (con != null) {
                String sql = "INSERT INTO Carrinho (Produto, Preco, Quantidade, Subtotal) VALUES (?, ?, ?, ?)";
                PreparedStatement pst = con.prepareStatement(sql);

                // Configura os parâmetros da consulta SQL
                pst.setString(1, carrinhoD.getProduto());
                pst.setDouble(2, carrinhoD.getPreco());
                pst.setInt(3, carrinhoD.getQuantidade());
                pst.setDouble(4, carrinhoD.getSubtotal());

                // Executa a atualização
                resposta = pst.executeUpdate();
                pst.close();  // Fechar o PreparedStatement

            }
        } catch (SQLException e) {
            // Em caso de erro com o SQL
            e.printStackTrace();
            resposta = -1;
        } catch (Exception e) {
            // Outros tipos de erro
            e.printStackTrace();
            resposta = -1;  // Retornar um valor de erro
        } finally {
            // Garantir que a conexão seja fechada
            try {
                if (con != null && !con.isClosed()) {
                    con.close();  // Fechar a conexão
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return resposta;
    }
}
