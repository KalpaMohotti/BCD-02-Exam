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
public class jobrole implements jobroleRemote {

    @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;

    @Override
    public void save_job_role(JobRole jrole, Department dpart) {
        lk.entity.Department dd = new lk.entity.Department();
        dd.setDpartmentID(dpart.getDpartmentID());
        lk.entity.JobRole jr = new lk.entity.JobRole();
        jr.setTittle(jrole.getTittle());
        jr.setLeaveCount(jrole.getLeaveCount());
        jr.setSalary(jrole.getSalary());
        jr.setDpartmentID(dd);

        em.persist(jr);
        em.flush();
    }

    @Override
    public List<JobRole> view_all() {
        List<JobRole> list = new ArrayList<>();

        List<lk.entity.JobRole> d = em.createQuery("SELECT j FROM JobRole j").getResultList();

        for (lk.entity.JobRole dd : d) {

            JobRole jobrole = new JobRole();
            jobrole.setJobID(dd.getJobID());
            jobrole.setTittle(dd.getTittle());
            jobrole.setSalary(dd.getSalary());
            jobrole.setLeaveCount(dd.getLeaveCount());

            lk.entity.Department m = dd.getDpartmentID();
            Department a = new Department();
            a.setDpartmentID(m.getDpartmentID());
            a.setTitle(m.getTitle());

//           
            jobrole.setDpartment(a);
            list.add(jobrole);

            System.out.println(dd.getDpartmentID().getTitle());
            System.out.println(dd.getJobID());
            System.out.println(dd.getSalary());
        }

        return list;
//System.out.println("call this");
//return null;
    }

    @Override
    public List<JobRole> getvalue_fromid(String parameter) {
        System.out.println(parameter);
        int iid=Integer.parseInt(parameter);
        List<JobRole> list = new ArrayList<>();
        List<lk.entity.JobRole> d = em.createQuery("SELECT j FROM JobRole j WHERE j.jobID = :jobID").setParameter("jobID", iid).getResultList();
        for (lk.entity.JobRole dd : d) {

            System.out.println(dd.getJobID());
            System.out.println(dd.getDpartmentID().getTitle());
            System.out.println(dd.getLeaveCount());
            
            JobRole jr = new JobRole();
            jr.setJobID(dd.getJobID());
            jr.setTittle(dd.getTittle());
            jr.setSalary(dd.getSalary());
            jr.setLeaveCount(dd.getLeaveCount());
           
            Department a = new Department();
            lk.entity.Department m = dd.getDpartmentID();
            
            a.setDpartmentID(m.getDpartmentID());
            a.setTitle(m.getTitle());
            jr.setDpartment(a);
            list.add(jr);
            
        }
        
        return list;
    }

    @Override
    public void update_designation(String job_id, String jobrole, String salary, String year_leaves, String did, String department_tittle) {
        lk.entity.Department d=new lk.entity.Department();
        d.setDpartmentID(Integer.parseInt(did));
        d.setTitle(department_tittle);
        lk.entity.JobRole jb=new lk.entity.JobRole();
        jb.setJobID(Integer.parseInt(job_id));
        jb.setTittle(jobrole);
        jb.setSalary(salary);
        jb.setLeaveCount(year_leaves);
        jb.setDpartmentID(d);
        
         em.merge(jb);
        em.flush();
    }
    
    
    
}
