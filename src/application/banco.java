package application;

import java.util.Locale;
import java.util.Scanner;


import entities.ContaCliente;

public class banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		ContaCliente conta;
		
		System.out.print("Entre com o numero da conta: ");
		int numconta = sc.nextInt();
		System.out.print("Entre com o nome do cliente: ");
		sc.nextLine();
		String cliente = sc.nextLine();			
		
		System.out.print("Será feito um deposito inicial? (s ou n) ");
		char resposta = sc.next().charAt(0);
		
			
		if (resposta == 's') {
			System.out.println("Valor do deposito inicial: ");
			Double depositoinicialDouble = sc.nextDouble();
			    conta = new ContaCliente(numconta, cliente, depositoinicialDouble);
			}else {
				conta = new ContaCliente(numconta, cliente);
			}
		
		System.out.println("Dados da conta: " + conta);
		
		System.out.print("Valor do deposito: ");
		conta.deposito(sc.nextDouble());	
		
		System.out.println("dados Atualizados");
		System.out.println("Dados da conta: " + conta);
		
		System.out.print("Entre com o valor do saque: ");
		conta.saque(sc.nextDouble());
		
		System.out.println("dados Atualizados");
		System.out.println("Dados da conta: " + conta);
		
		
		sc.close();
	}
	
		

}
