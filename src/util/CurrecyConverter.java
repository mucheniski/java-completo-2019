package util;

public class CurrecyConverter {

	public static double IOF = 0.06;

	public static Double dollarToReal(double price, double value) {		
		double valueInReals = price * value;
		return valueInReals += valueInReals * IOF;
	}

}
