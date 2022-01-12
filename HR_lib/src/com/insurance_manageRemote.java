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
public interface insurance_manageRemote {

    void add_insurance(String company,String insuranceid,String monthlyPayment, String empid);

    List<Insurance> view_all_insurance();

    List<Insurance> get_inseuranceFrom_id(String id);
    
    
}
