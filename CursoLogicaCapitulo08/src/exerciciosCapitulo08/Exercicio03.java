package exerciciosCapitulo08;

import java.util.Scanner;

public class Exercicio03 {

	static final Integer ADICAO = 1;
	static final Integer SUBTRACAO = 2;
	static final Integer MULTIPLICACAO = 3;
	static final Integer DIVISAO = 4;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		Integer numero1 = sc.nextInt();


		System.out.print("Digite o segundo número: ");
		Integer numero2 = sc.nextInt();

		System.out.print("Qual operação deseja fazer? [ 1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão ] : ");
		Integer operacao = sc.nextInt();
		System.out.println();

		if (operacao == ADICAO) {
			Integer resultado = adicao(numero1, numero2);
			System.out.println("O resultado da adição é de: " + resultado);
		} else if (operacao == SUBTRACAO) {
			Integer resultado = subtracao(numero1, numero2);
			System.out.println("O resultado da subtração é de: " + resultado);
		} else if (operacao == MULTIPLICACAO) {
			Integer resultado = multiplicacao(numero1, numero2);
			System.out.println("O resultado da multiplicação é de: " + resultado);
		} else if (operacao == DIVISAO) {
			Integer resultado = divisao(numero1, numero2);
			System.out.println("O resultado da divisão é de: " + resultado);
		} else {
			System.err.println("Digite um número válido.");
			System.exit(1);
		}

		sc.close();

	}

	static Integer adicao(Integer numero1, Integer numero2) {
		Integer resultado = numero1 + numero2;
		return resultado;
	}

	static Integer subtracao(Integer numero1, Integer numero2) {
		Integer resultado = numero1 - numero2;
		return resultado;
	}
	
	static Integer multiplicacao(Integer numero1, Integer numero2) {
		Integer resultado = numero1 * numero2;
		return resultado;
	}
	
	static Integer divisao(Integer numero1, Integer numero2) {
		Integer resultado = numero1 / numero2;
		return resultado;
	}

}
