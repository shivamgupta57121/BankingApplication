package bankaccountsapp;

public class BankAccountsApp {

	public static void main(String[] args) {
		
		Current Chacc1 = new Current("Shivam Gupta","123456789",1250);
		
		Savings Svacc1 = new Savings("Preeti Gupta","987654321",16000);
		
		Svacc1.showInfo();
		System.out.println("************");
		Chacc1.showInfo();
		
		Svacc1.deposit(5000);
		Svacc1.withdraw(2000);
		Svacc1.transfer("Paytm", 25000);
		
		//Read a CSV file then create new accounts baesd on that data

	}

}
