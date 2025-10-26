package ExceptionsHandling;

public class RealWorldScenario {
	
	private double balance = 5000.50;
	
	void withdraw(double amount) throws Exception
	{
	if (amount>balance) {
		throw new Exception("Insufficient funds for withdrawal of " + amount);
	} 
	else 
	{
		balance -= amount;
		System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealWorldScenario atm = new RealWorldScenario();
		try {
			atm.withdraw(5000);
		} 
		catch (Exception e)
		{
			System.out.println("Transaction failed: " + e.getMessage());
		}

	}

}
