package bankaccountsapp;

public class Savings extends Accounts {

	//List the properties specific to savings account
	int lockerID;
	int lokerKey;
	
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("New Savings Account");
	}
	
	//List any methods specific to savings account
	
}
