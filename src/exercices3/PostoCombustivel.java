package exercices3;

import java.util.Locale;
import java.util.Scanner;

public class PostoCombustivel {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int alcool=0, gasolina=0, diesel=0, codigo;
		
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			
			if (codigo == 1) {
				alcool++;
			}
			
			if (codigo == 2) {
				gasolina++;
			}
			
			if (codigo == 3) {
				diesel++;
			}
			
			codigo = sc.nextInt();				
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
				
		sc.close();
		
	}

}
