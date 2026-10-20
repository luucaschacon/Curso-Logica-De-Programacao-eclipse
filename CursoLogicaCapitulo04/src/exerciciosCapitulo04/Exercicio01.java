package exerciciosCapitulo04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		Double numero1 = sc.nextDouble();
		
		System.out.print("Operação que será realizada: [1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 Divisão] ");
		Integer operacao = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		Double numero2 = sc.nextDouble();
		
		Double resultado = null;
		String nomeOperacao = "";
		
		if (operacao.equals(1)) {
			resultado = numero1 + numero2;
			nomeOperacao = "Adição";
		}
		else if (operacao.equals(2)) {
			resultado = numero1 - numero2;
			nomeOperacao = "Subtração";
		}
		else if (operacao.equals(3)) {
			resultado = numero1 * numero2;
			nomeOperacao = "Multiplicação";
		}
		else if (operacao.equals(4)) {
			resultado = numero1 / numero2;
			nomeOperacao = "Divisão";
		} else {
			System.out.println("Digite um número válido.");
		}
		
		System.out.println();
		System.out.println("O resultado da operação de " + nomeOperacao + " é de: " + resultado + ".");
		
		sc.close();

	}

}
