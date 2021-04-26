/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author araya
 */
public class enviarCorreo {
    
    public static boolean enviarConGmail(String destinatario, String pendientes){
        Properties prop= System.getProperties();
        String password="qwerty12345.";
        String remitente="proyecto0poo2021@gmail.com";
        
        prop.put("mail.smtp.host", "smtp.gamil.com");
        prop.put("mail.smtp.user",remitente);
        prop.put("mail.smtp.password", password);
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.port", "587");
        
        Session session=Session.getDefaultInstance(prop);
        MimeMessage message = new MimeMessage(session);
        try{
        
            message.setFrom(new InternetAddress(remitente));
            message.addRecipients(Message.RecipientType.TO, destinatario);
            message.setSubject("Articulos Pendientes a retirar.");
            message.setText("La siquiente lista contiene los articulos pendientes a retirar: \n"+pendientes);
            Transport t=session.getTransport("smtp");
            t.connect("smtp.gmail.com",remitente,password);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            
            return true;
        }catch(MessagingException me){
            return false;
        }
        
    }
    
}
