/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;

import com.Department;
import com.JobRole;
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
public class add_jobrole extends HttpServlet {

    @EJB
    private jobroleRemote jobrole;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String jobrolee=req.getParameter("jobrole");
       String sallary=req.getParameter("sallary");
       String leave_count=req.getParameter("leave_count");
       String department=req.getParameter("depart");
       String [] a=department.split("-");
       String b=a[0];
       

        
          Department d=new Department();
        JobRole jb=new JobRole();
        d.setDpartmentID(Integer.parseInt(b));
        jb.setDpartment(d);
        jb.setLeaveCount(leave_count);
        jb.setSalary(sallary);
        jb.setTittle(jobrolee);
        jobrole.save_job_role(jb, d);
        
    }

    

}
