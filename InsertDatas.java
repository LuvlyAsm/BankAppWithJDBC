package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertDatas{
	InsertDatas(String name,String password,int balance,String acNo){
		
		  String url = "jdbc:Mysql://localhost:3306/bankapp"; //bankApp - dB name 
	      String user = "root"; 
	      String pass = "MySQL@1234"; 
		
          String sql = "insert into credentials(name,password,balance,account_number)"+" values (?,?,?,?);";

		try {
			Connection connection = DriverManager.getConnection(url,user,pass); 
            Statement statement = connection.createStatement(); 
            PreparedStatement prepareStatement = connection.prepareStatement(sql);
            
            //Encryption
            Encryption encrypt = new Encryption();
            String temp=encrypt.encrypt(password);
            
            prepareStatement.setString(1,name);
            prepareStatement.setString(2,temp);
            prepareStatement.setInt(3,balance);
            prepareStatement.setString(4,acNo);
            

            Validation validate=new Validation();
            boolean resultValidation=validate.checkCredentials(name, password);
            
            if(resultValidation==true)
            {
            	int result = prepareStatement.executeUpdate(); 
            	 System.out.println("You're added");
            }
            else
           {
            	System.out.println("Enter Valid Details");  
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
