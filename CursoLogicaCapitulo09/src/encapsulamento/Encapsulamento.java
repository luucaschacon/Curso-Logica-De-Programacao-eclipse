package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		cliente.nome = "Lucas Chacon";
//		cliente.telefone = "11995722519";
//		
//		System.out.println("Nome: " + cliente.nome);

		Cliente cliente = new Cliente();
		
		cliente.setNome("Lucas Chacon");
		cliente.setTelefone("11995722519");
		
		System.out.println("Nome Cliente: " + cliente.getNome());
		System.out.println("Primeiro Nome: " + cliente.getPrimeiroNome());
		System.out.println("Último Nome: " + cliente.getUltimoNome());
		
		
	}

}
