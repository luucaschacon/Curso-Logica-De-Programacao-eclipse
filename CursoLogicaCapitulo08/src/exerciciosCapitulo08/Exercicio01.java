package exerciciosCapitulo08;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java 00 Avançado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}

		System.out.print("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		verificarPosicaoValida(posicaoValida);

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto"};

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		for (int y = 0; y < formasPagamento.length; y++) {
			System.out.println("[" + y + "] " + formasPagamento[y]);
		}

		System.out.print("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;

		verificarPosicaoValida(posicaoValida);

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		sc.close();

	}

	static void imprimirTraco() {
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void verificarPosicaoValida(Boolean posicaoValida) {
		if (!posicaoValida) {
			System.err.println("Posição inválida!");
			System.exit(1);
		}
	}

}

