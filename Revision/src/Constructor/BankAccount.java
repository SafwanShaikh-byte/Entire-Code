package Constructor;

public class BankAccount {
	
	String accountNumber;
	String accountHolderName;
	double balance;
	
	BankAccount (String accountNumber,String accountHolderName,double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	void displayAccountInfo() 
	{
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Balance: " + balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new  BankAccount("123456789","John Doe",1000.0);
		BankAccount account2 = new  BankAccount("987654321","Jane Smith",500.0);
		
		account.displayAccountInfo();
		account2.displayAccountInfo();

	}

}
