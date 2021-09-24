package entities;

public class Employee {
	public String Name;
	public double GrossSalary;
	public double Tax;
	
	public double NetSalary() {
		
		return GrossSalary - Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		
		double increese = GrossSalary * percentage/100;
		 GrossSalary = GrossSalary + increese;	
		
	}
	

}
