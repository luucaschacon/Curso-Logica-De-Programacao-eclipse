package aulasCapitulosUmDoiseTres;

import java.util.Scanner;

public class CalculoIMC { // EXERCÍCIO 02

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DO ÍNDICE DE MASSA CORPORAL");
		System.out.println("");
		
		System.out.print("Digite o seu peso (em Kg): ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a sua altura (em metros) : ");
		Double altura = scanner.nextDouble();
		
		Double resultadoMultiplicacaoAltura = altura * altura;
		
		Double resultadoIMC = peso / resultadoMultiplicacaoAltura;
		System.out.println("");
		
		System.out.println("Seu IMC é : " + resultadoIMC);
		
		scanner.close();

	}

}
