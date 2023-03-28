package com.mycompany.pacifickode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chath
 */
public class DbConnection {
    
    public static Connection dbConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=null;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pasific_kode","root","DSa0717614816");
            return con;
            
        } catch (SQLException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
}
