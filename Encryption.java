package bank;

public class Encryption {
	String username,Password;
    public String encrypt(String password) {
    	String temp="";
    	
    	for(int i=0;i<password.length();i++) {
    		int t=password.charAt(i)+1;
    		temp=temp+(char)t;	
    	                            }
    	Password=temp;
    	return Password;
                                                       }
    
    
    public String decrypt(String password) {
    	String temp="";
    	for(int i=0;i<password.length();i++) {
    		int t=password.charAt(i)-1;
    		temp=temp+((char)t);
    	}
    	Password=temp;
    	return Password;
    }
}
/*
 
        ArrayList<LogIn_SignUp> accounts=new ArrayList<>();
        LogIn_SignUp customer1=new LogIn_SignUp("ASM","Password@123",1200);
        LogIn_SignUp customer2=new LogIn_SignUp("Kavi","Kavi@1234",1100);
        LogIn_SignUp customer3=new LogIn_SignUp("Ravi","Ravi@123456",1000);
        LogIn_SignUp customer4=new LogIn_SignUp("Mahesh","Mahesh@123456",1000);
 * 
 */
