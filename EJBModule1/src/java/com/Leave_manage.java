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
public class Leave_manage implements Leave_manageRemote {
@PersistenceContext(unitName = "EJBModule1PU")
    EntityManager em;
    @Override
    public List<LeaveType> getAll_viewType() {
          List<LeaveType> list = new ArrayList<>();

        List<lk.entity.LeaveType> d = em.createQuery("SELECT l FROM LeaveType l").getResultList();

        for (lk.entity.LeaveType dd : d) {
           LeaveType l=new LeaveType();
           l.setLtId(dd.getLtId());
           l.setLeaveType(dd.getLeaveType());
            
           
            list.add(l);

          
        }

        return list;
        
       
    }

   
    
    
}
