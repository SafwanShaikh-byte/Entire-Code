package StaticNonStatic;

public class common {
	
	//Static variables
	static String bankName = "National Bank";
	static double interestRate = 5.5;
	
	//Non-static variables
	String accountHolderName;
	int accountNumber;
	double balance;
	
	//constructor for initializing non-static variables
	
	common(String name, int accNum, double bal)
	{
		this.accountHolderName = name;
		this.accountNumber = accNum;
		this.balance = bal;
		
		System.out.println("Account created for: " + accountHolderName + " with account number : " + accountNumber + " Balance Available : " + balance + " at : " + bankName);
	}
	
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("Deposited " + amount + ". New balance: " + balance);
	}
	
	void withdraw(double amount)
	{
		if(amount <= balance)
		{
			balance -= amount;
			System.out.println("Withdrew " + amount + ". New balance: " + balance);
		}
		else
		{
			System.out.println("Insufficient balance for withdrawal of " + amount);
		}
	}
	
	static void updateInterestRate(double newRate)
	{
		interestRate = newRate;
		System.out.println("Updated interest rate to: " + interestRate);
	}
	
	void showAccountDetails()
	{
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Interest Rate: " + interestRate);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		common acc1 = new common("Alice", 1001, 5000);
		common acc2 = new common("Bob", 1002, 3000);
		
		//individual account operations
		acc1.deposit(1500);
		acc2.withdraw(500);
		
		//shared bank operations
		common.updateInterestRate(6.0);
		
		//show account details
		acc1.showAccountDetails();
		acc2.showAccountDetails();
		

	}

}
