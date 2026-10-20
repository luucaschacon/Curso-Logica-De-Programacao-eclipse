package exerciciosCapitulo09;

public class ProdutoExercicio01 {
	
	static final Integer QUANTIDADE_MINIMA_DE_ESTOQUE = 10;
	
	String nome;
	
	Integer quantidadeEstoque;
	
	Boolean necessitaReporEstoque() {
		if (quantidadeEstoque < ProdutoExercicio01.QUANTIDADE_MINIMA_DE_ESTOQUE) {
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}	

}
