/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Performance_management;

import com.PerformanceAndFeedback;
import com.google.gson.Gson;
import com.performance_manageRemote;
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
public class getemployee_performance extends HttpServlet {

    @EJB
    private performance_manageRemote performance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a=req.getParameter("id");
        String b[]=a.split("-");
        String c=b[0];
        List<PerformanceAndFeedback> pr=performance_manage.view(c);
        for(PerformanceAndFeedback p:pr){
            System.out.println(p.getPfID()); 
            System.out.println(p.getPerformance()); 
            System.out.println(p.getFeedback()); 
            System.out.println(p.getDecipline()); 
            System.out.println(p.getEmpID()); 
            System.out.println(p.getDate()); 
        }
        
           String json = new Gson().toJson(pr);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

   

}
