
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectaBd {
        public Connection getConnection() throws SQLException{
            
    String url = "jdbc:mysql://localhost:3306/ventas_si";
    String user = "root";
    String password = "12345678";
    
    Connection cn = null;
    Statement stmt;
    ResultSet rs;
    
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                cn = DriverManager.getConnection(url,user,password);
                
            } catch (SQLException ex) {
                Logger.getLogger(ConectaBd.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return cn;
   }
}