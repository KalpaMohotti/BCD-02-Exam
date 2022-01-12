/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leave_management;

import com.LeaveType;
import com.Leave_manageRemote;
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
public class leaveManage extends HttpServlet {

    @EJB
    private Leave_manageRemote leave_manage;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<LeaveType> ll=leave_manage.getAll_viewType();
        for(LeaveType leave:ll){
            System.out.println(leave.getLtId());
            System.out.println(leave.getLeaveType());
            
        }
    }


}
