/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author buiqu
 */
public class ConnectionDB {
    public static Connection getConnection() {
		Connection con = null;
	    String sqlInstanceName = "MYLAPTOP\\SQLEXPRESS:1433";
	    String database = "Sinhvien";
	    String userName = "sa";
	    String password = "sa";	
        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://" + sqlInstanceName + ";databaseName=" + database + ";user=" + userName + ";password=" + password;
        
        try{
        	con = DriverManager.getConnection(connectionUrl); 
        	
        	if (con != null) {
                System.out.println("Connected");
            }else {
            	System.out.println("Khong ket noi duoc voi database");
            }
        	
            return con;
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Khong ket noi duoc voi database");
            return con;
        }
    }
     public static void main(String[] args) {
         
     
}

    static Connection getMyConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
