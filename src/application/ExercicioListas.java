package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ExercicioListas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		List<EmployeeList>  list = new ArrayList<>();
		
		// Parte 1 Obtendo os dados
		System.out.println("How many employess will be registered?");
		
		int n = sc.nextInt();
		
		for( int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.println("Enter employee name: ");
			sc.nextLine();		
			String name = sc.nextLine();
			System.out.println("Enter Salary:");
			double salary = sc.nextDouble();
			list.add(new EmployeeList(id, name, salary));	
			
		}
		// Parte 2 Alterando o salario
		
		System.out.println();
		System.out.print("Enter the employee id that have salary increase: ");
		int id = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		// parte 3 listagem dos funcionários
		
		System.out.println();
		System.out.println("List of employees: ");
		for (EmployeeList obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}

	public static boolean hasId(List<EmployeeList> list, int id) {
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
