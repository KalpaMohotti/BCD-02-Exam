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
public interface Leave_manageRemote {

    List<LeaveType> getAll_viewType();
    
}
