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
public class update_per extends HttpServlet {

    @EJB
    private performance_manageRemote performance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
          String emp=req.getParameter("emp");
        String []a=emp.split("-");
        String b=a[0];
        String date=req.getParameter("date");
        String exp=req.getParameter("exp");
        String feed=req.getParameter("feed");
        String compl=req.getParameter("compl");
       performance_manage.update_performance(id, exp, feed, compl, b, date);
     //  performance_manage.update_performance("9", "ss", "dd", "hh", "5", "dsf");
    }

  

}
