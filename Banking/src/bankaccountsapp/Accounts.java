package bankaccountsapp;

//we will not be able to create object

public abstract class Accounts implements IBaseRate {
	//List common properties for savings and checking account
	String name;
	String sSN ;
	double balance;
	
	static int index=10000;
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize the account
	public Accounts(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;

		//Sets account number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	
	//List common methods 
	public void deposit(double amount) {
		balance+= amount;
		System.out.println("Depositing: Rs"+ amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		if(balance>amount+5000) {
			balance-= amount;
			System.out.println("Successfull Withdrawal of Rs" +amount);
			printBalance();
		}
		else System.out.println("Insufficient Balance");
	}
	
	public void transfer(String toWhere , double amount) {
		if(balance>amount+5000) {
			balance-= amount;
			System.out.println("Transferring Rs" + amount + " to " + toWhere);
			printBalance();
		}
		else System.out.println("Insufficient Balance");
	}
	
	public void printBalance() {
		System.out.println("Your Balance is now: Rs" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: "+ accountNumber +
				"\nBALANCE: "+ balance +
				"\nRate: "+ rate
				);
	}
	
}
