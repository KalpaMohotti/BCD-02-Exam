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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class view_all extends HttpServlet {

    @EJB
    private department_saveRemote department_save;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servlet Call");
        List<Department> d = department_save.view_all();
    //     Map<String,Object> map=new HashMap<String,Object>();  
     //   Department dObject=new Department();
        
        
//        for (Department dd : d) {
//       //   dObject.setDpartmentID(dd.getDpartmentID());
//       //   dObject.setTitle(dd.getTitle());
//          
//       //   map.put(dd.getDpartmentID().toString(), dObject);
//        }
        
        String json = new Gson().toJson(d);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);

//        req.setAttribute("department_data", d);
//        RequestDispatcher rd=req.getRequestDispatcher("add_department.jsp");
//        rd.forward(req, resp);
        
    }

}
