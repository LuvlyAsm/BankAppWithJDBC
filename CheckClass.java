package bank;

public class CheckClass {

	public static void main(String[] args) {
		Encryption e=new Encryption();
		String s=e.encrypt("Mahesh@123456");
		System.out.println(s);
		
		
	//InsertDatas a1=new InsertDatas("jajanjsja","jsjsjs",12345,"ABCD123456733");	
		
	//CheckDatas c=new CheckDatas("ASM","Password@123");
	
		
		UpdateTransactions balance=new UpdateTransactions("ASM");
		
		
	Validation v=new Validation();
	v.checkCredentials("haiaiaia", "asdf12344@A");
	System.out.println("amsnsvbsnmdnb");
	
	}
}
