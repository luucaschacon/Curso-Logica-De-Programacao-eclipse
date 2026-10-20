package exerciciosCapitulo04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: ");
		Double valorProduto = sc.nextDouble();
		
		Double valorFrete = 15.0;
		Boolean valorCompraMaiorQue100 = valorProduto >= 100;
		
		if (valorCompraMaiorQue100) {
			valorFrete = 0.0;
		}
		
		Double valorFinal = valorProduto + valorFrete;
		
		System.out.println();
		System.out.println("O valor final da compra é de R$: " + valorFinal);
		
		sc.close();

	}

}
