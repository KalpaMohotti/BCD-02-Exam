/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_management;

import com.Insurance;
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
public class get_insurance extends HttpServlet {

    @EJB
    private insurance_manageRemote insurance_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Insurance> i=insurance_manage.view_all_insurance();
        for(Insurance ii:i){
            System.out.println(ii.getEmpID());
            System.out.println(ii.getCompany());
            System.out.println(ii.getMonthlyPayment());
            System.out.println(ii.getInsuranceId());
        }
    }

    

}
