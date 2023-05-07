//Izabel Jipson
//Bank Class
//This class holds all accounts and has ability to add, remove, and print all active accounts
//May 2, 2023

//import HashMap library
import java.util.HashMap;

//initialize variables in HashMap
public class Bank {
	HashMap<String, Account> bank= new HashMap<String, Account>();
	
//method to add accounts to Bank 
	public boolean addAccount (Account newAccount, String customerName) {
			bank.put(newAccount.accountID,  newAccount);
			System.out.format("\n%s's Account Sucessfully Added",customerName);
			return true;
		}
	
//method to remove accounts from Bank
	public boolean removeAccount(String accountID, double balance, String customerName) {
		if (bank.containsKey(accountID)&& (balance==0.0)) {
			bank.remove(accountID);
			System.out.format("\n\n%s's Account Sucessfully Removed",customerName);
			return true;
		}
		else {
			System.out.format("\n\n%s's Account Was Not Removed. Zero Out Balance and Try Again",customerName);
			return false;	
		}
	}
	
//method to print all accounts in Bank 
	public void printAccounts() {
		System.out.println("\n\n\nActive Accounts:");
		Account temp;
		for(Object key: bank.keySet()) {
			temp= (Account)bank.get(key);
			temp.printAccountInfo();
			
		}
	}
	}