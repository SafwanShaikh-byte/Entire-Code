package OOPS;

public class EnacpsulationBank {

	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit amount must be positive.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		} else {
			System.out.println("Insufficient balance or invalid amount.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EnacpsulationBank account = new EnacpsulationBank();
		account.deposit(10);
		account.withdraw(200);
				
		System.out.println("Final Balance: " + account.balance);

	}

}
