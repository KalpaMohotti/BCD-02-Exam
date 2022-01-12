/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Timers;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.xml.rpc.ServiceException;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class JavaMailUtils {
    
    public static void sendMail(String toUser, String subject, String body) throws AddressException, MessagingException {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.ssl.trust", "*");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.starttls.enable", "true");
        
        final String fromUser = "kasun7521madushanka@gmail.com";
        final String fromUserPassword = "Sadaruwan752";
        
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromUser, fromUserPassword);
            }
            
        });
        
        try {
            Message message = propertyMessage(session, fromUser, toUser, subject, body);
            Transport.send(message);
            System.out.println("Email Sent Successfully");
        } catch (MessagingException ex) {
            Logger.getLogger(JavaMailUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
     

//Properties props = System.getProperties();
//            props.put("mail.smtp.host", "smtp.gmail.com");
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.port", "587");
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.ssl.trust", "*");
//            props.put("mail.smtp.user", "kasun7521madushanka@gmail.com");
//            props.put("mail.smtp.password", "Sadaruwan752");
//
//            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                   
//                    return new PasswordAuthentication("kasun7521madushanka@gmail.com", "Sadaruwan752");
//                }
//            });
//            mailSession.setDebug(true);
//
//            Message mailMessae = new MimeMessage(mailSession);
//            mailMessae.setFrom(new InternetAddress("kasun7521madushanka@gmail.com"));
//            mailMessae.setRecipient(Message.RecipientType.TO, new InternetAddress("kalpabandara13@gmail.com"));
//            mailMessae.setContent(body, "text/html");
//            mailMessae.setSubject(subject);
//Transport.send(mailMessae);
     

//Properties props = System.getProperties();
//            props.put("mail.smtp.host", "smtp.gmail.com");
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.port", "587");
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.ssl.trust", "*");
//            props.put("mail.smtp.user", "kasun7521madushanka@gmail.com");
//            props.put("mail.smtp.password", "Sadaruwan752");
//
//            Session mailSession = Session.getInstance(props, new javax.mail.Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                   
//                    return new PasswordAuthentication("kasun7521madushanka@gmail.com", "Sadaruwan752");
//                }
//            });
//            mailSession.setDebug(true);
//
//            Message mailMessae = new MimeMessage(mailSession);
//            mailMessae.setFrom(new InternetAddress("kasun7521madushanka@gmail.com"));
//            mailMessae.setRecipient(Message.RecipientType.TO, new InternetAddress("kalpabandara13@gmail.com"));
//            mailMessae.setContent(body, "text/html");
//            mailMessae.setSubject(subject);
//Transport.send(mailMessae);
    }
    
    private static Message propertyMessage(Session session,  String sender, String reciption, String subject, String body) {
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(sender));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(reciption));
            message.setSubject(subject);
            message.setContent(body, "text/html");
//            message.setText("Hellow World");
            return message;
        } catch (Exception e) {
           // throw new ServiceException("408", "Request time out");
           return null;
        }
       
    
    } 
}
