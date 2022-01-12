/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary_management;

import com.salary_manageRemote;
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
public class save_salary extends HttpServlet {

    @EJB
    private salary_manageRemote salary_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String date=req.getParameter("date");
        String salary=req.getParameter("salary");
        String insurance=req.getParameter("insurance");
        String empid=req.getParameter("empid");
     salary_manage.saveSalary(date, salary, insurance, empid);
     
    }

    

}
