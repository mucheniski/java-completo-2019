package entities;

public class Account {
	
	private int number;
	private String holder;
	private double initialDeposit;
	private double balance;
	
	public Account() {}

	public Account(int number, String holder) {		
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getInitialDeposit() {
		return initialDeposit;
	}

	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}

	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5.0;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public String toString() {
		return "Account: " + getNumber() + ", Holder: " + getHolder() + String.format(", Balance: $ %.2f%n", getBalance());
	}

}
