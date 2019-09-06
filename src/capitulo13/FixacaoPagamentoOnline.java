package capitulo13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PayPalService;


public class FixacaoPagamentoOnline {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");		
		
		System.out.print("Number: ");
		int number = sc.nextInt();
		
		System.out.print("Date (dd/MM/yyyy): ");
		String date = sc.next();
		
		System.out.print("Contract value: ");
		double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, sdf.parse(date), totalValue);
		
		System.out.print("number of months: ");
		int months = sc.nextInt();
		
		ContractService contractService = new ContractService();		
		contractService.processContract(contract, months, new PayPalService());
		
		System.out.println("Installments:");
		contract.getInstallments().forEach(installment -> System.out.println(installment.toString()));
			
		
		sc.close();

	}

}
