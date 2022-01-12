/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package company_management;




import com.Department;
import com.department_saveRemote;
import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Kalpa Sadaruwan
 */
public class register_department extends HttpServlet {

    @EJB
    private department_saveRemote department_save;



 

   
 

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        System.out.println(name);
        
        Department d=new Department();
        d.setDpartmentID(45);
        d.setTitle(name);
        department_save.save_data(d);
        
       
        
       
    }

  

}
