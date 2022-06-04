/*
		 * Title : Bank
		 * Author
		 * Created On 
		 * Updated on
		 * Reviewed by
		 * Reviewed at :date
		 */


package bank;

public class Bank {
    /*
     * Bank Application
     * We can perform Operations like check balance , withdraw amount, deposit, view transactions
     * 
     */
	public static void main(String[] args) {
		
		System.out.println("Welcome to Bank Management System");
		LogIn mainPage=new LogIn();
		mainPage.Validation();
	}  
}