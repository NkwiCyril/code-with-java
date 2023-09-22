package banking_application;

public class Main {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		System.out.println(bank.balance);
	}
}

class BankAccount {
	int balance; // automatically has the value zero
	int previousTransaction;
	String customerName;
	int customerId;

	void deposit(int amount) {
		if (amount > 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
	}

	void withdraw(int amount) {
		if (amount > 0)
		balance = balance - amount;
		previousTransaction = -amount;
	}

	void getPreviousTransaction() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No previous transaction.");
		}
	}

	void showMenu() {
		
	}

}
