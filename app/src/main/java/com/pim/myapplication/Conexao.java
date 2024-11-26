package com.pim.myapplication;

import android.os.AsyncTask;
import android.os.Debug;
import android.os.StrictMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private static final String CLASSE = "net.sourceforge.jtds.jdbc.Driver";
    private static final String IP = "192.168.1.151";
    private static final String PORTA = "1433";
    private static final String BANCO = "Fazenda_Cant_Verd";
    private static final String USUARIO = "sa";
    private static final String SENHA = "root";

    public Conexao() {
        // Colocar o StrictMode apenas em DEBUG ou desenvolvimento, nunca em produção
        if (Debug.isDebuggerConnected()) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll()
                    .build();
            StrictMode.setThreadPolicy(policy);
        }
    }

    public Connection conectar() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC
            Class.forName(CLASSE);

            String urlConexao = "jdbc:jtds:sqlserver://" + IP + ":" + PORTA + ";databaseName=" + BANCO;
            conn = DriverManager.getConnection(urlConexao, USUARIO, SENHA);

        } catch (ClassNotFoundException e) {
            // Logger para capturar a falha na carga do driver
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            // Logger para capturar falhas de conexão
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, e);
        }

        return conn;
    }

}
