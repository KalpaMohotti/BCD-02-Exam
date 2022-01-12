/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;

import com.jobroleRemote;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class update_designation extends HttpServlet {

    @EJB
    private jobroleRemote jobrole;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String jobrolee=req.getParameter("jobrole");
       String sallary=req.getParameter("sallary");
       String leave_count=req.getParameter("leave_count");
       String department=req.getParameter("depart");
       String jobid=req.getParameter("jobid");
       String [] a=department.split("-");
       String b=a[0];
       String c=a[1];
       
        System.out.println(jobrolee);
        System.out.println(sallary);
        System.out.println(leave_count);
        System.out.println(department);
        System.out.println(b);
        System.out.println(c);
        jobrole.update_designation(jobid, jobrolee, sallary, leave_count, b, c);
        
    }

 

}
