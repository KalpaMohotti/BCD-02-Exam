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
public interface shiftsRemote {

    void markshifts(String startTime,String date,String emp_id);

    void shiftover(String endtime, String shiftid);

    List<Shifts> viewAll();

    List<Shifts> viewAll_shifts();

    List<Shifts> betweenWorking_days(String start, String end);
    
}
