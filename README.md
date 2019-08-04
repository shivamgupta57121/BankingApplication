# BankingApplication
An application to handle customer bank account and perform transactions.

Major highlights of this application: 
* Reads a .CSV file that will include names, Social Security numbers, account type and initial deposit.
* Uses proper data structure to hold these accounts.
* We have 2 types of accounts Savings and Current. Both savings and current accounts share the following properties:
  - deposit    
  - withdraw  
  - transfer  
  - print the info.  
* Both will have an 11 digit account number.  
Generated in this way : 1 or 2 depending on whether it's a savings account or a current 
account, last two digits of the Social Security Number(SSN), a unique 5-digit number and a random 3-digit number.
* Savings account holders are given a Locker and that's identified by 3-digit number and accesses with the 4-digit code.  
* Current account holders are assigned a debit card with a 12-digit number and a 4-digit PIN.
* Both accounts will use an interface that determines the base interest rate (In real time this information is gathered from some API. But I have written the API. )  
* Our savings account will use .25 less than the base rate and our current accounts will have 10% interest rate of base rate.  
* The show info method should reveal relevant account information as well as information specific to the current account or savings account.  
