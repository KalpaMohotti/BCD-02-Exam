/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage;

import com.Login;
import com.google.gson.Gson;
import com.loginformRemote;
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
public class login_servlet extends HttpServlet {

    @EJB
    private loginformRemote loginform;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String uname= req.getParameter("uname");
       String pass= req.getParameter("pass");
     String aa=loginform.loginto(uname, pass);
        System.out.println(aa);
        String []spl=aa.split(" ");
        String id=spl[0];
        String type=spl[1];
        
        Login l=new Login();
        l.setStatus(type);
      //  l.setUserName(id);
        
        // String json = new Gson().toJson(type);
        // String j=new Gson().toJson(id);
       // resp.setContentType("application/json");
       // resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(aa);
       // resp.getWriter().write(id);
        
    }

    

}
