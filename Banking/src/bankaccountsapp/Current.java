package bankaccountsapp;

public class Current extends Accounts  {

	//List the properties specific to current account
	int debitCardNumber;
	int debitCardPin;
	
	//Constructor to initialize current account properties
	public Current(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("New Current Account");
	}
	
	//List any methods specific to current account
	
}
