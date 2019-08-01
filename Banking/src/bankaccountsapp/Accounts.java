package bankaccountsapp;

//we will not be able to create object

public abstract class Accounts implements IBaseRate {
	//List common properties for savings and checking account
	String name;
	String sSN ;
	double balance;
	
	String accountNumber;
	double rate;
	
	//Constructor to set base properties and initialize the account
	public Accounts(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("Name: "+ name + " SSN: " + sSN + " Balance: Rs " + balance );
	}
	
	//List common methods 
	
}
