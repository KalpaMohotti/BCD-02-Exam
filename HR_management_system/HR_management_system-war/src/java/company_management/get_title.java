/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;

import com.Department;
import com.department_saveRemote;
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
public class get_title extends HttpServlet {

    @EJB
    private department_saveRemote department_save;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     String id=req.getParameter("id");
        
      List<Department> d=department_save.getid_value(id);
     for(Department dd:d){
         System.out.println(dd.getDpartmentID());
         System.out.println(dd.getTitle());
     }
     
      String json = new Gson().toJson(d);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

  

}
