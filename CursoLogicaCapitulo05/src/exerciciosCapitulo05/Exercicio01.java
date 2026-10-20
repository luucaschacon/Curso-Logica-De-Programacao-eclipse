package exerciciosCapitulo05;

import java.util.Scanner;

public class Exercicio01 {
	
//	Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova. 
//	Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
	
//	A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual 
//	ou maior que 150. Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias,
//	ou seja, se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) 
//	ele não conseguirá a vaga.
	
//	No final mostre para o candidato se ele conseguiu ou não.
	
	static final Integer NOTA_MINIMA_PARA_PASSAR = 150;
	static final Integer NOTA_MINIMA_POR_MATERIA = 60;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nota de Português: ");
		Integer notaPortugues = sc.nextInt();
		
		System.out.print("Nota de Matemática: ");
		Integer notaMatematica = sc.nextInt();
		System.out.println("");
		
		Integer totalNotas = notaPortugues + notaMatematica;
		Boolean aprovado = totalNotas >= NOTA_MINIMA_PARA_PASSAR 
				&& notaPortugues >= NOTA_MINIMA_POR_MATERIA
				&& notaMatematica >= NOTA_MINIMA_POR_MATERIA;
				
		if (aprovado) {
			System.out.println("Parabéns! Você foi aprovado!");
		} else {
			System.out.println("Infelizmente, você foi reprovado.");
		}
		
		sc.close();

	}

}
