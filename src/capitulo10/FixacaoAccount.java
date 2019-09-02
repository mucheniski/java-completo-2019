package capitulo10;

import java.util.Locale;
import java.util.Scanner;

import entities.Account3;
import exceptions.AccountException;

public class FixacaoAccount {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine(); // Consumir a quebra de linha do nextInt()
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account3 account = new Account3(number, holder, initialBalance, withdrawLimit);
			
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			
			account.withdraw(amount);
			
			System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
			
			
		} catch (AccountException accountException) {
			System.out.println("Withdraw error: " + accountException.getMessage());
		}
		
		sc.close();
		
	}

}
