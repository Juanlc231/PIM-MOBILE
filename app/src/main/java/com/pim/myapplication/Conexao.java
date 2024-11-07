package com.pim.myapplication;

import android.content.Context;
import android.os.StrictMode;
import android.widget.Toast;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    //classe de conexao ao banco de dados

    public static Connection conectar(Context ctx)
    {
        //objeto de conexao
        Connection con = null;
        try{
            //adiciona politica para criacao de thread
            StrictMode.ThreadPolicy politica;
            politica = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(politica);
            //verifica se o drive de conexao esta importado no projeto
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            //configurar a conexao
            con = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.1;" + //ip da maquina local para poder achar o banco de dados (mudar em caso de precisar rodar em outra maquina)
                    "databaseName=Fazenda Cant Verd; user=JBNOOTBOOK\ruanc;passoword =;");

        }catch (SQLException e){
            //mensagem de erro
            Toast.makeText(ctx,"Servidor" +
                    "Indisponivel", Toast.LENGTH_SHORT).show();
        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }
        return con;
    }
}
