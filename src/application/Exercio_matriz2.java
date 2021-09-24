package application;

import java.util.Scanner;

public class Exercio_matriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de linhas da matriz:");
		int M = sc.nextInt();
		System.out.println("Entre com a quantidade de colunas:");
		int N = sc.nextInt();
		
		int [][] mat = new int [M][N];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j< mat[i].length; j++) {
				System.out.println("Entre com os valores da matriz");
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println();
		
		System.out.println("entre a valor desejado: ");
		int val = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j< mat[i].length; j++) {
				if (mat[i][j] == val) {
					System.out.println("Position: " + i + ", " + j);
					if(j>0) {
						System.out.println("Left: " +  mat[i][j-1]);
					}
					
					if(j<mat[i].length-1) {
					System.out.println("Rigth: " + mat[i][j+1]);
					}
					
					if(i >0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					
					if(i < mat.length -1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				
				 
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		sc.close();
		
		
		
	}

}
