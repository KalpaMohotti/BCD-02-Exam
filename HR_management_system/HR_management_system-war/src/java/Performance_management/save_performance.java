/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Performance_management;

import com.performance_manageRemote;
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
public class save_performance extends HttpServlet {

    @EJB
    private performance_manageRemote performance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String emp=req.getParameter("emp");
        String []a=emp.split("-");
        String b=a[0];
        String date=req.getParameter("date");
        String exp=req.getParameter("exp");
        String feed=req.getParameter("feed");
        String compl=req.getParameter("compl");
        try{
              performance_manage.saveperformance(exp, feed, compl, b, date);
        }catch(Exception e){
          
        }
      
    }

  

}
