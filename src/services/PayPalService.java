package services;

import interfaces.OnlinePaymentService;

public class PayPalService implements OnlinePaymentService {

	@Override
	public double interest(double amount, int month) {
		return amount += (amount * 0.01) * month;
	}

	@Override
	public double paymentFee(double amount) {		
		return amount += amount * 0.02;
	}

}
