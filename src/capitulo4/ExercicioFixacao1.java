package capitulo4;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicioFixacao1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		

		System.out.print("Enter account number: ");	
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine(); // Consumir a quebra de linha do nextInt()
		String holder = sc.nextLine();		
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char option = sc.next().charAt(0);
		
		Account account = new Account(number, holder);
		
		if (option == 'y') {
			System.out.print("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();	
			account.deposit(initialDeposit);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);		
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);		
		
		System.out.println("Updated account data:");
		System.out.println(account);		;
		
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println();
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
		
	}

}
