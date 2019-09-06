package interfaces;

public interface OnlinePaymentService {

	double interest(double amount, int month);
	
	double paymentFee(double amount);
	
}
