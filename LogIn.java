package bank;


import java.util.Scanner;

public class LogIn {                                    
	
	LogIn(){}
	
	String name,password;
    int amount;
    Scanner scan=new Scanner(System.in);
    //constructor
    LogIn(String name,String password,int amount){
        this.name=name;
        this.password=password;
        this.amount=amount;}
    
	void Validation(){ //change
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to our ABC Bank...\nEnter to continue....\n1.LogIn\n2.Signup");
        int n = scan.nextInt(); //change
        if(n==1){
            System.out.println("Enter Username");
            String name=scan.next();
            System.out.println("Enter Password");
            String pass=scan.next();
            
            CheckDatas customer=new CheckDatas(name,pass);
           /* for(LogIn_SignUp s:accounts){
               if(name.equals(s.getName())&&pass.equals(s.getPass())){
                   System.out.println("Logged In Successfully");
                   s.Operation();}
               else{ System.out.println(); }
               }   */    
        }
        else if(n==2){
            System.out.println("Enter Username");
            String name=scan.next();
            System.out.println("Enter Password");
            String pass=scan.next();
            System.out.println("Enter amount");
            int amt=scan.nextInt();
            System.out.println("Enter Account Number");
            String accountNumber=scan.next();
            InsertDatas userDatas=new InsertDatas(name,pass,amt,accountNumber);
     //       accounts.add(b);
     //     b.Operation();
        }
        else{
            System.out.println("Input Invalid");
        }
	}
    
    //return for check
  /*  String getName(){return name;}
    String getPass(){return password;}
    */
    

}
