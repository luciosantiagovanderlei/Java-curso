package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Product_Encapsulado;

public class programa_exemplo_encapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
				
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		 String name  = sc.nextLine();
		
		System.out.print("Price: ");
		int price = sc.nextInt();
		
		Product_Encapsulado product = new Product_Encapsulado(name, price);
		
		System.out.println();
		System.out.println("Product data: " + product);
		System.out.println();
		System.out.print("Entre com a quantidade de produtos para ser inserida no estoque");
		product.addProducts(sc.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		System.out.print("Entre com a quantidade de produtos para ser removida  no estoque");
		product.removeProducts(sc.nextInt());
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close(); 
	}

}
