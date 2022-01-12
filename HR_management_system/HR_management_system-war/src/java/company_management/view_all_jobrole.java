/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;

import com.JobRole;
import com.google.gson.Gson;
import com.jobroleRemote;
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
public class view_all_jobrole extends HttpServlet {

    @EJB
    private jobroleRemote jobrole;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      List<JobRole> d= jobrole.view_all();
for(JobRole j:d){
    System.out.println(j.getJobID()); 
    System.out.println(j.getTittle()); 
    System.out.println(j.getSalary()); 
    System.out.println(j.getLeaveCount()); 
    System.out.println(j.getDpartment().getTitle()); 
    
}

  String json = new Gson().toJson(d);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

    
}
