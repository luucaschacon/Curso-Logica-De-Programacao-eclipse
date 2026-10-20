package aulasCapitulo08;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);

		imprimirEContinuarNaMesmaLinha("O curso que você deseja é o: ");
		Integer posicaoCursoEscolhido = sc.nextInt();

		Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto"};

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		imprimirEContinuarNaMesmaLinha("Sua forma de pagamento escolhida é: ");
		Integer posicaoFormaPagamentoEscolhida = sc.nextInt();

		posicaoValida = posicaoFormaPagamentoEscolhida >= 0
				&& posicaoFormaPagamentoEscolhida < formasPagamento.length;

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		sc.close();

	}

	static void imprimirTraco() {
		System.out.println("-----------------------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("[" + i + "] " + vetor[i]);
		}
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}
}
