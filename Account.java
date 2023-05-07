//Izabel Jipson
//Account Class
//This class sets up deposit and withdrawal methods and accountIDs as well as a method to print all account info
//May 1, 2023

//initialize variables
public class Account {
	String accountID, customerName;
	double balance;

//account class to establish customer's accountID, name, and balance
public Account(String newaccountID, String newcustomerName){
		accountID=newaccountID;
		customerName=newcustomerName;
		balance=0.0;
	}

//method to deposit money into account
public boolean Deposit(double amount) {
		balance=balance+amount;
		System.out.format("\n\nSuccessful Deposit to %s's Account of $%.2f. \nNew Balance: %.2f",customerName, amount, balance);
		return true;
}

//method to withdraw money from account
public boolean Withdrawal(double amount) {
	if (balance>=amount) {
	balance=balance-amount;
	System.out.format("\n\nSuccessful Withdrawal from %s's Account of $%.2f. \nNew Balance: %.2f",customerName,amount, balance);
	return true;
	}
	else {
		System.out.format("\nInsufficient Funds in %s's Account to withdraw $%.2f",customerName,amount);
		return false;
	}
}


//method to print all Account Info: ID, name, balance
public void printAccountInfo() {
	System.out.format("\nAccount ID: %s \n Customer Name: %s \n Current Balance: %.2f\n",accountID,customerName,balance);
	
   }	
}
