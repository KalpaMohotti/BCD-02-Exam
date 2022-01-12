/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee_management;

import com.emp_updateRemote;
import com.employeeManageRemote;

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
public class update extends HttpServlet {

    @EJB
    private emp_updateRemote emp_update;

//    @EJB
//    private employeeManageRemote employeeManage;

    

    

    

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //   employeeManage.update_employee("2", "Kalpa", "Sadaruwan", "Mohotti", "0750912018", "Araluwagoda", "Madawala", "Active", "1997/12/21", "male", "24000", "Manager", "25", "kalpa@gmail.com");
    emp_update.update_emp();
    }

    

}
