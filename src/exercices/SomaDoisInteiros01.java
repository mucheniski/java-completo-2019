package exercices;

import java.util.Locale;
import java.util.Scanner;

public class SomaDoisInteiros01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, resultado;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		resultado = valor1 + valor2;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();
		
	}

}
