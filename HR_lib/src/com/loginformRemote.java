/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import javax.ejb.Remote;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Remote
public interface loginformRemote {

    String loginto(String uname,String pass);
    
}
