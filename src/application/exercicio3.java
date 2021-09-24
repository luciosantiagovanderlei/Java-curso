package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("nome do Aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Nota 1: ");
		aluno.note1 = sc.nextDouble();
		System.out.println("Nota 2: ");
		aluno.note2 = sc.nextDouble();
		System.out.println("Nota 3: ");
		aluno.note3 = sc.nextDouble();
		
		double notaFinal = aluno.finalGrade();
		
		System.out.printf("Final Grade: %.2f%n", notaFinal);
		System.out.println("Status: " +  aluno.status);
        
		if (notaFinal < 60){
			
			double missing = 60 - notaFinal;
			System.out.printf("Missing %.2f points" , missing );
		}
		
		sc.close();
		
	}

}
