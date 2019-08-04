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
	}
	
	//List common methods 
	
	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random()*Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name +
				"\nACCOUNT NUMBER: "+ accountNumber +
				"\nBALANCE: "+ balance
				);
	}
	
}
