/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class loginform implements loginformRemote {
 @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;
    @Override
    public String loginto(String uname,String pass) {
//        List<Login> l=new ArrayList<Object>();
String a="k";
        List<lk.entity.Login> l= em.createQuery("SELECT l FROM Login l").getResultList();
        for(lk.entity.Login ll:l){
            if(uname.equals(ll.getUserName())&&pass.equals(ll.getPassword())){
                a=ll.getEmpID().getEmpID().toString()+" "+ll.getStatus();
            }
        }
        return a;
    }

  
}
