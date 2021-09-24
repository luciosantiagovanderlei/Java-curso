package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Entre com os valores dos lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Entre com os valores dos lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.println("Area do triangulo X: " + areaX);
		System.out.println("Area do triangulo Y: " + areaY);
		
		if (areaX > areaY){
			System.out.println("A area maior é do triangulo X");
			
		}
		else {
			System.out.println("A area maior é do triangulo Y");
		}
		
				
		sc.close();

	}
	
	

}
