package exercices4;

import java.util.Locale;
import java.util.Scanner;

public class QuadradoCubo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println(i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3));
			
		}
		
		sc.close();
		
	}

}
