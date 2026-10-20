package aulasCapitulo08;

import java.util.Scanner;

public class Recursividade {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");
		
		iterarEExibirPosicoesDoVetorString(cursos);

		Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", sc);

		Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		imprimirTraco();

		String[] formasPagamento = new String[] { "Cartão", "Boleto"};

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarEExibirPosicoesDoVetorString(formasPagamento);

		Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", sc);

		posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

		if (!posicaoValida) {
			encerrarProgramaPorCausaDaPosicaoInvalida();
		}

		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

		imprimirTraco();

		imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

		sc.close();

	}
	
	static Integer receberNumeroInteiroDoUsuario(String texto, Scanner scanner) {
		imprimirEContinuarNaMesmaLinha(texto);
		Integer numero = scanner.nextInt();
		
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhidaPeloUsuario(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;
		return valida;
	}

	static void imprimirTraco() {
		imprimir("-----------------------------------------------------------------");
	}
	
	static void encerrarProgramaPorCausaDaPosicaoInvalida() {
		System.err.println("Posição inválida!");
		System.exit(1);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor) {
		iterarEExibirPosicoesDoVetorString(vetor, 0);
	}
	
	static void iterarEExibirPosicoesDoVetorString(String[] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i]);
		
		if (++i < vetor.length) {
			iterarEExibirPosicoesDoVetorString(vetor, i);
		}
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static void imprimirEContinuarNaMesmaLinha(String texto) {
		System.out.print(texto);
	}


//	public static void main(String[] args) {
//
//		String[] alunos = new String[] { "Alexandre", "João", "Maria" };
//
//		// imprimirNumero(0);
//
//		// iterarNomes(alunos);
//		
//		iterarNomesRecursividade(alunos, 0);
//
//	}
//
//	static void imprimirNumero(Integer numero) {
//		System.out.println("Número: " + numero);
//
//		if (numero < 10) {
//			imprimirNumero(++numero);
//		}
//	}
//
//	static void iterarNomes(String[] alunos) {
//		for (int i = 0; i < alunos.length; i++) {
//			System.out.println("Aluno: " + alunos[i]);
//		}
//	}
//
//	static void iterarNomesRecursividade(String[] alunos, Integer i) {
//		System.out.println("Aluno: " + alunos[i]);
//		
//		if (++i < alunos.length) {
//			iterarNomesRecursividade(alunos, i);
//		}
//		
//		// PAREI EM 10:33 DA AULA 8.8
//	}

}
