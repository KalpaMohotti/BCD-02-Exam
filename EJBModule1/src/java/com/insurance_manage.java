/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class insurance_manage implements insurance_manageRemote {
@PersistenceContext(unitName = "EJBModule1PU")
    EntityManager em;
//@Resource
//    UserTransaction ut;

    @Override
   
    public void add_insurance(String company,String insuranceid,String monthlyPayment, String empid) {
        System.out.println("Kalpa");
        System.out.println(company);
        System.out.println(insuranceid);
        System.out.println(monthlyPayment);
        System.out.println(empid);
     

        lk.entity.Insurance i=new lk.entity.Insurance();
        i.setCompany(company);
        i.setInsuranceId(insuranceid);
        i.setMonthlyPayment(monthlyPayment);
        lk.entity.Employee e=new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(empid));
        
        i.setEmpID(e);
        em.persist(i);
        em.flush();

        
        
        
    }

    @Override
    public List<Insurance> view_all_insurance() {
          List<Insurance> performance=new ArrayList<>();
        List<lk.entity.Insurance> pf=em.createQuery("SELECT i FROM Insurance i").getResultList();
        for(lk.entity.Insurance pp:pf){
            Insurance i = new Insurance();
           i.setiID(pp.getIID());
           i.setCompany(pp.getCompany());
           i.setInsuranceId(pp.getInsuranceId());
           i.setInsuranceType(pp.getInsuranceType());
           i.setMonthlyPayment(pp.getMonthlyPayment());
           
           
            Employee a = new Employee();
            lk.entity.Employee m = pp.getEmpID();
            
            a.setEmpID(m.getEmpID());
           
            i.setEmpID(a);
            
            performance.add(i);
        }
        return performance;
    }

    @Override
    public List<Insurance> get_inseuranceFrom_id(String id) {
       int e= Integer.parseInt(id);
          List<Insurance> performance=new ArrayList<>();
        List<lk.entity.Insurance> pf=em.createQuery("SELECT i FROM Insurance i WHERE i.iID = :iID").setParameter("iID", e).getResultList();
        for(lk.entity.Insurance pp:pf){
            Insurance i = new Insurance();
           i.setiID(pp.getIID());
           i.setCompany(pp.getCompany());
           i.setInsuranceId(pp.getInsuranceId());
           i.setInsuranceType(pp.getInsuranceType());
           i.setMonthlyPayment(pp.getMonthlyPayment());
           
           
            Employee a = new Employee();
            //lk.entity.Employee m =pp.getEmpID();
            lk.entity.Employee m =pp.getEmpID();
            
               
            
            a.setEmpID(m.getEmpID());
            a.setFname(m.getFname());
            a.setLname(m.getLname());
           
            i.setEmpID(a);
            
            performance.add(i);
        }
     
        
        return performance;
    }
    
    
    
    

}
