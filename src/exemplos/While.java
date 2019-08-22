package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		double n = sc.nextDouble();
		
		while (n >= 0.0) {
			double raizQuadrada = Math.sqrt(n);
			System.out.printf("%.3f%n", raizQuadrada);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}
		
		System.out.println("Negative number!");
		
		sc.close();
		
	}

}
