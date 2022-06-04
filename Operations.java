package bank;

import java.util.Scanner;

public class Operations {
	static Scanner scan=new Scanner(System.in);
	void Operation(String sqlName){
        System.out.println("Enter to Continue\n1.Deposit\n2.Withdraw\n3.Balance\n4.Transaction History\n");
        String input=scan.next();
        switch(input){
            case "1":Deposit(sqlName);
                break;
            case "2":Withdraw(sqlName);
                break;
            case "3":Balance(sqlName);
                break;
            case "4":Transaction(sqlName);
                break;
            default:
                System.out.println("Invalid");
                Operation(sqlName);
        }
    }

    void Deposit(String sqlName){
        System.out.println("Enter a Amount to be Deposit...");
         int amount=scan.nextInt();
         int id=1;
         UpdateTransactions update=new UpdateTransactions(sqlName,amount,id);
         System.out.println("After Deposit Account Balance is ");
         Balance(sqlName);
    }
    void Withdraw(String sqlName){
        System.out.println("Enter How Much You Want to Withdraw...");
        int amount=scan.nextInt();
        int id=2;
        UpdateTransactions update=new UpdateTransactions(sqlName,amount,id);
        System.out.println("After Withdrawal Account Balance is ");
        Balance(sqlName);
    }
    void Balance(String sqlName){
        System.out.println("Your Account Balance is ");
        UpdateTransactions balance=new UpdateTransactions(sqlName);
        Operation(sqlName);
    }

    void Transaction(String sqlName){
    	UpdateTransactions update=new UpdateTransactions(sqlName);
        Operation(sqlName);
    }
    void logOut() {
    	LogIn l=new LogIn(); //change
    	l.Validation();
    }
   
  }

