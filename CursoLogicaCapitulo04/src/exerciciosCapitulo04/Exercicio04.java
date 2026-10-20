package exerciciosCapitulo04;

import java.util.Scanner;

public class Exercicio04 {
	
	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
	
	static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Idade da pessoa: ");
		Integer idade = sc.nextInt();
		
		System.out.print("Quantidade de tempo de contribuição com a previdência: ");
		Integer tempoPrevidencia = sc.nextInt();
		
		Boolean podeAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR && tempoPrevidencia >= TEMPO_MINIMO_DE_CONTRIBUICAO;
		
		if (podeAposentar) {
			System.out.println("Sim, ela pode aposentar");
		} else {
			System.out.println("Não, ela não pode aposentar");
		}		
		
		sc.close();

	}

}
