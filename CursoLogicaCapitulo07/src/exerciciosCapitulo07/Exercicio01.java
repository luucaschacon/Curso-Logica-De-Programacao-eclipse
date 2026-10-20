package exerciciosCapitulo07;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite as 5 tarefas mais importantes do dia...");
		System.out.println();
		
		System.out.print("Tarefa 1: ");
		String tarefa1 = sc.nextLine();
		
		System.out.print("Tarefa 2: ");
		String tarefa2 = sc.nextLine();
		
		System.out.print("Tarefa 3: ");
		String tarefa3 = sc.nextLine();
		
		System.out.print("Tarefa 4: ");
		String tarefa4 = sc.nextLine();
		
		System.out.print("Tarefa 5: ");
		String tarefa5 = sc.nextLine();
		System.out.println();
		
		String[] tarefas = new String[] { tarefa1, tarefa2, tarefa3, tarefa4, tarefa5 };
		
		System.out.println("Suas tarefas mais importantes do dia são: ");
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println(i + ": " + tarefas[i]);
		}
		
		sc.close();
		
	}

}
