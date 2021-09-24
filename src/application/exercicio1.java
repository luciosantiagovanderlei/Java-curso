package application;

import java.util.Scanner;

import entities.Rectangle;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		
		System.out.println("Entre com a altura do retangulo: ");
		double altura = sc.nextDouble();
		System.out.println("Entre com a largura do retangulo: ");
		double largura = sc.nextDouble();
		
		r.Heigth = altura;
		r.Whidth = largura;
		
		System.out.println("Área: " + r.area());
		System.out.println("Perimeter = " + r.perimeter());
		System.out.println("Diagonal = " + r.diagonal());
		
	}

}
