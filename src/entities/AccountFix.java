package entities;

public class AccountFix {
	
	private Integer number;
	private String holder;	
	private Double balance;
		
	public AccountFix() {
	}
	
	public AccountFix(Integer number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;		
	}

}
