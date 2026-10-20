package exerciciosCursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Integer numero = scanner.nextInt();
		
		Integer resultadoQuadradoDoNumero = numero * numero;
		
		System.out.println();
		System.out.println("O quadrado do número " + numero + " é igual a: " + resultadoQuadradoDoNumero + ".");
		
		scanner.close();

	}

}
