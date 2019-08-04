package bankaccountsapp;

public class Savings extends Accounts {

	//List the properties specific to savings account
	int lockerID;
	int lockerKey;
	
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setLocker();
	}
	
	private void setLocker() {
		lockerID = (int) (Math.random()*Math.pow(10,3));
		lockerKey = (int) (Math.random()*Math.pow(10, 4));
	}
	
	
	//List any methods specific to savings account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				" Your Savings Account Features" + 
				"\n Locker ID: " + lockerID +
				"\n Locker Key:" + lockerKey 
				);
	}
	
}
