package bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		
		// Configuração para TLS (Porta 587)
		email.setSmtpPort(587);
		email.setStartTLSEnabled(true);
		email.setSSLOnConnect(false); // Mantém como false para usar TLS
		
		// Insira seu e-mail e a senha de 16 caracteres sem espaços
		email.setAuthenticator(new DefaultAuthenticator("lucaschacon37@gmail.com", "bwruiyvrnwxspntl"));
		
		email.setFrom("lucaschacon37@gmail.com");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		
		email.send();
	}
}