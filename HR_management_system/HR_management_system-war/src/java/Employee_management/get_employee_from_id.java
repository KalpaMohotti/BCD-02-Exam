/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_management;

import com.Employee;
import com.employeeManageRemote;
import com.google.gson.Gson;
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
public class get_employee_from_id extends HttpServlet {

    @EJB
    private employeeManageRemote employeeManage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        List<Employee> e=employeeManage.get_id_employee(id);
        for(Employee ee:e){
            System.out.println(ee.getEmpID());
            System.out.println(ee.getFname());
            System.out.println(ee.getLname());
        }
        
         String json = new Gson().toJson(e);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

   

}
