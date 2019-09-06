package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;
import interfaces.OnlinePaymentService;

public class ContractService {		
	
	public void processContract(Contract contract, Integer months, OnlinePaymentService onlinePaymentService) {
		
		double amount = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {	
			double installmentValue = amount;
			installmentValue = onlinePaymentService.interest(installmentValue, i);			
			installmentValue = onlinePaymentService.paymentFee(installmentValue);
			
			Date paymentDate = addMonths(contract.getDate(), i);
			
			Installment installment = new Installment(paymentDate, installmentValue, contract);
			contract.addInstallment(installment);
			
		}
		
	}	
	
	private Date addMonths(Date date, int n) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, n);
		return cal.getTime();
	}
	
}
