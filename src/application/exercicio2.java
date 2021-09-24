package application;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee empregado = new Employee();
		
		System.out.print("Nome");
		empregado.Name = sc.nextLine();
		System.out.println("Gross salary = ");
		empregado.GrossSalary = sc.nextDouble();
		System.out.println("Tax = ");
		empregado.Tax = sc.nextDouble();
		
		System.out.println("Employee: " + empregado.Name + ",  $" + empregado.NetSalary());
		
		System.out.println("Which percentage to increase salary?");
		empregado.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Update data: Employee: " + empregado.Name + ",  $" + empregado.NetSalary());
		
		
		
		sc.close();
	}

}
