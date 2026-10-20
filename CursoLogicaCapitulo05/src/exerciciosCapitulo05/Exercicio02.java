package exerciciosCapitulo05;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Meta de faturamento anual: ");
		Double metaFaturamento = sc.nextDouble();
		
		System.out.print("Faturamento Real do último ano: ");
		Double faturamentoReal = sc.nextDouble();
		
		System.out.print("Média salarial do funcionário(a): ");
		Double mediaSalarioFuncionario = sc.nextDouble();
		
		Double bonus = 0.0;
		Double oitentaPorCentoDaMeta = (metaFaturamento * 80) / 100;
		Boolean faturamentoRealMaiorOuIgualMeta = faturamentoReal >= metaFaturamento;
		Boolean faturouPeloMenosOitentaPorCento = faturamentoReal >= oitentaPorCentoDaMeta;
		
		if (faturamentoRealMaiorOuIgualMeta) {
			bonus = mediaSalarioFuncionario;
			System.out.println("Você vai ganhar um bonus de 100%! O prêmio será no valor de R$: " + bonus);
		} else if (faturouPeloMenosOitentaPorCento) {
			bonus = (mediaSalarioFuncionario * 80) / 100;;
			System.out.println("Você vai ganhar um bonus de 80%! O prêmio será no valor de R$: " + bonus);
		} else {
			System.out.println("Infelizmente, esse ano não tem bônus!");
		}
		
		sc.close();
		
	}

}
