package encapsulamento;

public class Cliente {
	
//	String nome;
	
	String primeirNome;
	
	String ultimoNome;
	
	String telefone;
	
	String getNome() {
		return primeirNome + " " + ultimoNome;
	}
	
	void setNome(String nome) {
		String[] nomeCompleto = nome.split(" ");
		primeirNome = nomeCompleto[0];
		ultimoNome = nomeCompleto[1];
	}
	
	String getTelefone() {
		return telefone;
	}
	
	void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	String getPrimeiroNome() {
		return primeirNome;
	}
	
	void setPrimeiroNome(String primeiroNome) {
		this.primeirNome = primeiroNome;
	}
	
	String getUltimoNome() {
		return ultimoNome;
	}
	
	void setUlitmoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

}
