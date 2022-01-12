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
public class getDetails_id extends HttpServlet {

    @EJB
    private performance_manageRemote performance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        List<PerformanceAndFeedback> pr=  performance_manage.get_empFromid(id);
         String json = new Gson().toJson(pr);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);
    }



}
