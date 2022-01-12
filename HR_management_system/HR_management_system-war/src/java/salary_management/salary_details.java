/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salary_management;

import com.google.gson.Gson;
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
public class salary_details extends HttpServlet {

    @EJB
    private salary_manageRemote salary_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String start=req.getParameter("start");
        String end=req.getParameter("end");
        String id=req.getParameter("id");
        System.out.println(start);
        System.out.println(end);
        System.out.println(id);
        
   // String a=  salary_manage.getpayment_details("2021-07-08", "2021-07-25","1");
      String a= salary_manage.getpayment_details(start,end,id);
        System.out.println(a);
           String json = new Gson().toJson(a);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
//System.out.println(a);
    }

  

}
