package application;

import java.util.Locale;
import java.util.Scanner;

import entities.PProducts;

public class VetoresClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		PProducts[] vect = new PProducts[n];
		
		for (int i = 0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new PProducts(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++){
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("Average price = %.2f%n", avg);
		sc.close();
	}

}
