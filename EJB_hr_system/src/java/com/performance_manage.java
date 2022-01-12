/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import Intercepters.getUppercase;
import Intercepters.save_performance;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class performance_manage implements performance_manageRemote {
 @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;
    @Override
    
     @Interceptors(value = save_performance.class)
    public void saveperformance(String performance, String feedback, String decipline, String empid, String date) {
        lk.entity.PerformanceAndFeedback p=new lk.entity.PerformanceAndFeedback();
        lk.entity.Employee e=new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(empid));
        
        p.setPerformance(performance);
        p.setFeedback(feedback);
        p.setDecipline(decipline);
        p.setEmpID(e);
        p.setDate(date);
        em.persist(p);
        em.flush();
        
    }

    @Override
    public List<PerformanceAndFeedback> view(String id) {
        lk.entity.Employee e=new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(id));
        List<PerformanceAndFeedback> performance=new ArrayList<>();
        List<lk.entity.PerformanceAndFeedback> pf=em.createQuery("SELECT p FROM PerformanceAndFeedback p WHERE p.empID = :empID").setParameter("empID", e).getResultList();
        for(lk.entity.PerformanceAndFeedback pp:pf){
            PerformanceAndFeedback jr = new PerformanceAndFeedback();
            jr.setPfID(pp.getPfID());
            jr.setPerformance(pp.getPerformance());
            jr.setFeedback(pp.getFeedback());
            jr.setDecipline(pp.getDecipline());
           
            Employee a = new Employee();
            lk.entity.Employee m = pp.getEmpID();
            
            a.setEmpID(m.getEmpID());
           
            jr.setEmpID(a);
            jr.setDate(pp.getDate());
            performance.add(jr);
        }
        return performance;
    }

    @Override
    public void delete_performance(String id) {
       
        lk.entity.PerformanceAndFeedback pr=em.find(lk.entity.PerformanceAndFeedback.class, Integer.parseInt(id));

        em.remove(pr);

    }

    @Override
    public List<PerformanceAndFeedback> get_empFromid(String id) {
         int iid=Integer.parseInt(id);
          List<PerformanceAndFeedback> emp_array=new ArrayList<>();
        List<lk.entity.PerformanceAndFeedback> employee = em.createQuery("SELECT p FROM PerformanceAndFeedback p WHERE p.pfID = :pfID").setParameter("pfID", iid).getResultList();
        for(lk.entity.PerformanceAndFeedback ee:employee){
            PerformanceAndFeedback jr = new PerformanceAndFeedback();
            jr.setPfID(ee.getPfID());
            jr.setPerformance(ee.getPerformance());
            jr.setFeedback(ee.getFeedback());
            jr.setDecipline(ee.getDecipline());
           
            Employee a = new Employee();
            lk.entity.Employee m = ee.getEmpID();
            
            a.setEmpID(m.getEmpID());
           
            jr.setEmpID(a);
            jr.setDate(ee.getDate());
            emp_array.add(jr);
           
         
        }
        return emp_array;
    }

    @Override
    public void update_performance(String id,String performance, String feedback, String decipline, String empid, String date) {
          lk.entity.PerformanceAndFeedback p=new lk.entity.PerformanceAndFeedback();
        lk.entity.Employee e=new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(empid));
        //e.setEmpID(5);
        p.setPfID(Integer.parseInt(id));
        //p.setPfID(9);
        p.setPerformance(performance);
        p.setFeedback(feedback);
        p.setDecipline(decipline);
        p.setEmpID(e);
        p.setDate(date);
        em.merge(p);
        em.flush();
    }
    
    

    
   
}
