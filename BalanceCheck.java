package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BalanceCheck {
    
	BalanceCheck(String sqlName){
    	
		String url = "jdbc:Mysql://localhost:3306/bankapp"; //bankApp - dB name 
	    String user = "root"; 
	    String pass = "MySQL@1234";
	    String sql="select balance from credentials where name='"+sqlName+"';";
	    
	/*    Connection connection = DriverManager.getConnection(url,user,pass); 
        Statement statement = connection.createStatement(); 
        PreparedStatement prepare = connection.prepareStatement(sql);
        int result =prepare.executeUpdate(); 
       
     */ 
	    
	    
    }
}
