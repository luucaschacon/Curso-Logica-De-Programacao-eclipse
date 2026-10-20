package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador: " + i + ": ");
			String nome = sc.nextLine();
			
			linhas.add(nome);
		}
		
//		linhas.add("Linha um");
		
		Path arquivo = Paths.get("C:/Users/User/meu-arquivo.txt");
		Files.write(arquivo, linhas);
		System.out.println("Fim...");
		
		sc.close();
			
	}

}
