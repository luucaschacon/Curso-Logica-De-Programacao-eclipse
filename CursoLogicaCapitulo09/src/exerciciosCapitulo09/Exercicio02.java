package exerciciosCapitulo09;

public class Exercicio02 {
	
public static void main(String[] args) {
		
		ProdutoExercicio01 produto = new ProdutoExercicio01();
		produto.setNome("Notebook XZ10");
		produto.setQuantidadeEstoque(8);
		
		System.out.println("Necessário repor estoque do produto " + produto.getNome() + "? " + eNecessitaReporEstoque(produto));
		//eNecessitaReporEstoque(produto);
		produto.necessitaReporEstoque();
		
		
	}
	
	static Boolean eNecessitaReporEstoque(ProdutoExercicio01 produto) {
		if (produto.quantidadeEstoque < ProdutoExercicio01.QUANTIDADE_MINIMA_DE_ESTOQUE) {
			return true;
		}
		return false;
	}

}
