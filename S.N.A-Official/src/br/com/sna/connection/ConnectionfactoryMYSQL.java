/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sna.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Danilo
 */
public class ConnectionfactoryMYSQL {
    
    public static Connection con;
    public static PreparedStatement pstm;
    public static ResultSet rs;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://127.0.0.1/sna_beta";
    String user = "root";
   // String password = "";
   String password = "12345";

    //metodo que conecta ao banco
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Não encontrar o Driver"+ex);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar ao Banco"+ex);
        }
        return con;
    }//fim

    //metodo que desconecta ao banco
    public void desconectar() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
