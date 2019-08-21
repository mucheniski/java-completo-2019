package couse;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacao2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String fullName, lastName;
		int bedrooms, age;
		double productPrice, height;
				
		System.out.println("Enter your full name:");
		fullName = sc.nextLine();
		
		System.out.println("How many bedrooms are there in your house?");
		bedrooms = sc.nextInt();
		
		System.out.println("Enter product price:");
		productPrice = sc.nextDouble();
		
		System.out.println("Enter yout last name, age and height (same line):");
		lastName = sc.next();
		age = sc.nextInt();
		height = sc.nextDouble();
		
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.printf("%.2f%n", productPrice);
		System.out.println(lastName);
		System.out.println(age);
		System.out.printf("%.2f%n", height);
		
		sc.close();
		
	}

}
