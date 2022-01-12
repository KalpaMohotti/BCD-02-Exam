/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shifts_management;

import com.Shifts;
import com.google.gson.Gson;
import com.shiftsRemote;
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
public class view_all_working extends HttpServlet {

    @EJB
    private shiftsRemote shifts;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Shifts> s=shifts.viewAll();
        for(Shifts ss:s){
            System.out.println(ss.getEmpID().getFname());
            System.out.println(ss.getShiftsID());
            System.out.println(ss.getStartTime());
        }
        
           String json = new Gson().toJson(s);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }

  

}
