package exercices4;

import java.util.Locale;
import java.util.Scanner;

public class FixacaoWhileFor {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		int higher = 0;
		
		while (n < 1) {
			System.out.println("N must be positive! Try again: ");
			n = sc.nextInt();
		}
						
		for (int i=1; i<=n; i++) {
			
			System.out.print("Value #"+i+": ");
			int value = sc.nextInt();
			
			if (value > higher) {
				higher = value;
			}
			
		}
		
		System.out.println("Higher = " + higher);
		
		sc.close();
		
	}

}
