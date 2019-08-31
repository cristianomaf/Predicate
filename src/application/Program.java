package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV",900.00));
		lista.add(new Produto("Mouse",50.00));
		lista.add(new Produto("Tablet",350.50));
		lista.add(new Produto("HD Case",80.90));
	
		double min = 100.0;		
		
		//utilizando lambda inline	
		lista.removeIf(p-> p .getPreco() >= min);
							
	
		 
		//percorre a lista imprimindo produtos
		for(Produto p: lista) {
			System.out.println(p);
		}

	}

}
