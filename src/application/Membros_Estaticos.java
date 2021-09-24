package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Membros_Estaticos {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Radius: ");
		double radius = scanner.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		scanner.close();


	}
	
	

}
