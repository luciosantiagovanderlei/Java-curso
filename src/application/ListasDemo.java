package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class ListasDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list  = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		// Adicionando um elemento em uma posição especifica
		list.add(2, "Marco");
		
		System.out.println();
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
	/*	System.out.println();
		// Remover um elemento da lista por comparação
		list.remove("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println();
		// Remover um elemento da lista por indice
		list.remove(1);
		
		for (String x : list) {
			System.out.println(x);
		}
		*/
		System.out.println("-----------------"); 
		// Remover um elemento da lista por Predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------"); 
		// Encontrando o indice do elemento
		
		System.out.println("index off Bob: " + list.indexOf("Bob"));
		System.out.println("index off Marco: " + list.indexOf("Marco"));
		
		System.out.println("-----------------"); 
		
		// Filtrar a lista por parametro
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // tranforma em stream depois volta pra lista
		
		for (String x : result) {
			System.out.println(x);
		}
		
		// Encontrar um elemento por predicado
		System.out.println("-----------------"); 
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
		
		
		
		
	}

}
