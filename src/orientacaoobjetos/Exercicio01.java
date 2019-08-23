package orientacaoobjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ractangle width and heignt: ");
		Rectangle rectangle = new Rectangle();
		
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		sc.close();
		
	}

}
