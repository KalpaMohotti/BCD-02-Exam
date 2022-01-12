/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_management;

import com.employeeManageRemote;
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
public class save_employee extends HttpServlet {

    @EJB
    private employeeManageRemote employeeManage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fname = req.getParameter("fname");
        String mname = req.getParameter("mname");
        String lname = req.getParameter("lname");
        String dob = req.getParameter("dob");
        String sex = req.getParameter("sex");
        String address1 = req.getParameter("address1");
        String address2 = req.getParameter("address2");
        String address3 = req.getParameter("address3");
        String tel = req.getParameter("tel");
        String email = req.getParameter("email");
        String jobrole = req.getParameter("jobrole");
        String pass = req.getParameter("pass");
        
       String a[]=jobrole.split("-");
       String leave_count=a[1];
        String salary=a[2];
        String post=a[3];
   
        employeeManage.saveEmployee("1", fname, mname, lname, tel, address1, address2, address3, dob, sex, salary, post, leave_count, email, "uname", pass, "2");
    }

}
