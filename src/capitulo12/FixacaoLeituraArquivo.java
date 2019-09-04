package capitulo12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product4;

public class FixacaoLeituraArquivo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String pathIn = "//home//mucheniski//Documents//JavaCompleto2019//files//sales.csv";
		String pathOut = "//home//mucheniski//Documents//JavaCompleto2019//files//summary.csv";
		
		List<Product4> products = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
			
			String line = br.readLine();			
			while(line != null) {
				
				String[] sales = line.split(",");
				
				String name = sales[0];
				double price = Double.parseDouble(sales[1]);
				int quantity = Integer.parseInt(sales[2]);
				
				Product4 product = new Product4(name, price, quantity);
				products.add(product);
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {
			
			for (Product4 product : products) {
				bw.write(product.getName() + ", " + String.format("%.2f", product.getTotalSale()));
				bw.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	
	}

}
