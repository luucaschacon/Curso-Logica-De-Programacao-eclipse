package exerciciosCursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio5 {
	
	static final Integer NOTA_BASE_PARA_PASSAR_DE_ANO = 70;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno: ");
		Double nota = sc.nextDouble();
		System.out.println();
		
		Boolean passouDeAno = nota >= NOTA_BASE_PARA_PASSAR_DE_ANO;
		
		if (passouDeAno) {
			System.out.println("Parabéns! O aluno passou de ano!");
		} else {
			System.out.println("Infelizmente, o aluno não passou de ano!");
		}
		
		sc.close();

	}

}
