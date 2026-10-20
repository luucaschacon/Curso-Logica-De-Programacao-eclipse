package exerciciosCapitulo08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número [ 0 a 10 ] para exibir a tabuada: ");
		Integer numero = sc.nextInt();
		pularLinha();
		
		System.out.println("Tabuada do " + numero + " :");
		pularLinha();
		
		imprimirTabuada(numero, 0);
		
		sc.close();

	}
	
	static void imprimirTabuada(Integer numero, Integer multiplicador) {
		Integer resultado = numero * multiplicador;
		System.out.println(numero + " x " + multiplicador + " = " + resultado);
		++multiplicador;
		if (multiplicador <= 10) {
			imprimirTabuada(numero, multiplicador);
		}
	}
	
	static void pularLinha() {
		System.out.println();
	}

}
