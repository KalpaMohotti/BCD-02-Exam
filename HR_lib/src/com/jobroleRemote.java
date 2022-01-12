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
public interface jobroleRemote {

    void save_job_role(JobRole jrole, Department dpart);

    List<JobRole> view_all();

    List<JobRole> getvalue_fromid(String parameter);

    void update_designation(String job_id, String jobrole, String salary, String year_leaves, String did, String department_tittle);
    
}
