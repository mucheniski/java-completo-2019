package exercices;

import java.util.Locale;
import java.util.Scanner;

public class ValorPecas05 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, totalPagar=0.0;
		
		codPeca1 = sc.nextInt();
		qtdPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		sc.nextLine();
		
		totalPagar += qtdPeca1 * valorPeca1;
		
		codPeca2 = sc.nextInt();
		qtdPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		totalPagar += qtdPeca2 * valorPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		sc.close();
		
	}

}
