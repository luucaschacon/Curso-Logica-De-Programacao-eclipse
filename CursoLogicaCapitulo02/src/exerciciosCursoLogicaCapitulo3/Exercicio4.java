package exerciciosCursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = sc.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Integer quantidadeProduto = sc.nextInt();
		
		Double subTotal = valorProduto * quantidadeProduto;
		
		Boolean quantidadeMaiorOuIgualDez = quantidadeProduto >= 10;
		Double desconto = 0.0;
		
		if (quantidadeMaiorOuIgualDez) {
			desconto = 10.0;
		}
		
		Double valorComDesconto = subTotal * desconto / 100;
		Double valorFinal = subTotal - valorComDesconto;
		
		System.out.println("");
		System.out.println("O valor a pagar será de R$: " + valorFinal);
		
		sc.close();

	}

}
