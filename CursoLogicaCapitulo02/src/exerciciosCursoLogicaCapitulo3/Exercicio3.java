package exerciciosCursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double nota = sc.nextDouble();
		System.out.println();
		
		Boolean passouDeAno = nota >= 70;
		
		if (passouDeAno) {
			System.out.println("Parabéns! O aluno passou de ano!");
		} else {
			System.out.println("Infelizmente, o aluno não passou de ano!");
		}
		
		sc.close();

	}

}
