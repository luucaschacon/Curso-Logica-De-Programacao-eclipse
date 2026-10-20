package bibliotecaemail;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

public class Exercicio01 {
	
	public static void main(String[] args) throws EmailException {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> linhas = new ArrayList<String>();
		
		String tarefa;
		int i = 0;
		while (true) { // DEIXEI O TRUE COMO CONDIÇÃO DO LAÇO, POIS, O QUE VAI PARÁ-LO É O FATO DO USUÁRIO DIGITAR O "X" NO CONSOLE
			System.out.print("Tarefa " + i + ": ");
			tarefa = sc.nextLine();
			
			if ("x".equals(tarefa)) {
				break; // ESSA É A ÚNICA MANEIRA DE PARAR ESSE LAÇO.
			}
			
			linhas.add(tarefa);
			i++;
		}
		
		String tarefas = "";
		
		for (int iteracao = 0; iteracao < linhas.size(); iteracao++) {
			tarefas += linhas.get(iteracao) + "\n";
		}
		
		String mensagem = "Suas tarefas: \n" + tarefas;
		
		System.out.print("Digite seu e-mail: ");
		String para = sc.next();
		
		Carteiro.enviar(para, "Sua lista de tarefas", mensagem);
		
		System.out.println("Fim...");
		
		sc.close();
	}

}
