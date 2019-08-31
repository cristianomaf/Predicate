package entities;

public class Produto {
	private String nome;
	private Double preco;
	
	public Produto(String nome, Double preco) {
		this.nome = nome;
		this.preco = preco;
		
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	//utilizando metodo static que recebe produto como argumento
	public static boolean staticProdutoPredicate(Produto p) {
		return p.getPreco() >=100;
	}
	
	//criando metodo nao static que faz a mesma coisa 
	//diferenca que metodo nao estatico utiliza como referencia
	// o proprio objeto produto aqui da classe 
	
	public boolean nonStaticProdutoPredicate() {
		return preco >=100; //pega o preco direto da classe
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
	
}

