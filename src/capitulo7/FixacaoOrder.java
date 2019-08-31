package capitulo7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product2;
import entities.enums.OrderStatus;

public class FixacaoOrder {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
				
		Client client = new Client(name, email, sdf.parse(birthDate));					
		
		System.out.println("Enter orderData: ");
		
		System.out.print("Status: ");
		String status = sc.next();
		
		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);		
		
		System.out.println("How many items to this order? ");    
		int qtdItems = sc.nextInt();
		
		for (int i = 1; i <= qtdItems; i++) {
			
			System.out.println("Enter #" + i + " item data: ");
			
			sc.nextLine(); // Para consumir a quebra de linha do nextInt acima
			
			System.out.print("Product name: ");
			String productName = sc.nextLine();	
						
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, price, new Product2(productName, price));
			
			order.addItem(item);
			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);				
		
		sc.close();

	}

}
