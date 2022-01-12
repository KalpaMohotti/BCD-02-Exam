/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;

import com.department_saveRemote;
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
public class update_department extends HttpServlet {

    @EJB
    private department_saveRemote department_save;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String tittle=req.getParameter("name");
        String id=req.getParameter("id");
        
       // System.out.println(id+" "+tittle);
        department_save.deleteData(id, tittle);
        
    }

  

}
