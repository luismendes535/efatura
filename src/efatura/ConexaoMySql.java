/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package efatura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Mendes
 */
public class ConexaoMySql {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://127.0.0.1:3306/efatura";
    String user = "root";
    String password ="12345678";
    String driver = "com.mysql.jdbc.Driver";
    
    public void openConnectionMySql(){
        try{
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url, user, password);
            stmt= con.createStatement();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão do banco de dados", "ERRO", JOptionPane.ERROR_MESSAGE, null);
        }
    }
}
