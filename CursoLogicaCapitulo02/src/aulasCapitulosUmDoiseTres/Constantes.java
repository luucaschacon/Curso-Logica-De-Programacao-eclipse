package aulasCapitulosUmDoiseTres;

import java.util.Scanner;

public class Constantes {
	
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTEIRA  = 18;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// final Integer idadeMinimaParaTirarCarteira = 18; // final > É PARA TORNAR A VARIAVEL PARA UMA CONSTANTE
		
		System.out.print("Idade: ");
		Integer idade = sc.nextInt();
		
		Boolean podeTirarCarteira = idade >= IDADE_MINIMA_PARA_TIRAR_CARTEIRA; // idadeMinimaParaTirarCarteira;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		
		sc.close();
	}

}
