package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, sum=0;
		
		System.out.print("How many integer numbers are you going to enter: ");
		n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Enter number #: " + i);
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Sum = " + sum);
		
		sc.close();
		
	}


}
