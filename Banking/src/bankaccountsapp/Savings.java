package bankaccountsapp;

public class Savings extends Accounts {

	//List the properties specific to savings account
	private int lockerID;
	private int lockerKey;
	
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setLocker();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - 0.25;
		
	}
	
	
	//List any methods specific to savings account
	
	private void setLocker() {
		lockerID = (int) (Math.random()*Math.pow(10,3));
		lockerKey = (int) (Math.random()*Math.pow(10, 4));
	}
	
	public void showInfo() {
		//System.out.println("ACCOUNT TYPE: Savings");
		super.showInfo();
		System.out.println(
				" Your Savings Account Features" + 
				"\n Locker ID: " + lockerID +
				"\n Locker Key:" + lockerKey 
				);
	}
	
}
