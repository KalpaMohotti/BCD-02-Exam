/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Remote
public interface employeeManageRemote {

    void saveEmployee(String empID, String fname, String mname, String lname, String tel, String address1, String address2, String address3, String dob, String sex, String basic, String url, String leave_count, String email, String username, String password,String jobid);

    List<Employee> view_employee();

    List<Employee> get_id_employee(String id);

    void update_employee(String empID, String fname, String mname, String lname, String tel, String address1, String address2, String address3, String dob, String sex, String basic, String url, String leave_count, String email);
    
}
