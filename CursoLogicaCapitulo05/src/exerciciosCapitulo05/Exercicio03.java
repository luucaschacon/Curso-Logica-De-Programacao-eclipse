package exerciciosCapitulo05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana - [ 1 a 7]: ");
		Integer diaSemana = sc.nextInt();
		
		String dia = null;
		
		switch (diaSemana) {
		case 1: dia = "Domingo";
			break;
		case 2: dia = "Segunda-feira";
			break;
		case 3: dia = "Terça-feira";
			break;
		case 4: dia = "Quarta-feira";
			break;
		case 5: dia = "Quinta-feira";
			break;
		case 6: dia = "Sexta-feira";
			break;
		case 7: dia = "Sábado";
			break;	
		default: 
			System.err.println("Digite um dia válido.");
			System.exit(1);
		}
		
		System.out.println();
		System.out.println("O dia escolhido foi: " + dia);
		
		sc.close();

	}

}
