package com.mycompany.pacifickode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author chath
 */
public class DbConnection {
    
    public static Connection dbConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/pasific_kode?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String username = "root";
            String password = "DSa0717614816";
//            register the URL of DB
            Connection conn = DriverManager.getConnection(url,username,password);
            return conn;
        
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
