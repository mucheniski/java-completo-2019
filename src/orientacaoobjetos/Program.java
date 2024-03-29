package orientacaoobjetos;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Enter product data");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();				
		
		Product product = new Product(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantityAdd = sc.nextInt();
		product.addProduct(quantityAdd);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed in stock: ");
		int quantityRemove = sc.nextInt();
		product.removeProduct(quantityRemove);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		
		sc.close();
		
	}

}
