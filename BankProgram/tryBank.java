//Izabel Jipson
//tryBank Program
//This program uses the Account and Bank classes to add, deposit, withdraw, and remove from various accounts within the Bank
//May 2, 2023
public class tryBank {

	public static void main(String[] args) {
//welcome statement
		System.out.println("Welcome to Chase Banking!");
//sets up bank
		Bank Chase=new Bank();
		
//adds three different accounts with names and ids
		Account aud= new Account ("123","Audrey");
		Chase.addAccount(aud, "Audrey");
		Account iz= new Account ("456","Izabel");
		Chase.addAccount(iz, "Izabel");
		Account abby= new Account ("789","Abigail");
		Chase.addAccount(abby, "Abigail");

///prints all active accounts
		Chase.printAccounts();
		
//deposits money into all three accounts
		aud.Deposit(1243.00);
		iz.Deposit(8002.00);
		abby.Deposit(502.00);
		
//prints all active accounts
		Chase.printAccounts();

//overdrafts account
		aud.Withdrawal(2000.00);
		
//withdraws valid amount
		aud.Withdrawal(100.00);

//attempts to remove account that's not zeroed out
		Chase.removeAccount(aud.accountID, aud.balance, "Audrey");

//empty out account through withdrawal 
		aud.Withdrawal(1143.00);
		
//remove account now that account is 0
		Chase.removeAccount(aud.accountID, aud.balance, "Audrey");

//reprint all active accounts
		Chase.printAccounts();
		
	}

}

