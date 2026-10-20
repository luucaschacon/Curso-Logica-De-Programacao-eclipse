package aulasCapitulosUmDoiseTres;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = sc.nextDouble();
		
		System.out.print("Digite o tipo do pagamento [1 = à vista / 2 = à prazo]: ");
		Integer tipoPagamento = sc.nextInt();
		
		Boolean pagamentoAVista = tipoPagamento.equals(1);
		
		Double juros = 0.0;
		
		if (!pagamentoAVista) {
			juros = 10.0;
		}
		
		Double acrescimo = valorProduto * juros / 100;
		
		Double valorTotal = acrescimo + valorProduto;
		
		System.out.println("Valor total: " + valorTotal);
		
		sc.close();

	}

}
