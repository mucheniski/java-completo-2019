package exercices2;

import java.util.Locale;
import java.util.Scanner;

public class Multiplos03 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int a, b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {			
			if (a % b == 0) {
				System.out.println("Sao Multiplos");
			}	
			else {
				System.out.println("Nao Sao Multiplos");
			}
		}
		else {
			if (b % a == 0) {
				System.out.println("Sao Multiplos");
			}
			else {
				System.out.println("Nao Sao Multiplos");
			}
		}
		
		sc.close();
		
	}

}
