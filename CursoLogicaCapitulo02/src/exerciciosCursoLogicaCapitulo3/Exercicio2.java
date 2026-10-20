package exerciciosCursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.println();
		System.out.println("Seu nome completo é: " + nome + " " + sobrenome + "!");
		
		sc.close();
	}

}
