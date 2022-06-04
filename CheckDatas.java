package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CheckDatas {
    CheckDatas(String name,String password){
		  String url = "jdbc:Mysql://localhost:3306/bankapp"; //bankApp - dB name 
	      String user = "root"; 
	      String pass = "MySQL@1234"; 
	      
	      Encryption object=new Encryption();
	      
	      String sqlName="",sqlPassword="";
	      
          String sql = "select password from credentials where name ='"+name+"';";

		try {
			
			Connection connection = DriverManager.getConnection(url,user,pass); 
            Statement statement = connection.createStatement(); 
            //PreparedStatement p = connection.prepareStatement(sql);
            
            sqlName=name;
            ResultSet result =statement.executeQuery(sql); 
            while (result.next()) {
            	sqlPassword=result.getString(1);
			}
            
            sqlPassword=object.decrypt(sqlPassword);       
            
            if(name.equals(sqlName)&&password.equals(sqlPassword)) {
            	System.out.println("Logged In");
            	Operations operation=new Operations();
            	operation.Operation(sqlName);
            }
            
            statement.close();
            connection.close();
		}
		catch(Exception exception) {
			System.out.println(exception);
		}
		finally {
			System.out.println("Done");
		}
	
	}
   
    
}
