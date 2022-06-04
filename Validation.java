package bank;

public class Validation {
	
	public boolean checkCredentials(String name,String password) {
		int button=0;
		if(name.length()>4) {
			button++;
			System.out.println(button);
		}
	
        int small_Switch=0,caps_Switch=0,number_Switch=0,spChar_Switch=0;
        
        if(password.length()>=8)
        {
        	for(int i=0;i<password.length();i++)
        	{
        		if(spChar_Switch==0 && password.charAt(i)=='@' || password.charAt(i)=='$' || password.charAt(i)=='%' ||
        				password.charAt(i)=='#') {
        			spChar_Switch=1;
        			button++;
        		}
        		else if(small_Switch==0 && password.charAt(i)>=97 && password.charAt(i)<=122){
        			small_Switch=1;
        			button++;
        		}
        		else if(caps_Switch==0 && password.charAt(i)>=65 && password.charAt(i)<=90) {
        			caps_Switch=1;
        			button++;
        		}
        		else if(number_Switch==0 && password.charAt(i)>=48 && password.charAt(i)<=57) {
        			number_Switch=1;
        			button++;
        		}
        	}
        }
        System.out.println(button);
        if(button==5) 
        	return true;
        else
        	return false;
		
	}

}
