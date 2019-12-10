package tools;


import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import javax.mail.NoSuchProviderException;
import javax.mail.internet.AddressException;
/**
 *
 * @author USER
 */
public class SendMail {
    
  public void send(String to, String nama) {
        try {
             
            Properties properties=new Properties();
            properties.put("mail.smtp.host","smtp.gmail.com");
            properties.put("mail.smtp.auth","true");
            properties.put("mail.smtp.ssl.enable","true");
            properties.put("mail.smtp.port", "465");//default port dari smptp
             
            javax.mail.Session session=javax.mail.Session.getInstance(properties);
            session.setDebug(true);
             
            MimeMessage pesan=new MimeMessage(session);
            pesan.setFrom("bootcamp32java@gmail.com");//isi dengan gmail kalian sendiri, biasanya sama nanti dengan username
            pesan.setRecipient(Message.RecipientType.TO, new InternetAddress(to));//isi dengan tujuan email
            pesan.setSubject("Java Mail");
            pesan.setText("Selamat "+ nama+" Anda Sukses Registrasi.Email dikirim menggunakan Java Mail");
             
            String username="bootcamp32java@gmail.com"; //ganti dengan gmail kalian sendiri
            String password="ProgrammerJava"; //ganti dengan password kalian sendiri
            Transport.send(pesan, username, password);
             
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
    }
}