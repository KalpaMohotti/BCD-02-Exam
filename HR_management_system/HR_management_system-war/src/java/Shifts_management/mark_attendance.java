/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shifts_management;


import com.shiftsRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class mark_attendance extends HttpServlet {

    @EJB
    private shiftsRemote shifts;

   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date=req.getParameter("date");
        String emp=req.getParameter("emp");
        System.out.println(date);
        System.out.println(emp);
        
       String []id=emp.split("-");
        String iid=id[0];
        System.out.println(iid);
        
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss");
        Date datee = new Date();
        String d=formatter.format(datee);
System.out.println(d);
     // //shifts_manage.markAttendance("08.00", "12/12/21", "1");
     
        try {
             shifts.markshifts(d, date, iid);
        } catch (Exception e) {
        }
     
    }

   

}
