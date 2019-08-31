package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import util.ProdutoPredicate;

public class Program {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add(new Produto("TV",900.00));
		lista.add(new Produto("Mouse",50.00));
		lista.add(new Produto("Tablet",350.50));
		lista.add(new Produto("HD Case",80.90));
		
		//remove da lista produtos com preco acima de 100
		//utilizando referencia para um metodo da classe produto
		lista.removeIf(Produto::staticProdutoPredicate);
							//referencia para metodo
		//percorre a lista imprimindo produtos
		for(Produto p: lista) {
			System.out.println(p);
		}

	}

}
