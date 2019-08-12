package bankaccountsapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountsApp {

	public static void main(String[] args) {
		
		List<Accounts> accounts = new LinkedList<Accounts>();		
		
//		Current Chacc1 = new Current("Shivam Gupta","123456789",12500);
//		Savings Svacc1 = new Savings("Preeti Gupta","987654321",16000);	
//		Svacc1.showInfo();
//		System.out.println("************");
//		Chacc1.showInfo();
		
		//Svacc1.compound();
		//Svacc1.deposit(5000);
		//Svacc1.withdraw(2000);
		//Svacc1.transfer("Paytm", 25000);
		
		
		//Read a CSV file then create new accounts based on that data
		String file ="E:\\git\\BankingApplication\\NewBankAccounts.csv";
		List <String[]> newAccountHolders = utilities.CSV.read(file); 
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + "  Rs" + initDeposit);
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Current")) {
				accounts.add(new Current(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		//accounts.get(5).showInfo();
		
		for(Accounts acc : accounts) {
			System.out.println("\n***************");
			 acc.showInfo();
		}
		
		System.out.println("\n *Number of new Accounts created " + accounts.size());
	}

}