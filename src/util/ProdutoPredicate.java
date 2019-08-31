package util;

import java.util.function.Predicate;

import entities.Produto;

public class ProdutoPredicate implements Predicate<Produto> {

	//interface funcional que possui apenas um metodo abstrato
	@Override
	public boolean test(Produto p) {
		return p.getPreco() >=100.0 ;
	}
	

}
