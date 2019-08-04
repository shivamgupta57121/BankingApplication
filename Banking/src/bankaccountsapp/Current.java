package bankaccountsapp;

public class Current extends Accounts  {

	//List the properties specific to current account
	int debitCardNumber;
	int debitCardPin;
	
	//Constructor to initialize current account properties
	public Current(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random()*Math.pow(10,12));
		debitCardPin = (int) (Math.random()*Math.pow(10, 4));	
	}
	
	//List any methods specific to current account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Current");
		super.showInfo();
		System.out.println(
				" Your Current Account Features" + 
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card Pin:" + debitCardPin 
				);
	}
}
