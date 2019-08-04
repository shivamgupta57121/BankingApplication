package bankaccountsapp;

public class BankAccountsApp {

	public static void main(String[] args) {
		
		Current Chacc1 = new Current("Shivam Gupta","111111101",1100);
		
		Savings Svacc1 = new Savings("Preeti Gupta","111111189",1100);
		
		Svacc1.showInfo();
		System.out.println("************");
		Chacc1.showInfo();
		
		//Read a CSV file then create new accounts baesd on that data

	}

}
