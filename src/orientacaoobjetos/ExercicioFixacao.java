package orientacaoobjetos;

import java.util.Locale;
import java.util.Scanner;

import util.CurrecyConverter;

public class ExercicioFixacao {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double price, value;
		
		System.out.print("What is the dollar price? ");
		price = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		value = sc.nextDouble();
				
		System.out.printf("Amount to be paid in reals = %.2f ", CurrecyConverter.dollarToReal(price, value));
		
		sc.close();
		
	}

}
