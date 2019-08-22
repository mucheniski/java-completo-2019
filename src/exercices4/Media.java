package exercices4;

import java.util.Locale;
import java.util.Scanner;

public class Media {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdeRepeticoes;
		double valor1, valor2, valor3, media;
		
		qtdeRepeticoes = sc.nextInt();
		
		for (int i=0; i<qtdeRepeticoes; i++) {
			
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			media = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / 10.0;

			System.out.printf("%.1f%n", media);
		}		
		
		sc.close();		
	}


}
