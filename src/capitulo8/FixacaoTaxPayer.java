package capitulo8;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CompanyPerson;
import entities.IndividualPerson;
import entities.TaxPayer;

public class FixacaoTaxPayer {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payer: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= n; i++) {
						
			System.out.println("Tax payer #" + i + " data");
			
			System.out.print("Individual or company (i/c)? ");
			char option = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			
			if (option == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new IndividualPerson(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new CompanyPerson(name, annualIncome, numberOfEmployee));
			}
			
		}
		
		System.out.println();
		System.out.println("TAXES PAID");
		
		double totalTaxes = 0.0;
		
		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.taxPaid()));
			totalTaxes += taxPayer.taxPaid();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));
		
		sc.close();

	}

}
