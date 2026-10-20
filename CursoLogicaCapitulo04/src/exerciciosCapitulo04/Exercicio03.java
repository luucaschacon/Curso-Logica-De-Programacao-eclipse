package exerciciosCapitulo04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite abaixo os valores gastos com...");
		System.out.println();
		
		Double gastoTotal = 0.0;
		
		System.out.print("Digite o valor da conta de luz: ");
		Double contaLuz = sc.nextDouble();
		gastoTotal += contaLuz;
		
		System.out.print("Digite o valor da conta de agua: ");
		Double contaAgua = sc.nextDouble();
		gastoTotal += contaAgua;
		
		System.out.print("Digite o valor da conta de telefone: ");
		Double contaTelefone = sc.nextDouble();
		gastoTotal += contaTelefone;
		
		System.out.print("Digite o valor da conta da escola do filho: ");
		Double contaEscolaFilho = sc.nextDouble();
		gastoTotal += contaEscolaFilho;
		
		System.out.print("Digite o valor da fatura do cartão: ");
		Double faturaCartao = sc.nextDouble();
		gastoTotal += faturaCartao;
		
		System.out.print("Digite o valor dos gastos com supermercado : ");
		Double gastoSupermercado = sc.nextDouble();		
		gastoTotal += gastoSupermercado;
		
		System.out.println();
		System.out.println("O gasto total que a família teve no mês foi de : " + gastoTotal);
		
		sc.close();

	}

}
