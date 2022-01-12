/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_management;

import com.insurance_manageRemote;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.PATCH;

/**
 *
 * @author Kalpa Sadaruwan
 */


public class insurance extends HttpServlet {

    @EJB
    private insurance_manageRemote insurance_manage;

 
   

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    insurance_manage.add_insurance("Alliance", "1234526122", "32000", "1");
    }


}
