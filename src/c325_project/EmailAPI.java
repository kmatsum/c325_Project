package c325_project;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailAPI {

    public static void sendEmail(String Recipient, String Subject, String emailMessage) {
        //Sets up Port and Protocol to communicate with gmail Servers
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        //Authentication with gmail servers
        Session session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("cnit325groupproject@gmail.com", "Hakunamatata317!");
                    }
                });

        //Send email with attributes previously defined
        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("cnit325groupproject@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Recipient));
            message.setSubject(Subject);
            message.setText(emailMessage);

            Transport.send(message);

            System.out.println("Email Sent");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
