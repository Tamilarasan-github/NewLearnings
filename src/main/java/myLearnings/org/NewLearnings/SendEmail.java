package myLearnings.org.NewLearnings;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {

	public static void main(String[] args) throws EmailException {
		Email email = new SimpleEmail();
		email.setSmtpPort(587);
		email.setHostName("smtp-mail.outlook.com");
		
		email.setAuthenticator(new DefaultAuthenticator("tamilarasansince1992@outlook.com", "Magical555$"));
		email.setSSLOnConnect(true);
		email.setFrom("tamilarasansince1992@outlook.com");
		email.setSubject("AutomaticTestMail");
		email.setMsg("This is an automatic test mail ... :-)");
		email.addTo("tamilarasan124@gmail.com");
		email.send();

	}

}
