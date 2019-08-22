package exercices4;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
			if (denominador != 0) {
				int resultado = numerador / denominador;
				System.out.println(resultado);
			}
			else {
				System.out.println("Divisao impossivel");
			}
			
		}		
		
		sc.close();
		
	}

	
}
