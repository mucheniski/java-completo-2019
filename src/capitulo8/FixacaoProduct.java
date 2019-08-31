package capitulo8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product3;
import entities.UsedProduct;

public class FixacaoProduct {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products: ");
		int numberProducts = sc.nextInt();		
		
		List<Product3> products = new ArrayList<>();
		
		for (int i = 1; i <= numberProducts; i++) {
			
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, used or imported (c/u/i)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();			
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (option == 'c') {
				products.add(new Product3(name, price));				
			}
			
			if (option == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String manufactureDate = sc.next();
				products.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));				
			}
			
			if (option == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct(name, price, customsFee));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product3 product : products) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}

}
