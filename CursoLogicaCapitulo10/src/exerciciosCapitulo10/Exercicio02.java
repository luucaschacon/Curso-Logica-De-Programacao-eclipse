package exerciciosCapitulo10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("C:/Users/User/Files-CursoLogica/exercicio-01.txt");
		
		System.out.println("SUA LISTA DE TAREFAS DO DIA");
		System.out.println();
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (int i = 0; i <linhas.size(); i++) {
			String nome = linhas.get(i);
			
			System.out.println("Tarefa " + i + ": " + nome);
		}
		
	}
}
