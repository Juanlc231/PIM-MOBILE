package com.pim.myapplication;

import android.content.Context;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDados {

    public static int insertEndereco(EnderecoD enderecoD, Context ctx){
        int resposta = 0;

        Connection con = null;

        try {
            con = new Conexao().conectar();

            if(con!=null){
                String sql = "INSERT INTO Endereco (Nome,Cep,Rua,Numero, Complemento) VALUES (?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);

                //paramestros sql
                pst.setString(1, EnderecoD.getNome());
            }
        }
    }
}
