package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class NumeroMaior {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, higher;
		
		System.out.println("Enter three numbers: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();	
		
		higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int n1, int n2, int n3) {
		
		int aux;
		
		if (n1 > n2 && n1 > n3) {
			aux = n1;
		}
		else if (n2 > n3) {
			aux = n2;
		}
		else {
			aux = n3;
		}
		
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher is " + value);
	}

}
