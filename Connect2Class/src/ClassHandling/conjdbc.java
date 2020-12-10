package ClassHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amaan
 */
public class conjdbc {
    public static Connection con;
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/";
            String dbname ="cms";
            String user = "root";
            String pass = "root";
        
            Class.forName(driver);
            Connection con = (Connection)DriverManager.getConnection
            (
                    url+dbname,user,pass);
            return con; 
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
