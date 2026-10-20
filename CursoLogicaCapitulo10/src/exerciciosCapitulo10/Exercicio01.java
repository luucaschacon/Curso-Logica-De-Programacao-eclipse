package exerciciosCapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		System.out.println("Lista de atividades: ");
		
		String tarefa;
		int i = 0;
		while (true) { // DEIXEI O TRUE COMO CONDIÇÃO DO LAÇO, POIS, O QUE VAI PARÁ-LO É O FATO DO USUÁRIO DIGITAR O "X" NO CONSOLE.
			System.out.print("Tarefa " + i + ": ");
			tarefa = sc.nextLine();
			
			if("x".equals(tarefa)) {
				break; // ESSA É A ÚNICA MANEIRA DE PARAR ESSE LAÇO.
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		escreverNoArquivo("C:/Users/User/exercicio-01.txt", linhas);
		
		sc.close();
		
		System.out.println("Fim...");
			
	}
	
	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}

}
