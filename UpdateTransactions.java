package bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateTransactions {
	
	String url = "jdbc:Mysql://localhost:3306/bankapp"; //bankApp - dB name 
    String user = "root"; 
    String pass = "MySQL@1234";
	
	UpdateTransactions(String sqlName,int amount,int id){

		  String url = "jdbc:Mysql://localhost:3306/bankapp"; //bankApp - dB name 
	      String user = "root"; 
	      String pass = "MySQL@1234"; 
	      String sql="";
	      
	   if(id==1) {
         sql = "update credentials set balance=balance+"+amount+" where name='"+sqlName+"';";
	   }
	   
	   else if(id==2) {
	     sql = "update credentials set balance=balance-"+amount+" where name='"+sqlName+"';";
	   }
	   
		try {
			
		  Connection connection = DriverManager.getConnection(url,user,pass); 
          Statement statement = connection.createStatement(); 
          PreparedStatement prepare = connection.prepareStatement(sql);
          int result =prepare.executeUpdate(); 
          
          if(id==1) {
        	  sql="insert into transaction_history values('"+sqlName+"',"+"'+"+amount+"');";
          }
          if(id==2) {
        	   
        	  sql="insert into transaction_history values('"+sqlName+"',"+"'-"+amount+"');";
          }
          PreparedStatement prepared = connection.prepareStatement(sql);
          int resultt =prepared.executeUpdate();
          
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
	
	UpdateTransactions(String sqlName){
		   
	      String sql="select balance from Credentials where name='"+sqlName+"';";
	      
	      try
	        {      //Class.forName("com.mysql.cj.jdbc.Driver");
	        	Connection connection = DriverManager.getConnection(url,user,pass); 
	            Statement statement = connection.createStatement(); 
	            PreparedStatement prepareStatement = connection.prepareStatement(sql);
	            ResultSet result = prepareStatement.executeQuery(); 
	            
	            System.out.println(result.getInt(1));
	           
	            statement.close();
	            connection.close();
	        } 
	      catch(Exception ex) {
	    	  System.out.println(ex);
	      }
	      finally {
	    	  System.out.println("Done");
	      }
	}
}
