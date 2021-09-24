package util;

public class CurrencyConverter {
	
	public static double IOF = 1.06;
	
	public static double converter(double dollarPrice, double quantity) {
		
		return dollarPrice * quantity * IOF;
	}

}
