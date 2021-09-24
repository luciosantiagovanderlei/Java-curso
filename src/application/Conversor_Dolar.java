package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Conversor_Dolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Dollar Price: ");
		double price = scanner.nextDouble();
		System.out.print("How many Dollars will be bought?: ");
		double quantity = scanner.nextDouble();
		
		System.out.printf("Amount to paid in Reais = %.2f%n",CurrencyConverter.converter(price, quantity));

	}

}
