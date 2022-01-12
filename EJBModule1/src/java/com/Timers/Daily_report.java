/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Timers;

import com.Employee;
import com.Shifts;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.LocalBean;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Singleton
@LocalBean
public class Daily_report {
String data="";
  //  @Resource(name = "mail/gmail")
 //   private Session mailgmail;
 @PersistenceContext(unitName = "EJBModule1PU")
    EntityManager em;
@Schedule(dayOfWeek = "*", month = "*", hour = "9", dayOfMonth = "*", year = "*", minute = "0", second = "0", persistent = false)
    
    public void myTimer() {
        
        System.out.println("Timer event: " + new Date());
         List<Shifts> list = new ArrayList<>();
        List<lk.entity.Shifts> shift = em.createQuery("SELECT s FROM Shifts s WHERE s.status = :status").setParameter("status", "Working").getResultList();
        for (lk.entity.Shifts ss : shift) {
            data+="<body><h4 style='color:green;'> <b style='color:red;'>Employee Attendance Report</b> <br><table>"
                + "<tr><td>First Name :   </td><td>  " + ss.getEmpID().getFname() + "</td></tr>" 
                + "<tr><td>Middle Name :  </td><td>  " + ss.getEmpID().getMname() + "</td></tr>"
                + "<tr><td>Last Name :  </td><td> " + ss.getEmpID().getLname() + "</td></tr>"
                + "<tr><td>Work start time :  </td><td> " + ss.getStartTime()+ "</td></tr>"
                + "</h4</body>";
            System.out.println(ss.getEmpID());
            System.out.println(ss.getEmpID().getFname());
            System.out.println(ss.getStartTime());
            System.out.println(ss.getStatus());

        }
         JavaMailUtils a=new JavaMailUtils();
        try {
            a.sendMail("kalpabandara13@gmail.com", "Daily Attendance"+new Date(), data);
        } catch (MessagingException ex) {
           ex.printStackTrace();
        }
    }


    
    
}
