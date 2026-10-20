package metodoinstancia;

public class MetodoInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Lucas";
		cliente.ultimoNome = "Chacon";
		cliente.telefone = "119000000";
		cliente.email = "lucaschacon37@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Silva";
		cliente2.telefone = "34999999999";
		
		System.out.println("Nome Cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD());
		System.out.println("Nome Cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD());

	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}

}
