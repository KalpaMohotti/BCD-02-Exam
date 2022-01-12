/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary_management;

import com.Salary;
import com.google.gson.Gson;
import com.salary_manageRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class salaryHistory extends HttpServlet {

    @EJB
    private salary_manageRemote salary_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        List<Salary> s=salary_manage.salaryHistory(id);
        for(Salary ss:s){
            System.out.println(ss.getSalaryID());
            System.out.println(ss.getSalary());
            System.out.println(ss.getMonth());
        }
        
          String json = new Gson().toJson(s);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

   

}
