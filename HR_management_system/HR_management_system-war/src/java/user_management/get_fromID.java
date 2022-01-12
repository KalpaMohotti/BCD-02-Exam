/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_management;

import com.Insurance;
import com.google.gson.Gson;
import com.insurance_manageRemote;
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
public class get_fromID extends HttpServlet {

    @EJB
    private insurance_manageRemote insurance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String a=  req.getParameter("id");
        List<Insurance> i=insurance_manage.get_inseuranceFrom_id(a);
//        for(Insurance ii:i){
//            System.out.println(ii.getEmpID());
//            System.out.println(ii.getCompany());
//            System.out.println(ii.getMonthlyPayment());
//        }
        
           String json = new Gson().toJson(i);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
        
    }

   

}
