package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Pensionato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		Quartos[] vect = new Quartos[10];
		
		System.out.print("quantos quartos serão alugados?");
		int n = sc.nextInt();
		for (int i = 0; i< n; i ++) {
		
			
		System.out.println("Entre com o nome do hospede: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Entre com o email: ");
		String email = sc.nextLine();
		System.out.println("Qual o quarto escolhido?: ");
		int q = sc.nextInt();
		vect[q] = new Quartos(name, email);
				
		}
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (int i = 0; i< vect.length; i++) {
			if (vect[i]!= null ) {
				
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
