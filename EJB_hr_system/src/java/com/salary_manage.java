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
import javax.persistence.Query;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class salary_manage implements salary_manageRemote {

    int work;
    int overtime;
    @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;

    @Override
    public String getpayment_details(String start, String end, String empid) {
       int eid= Integer.parseInt(empid);
        List<Shifts> list = new ArrayList<>();

        Query query = em.createQuery(
                "SELECT s FROM Shifts s WHERE s.date BETWEEN :startDate AND :endDate order "
                + "by s.date");

        query.setParameter("startDate", start);
        query.setParameter("endDate", end);

        List<lk.entity.Shifts> shift = query.getResultList();

        for (lk.entity.Shifts sh : shift) {

            if (sh.getEmpID().getEmpID() == eid) {
                System.out.println("jjjj");

                Shifts s = new Shifts();

                work += Integer.parseInt(sh.getWorkHours());

                //  System.out.println(sh.getOverTime());
                if (sh.getOverTime() == null) {
                    overtime += 0;
//System.out.println(sh.getOverTime());
                } else {
                    overtime += Integer.parseInt(sh.getOverTime());
                }

                s.setWorkHours(sh.getWorkHours());
                s.setOverTime(sh.getOverTime());
                s.setStatus(sh.getStatus());

                list.add(s);
            }

        }
       // System.out.println(work);
       // System.out.println(overtime);
        String a=work+" "+overtime;
        work = 0;
        overtime = 0;
        //     System.out.println(overtime);
        return a;
    }

    @Override
    public void saveSalary(String month,String salary,String allowance,String empid) {
         lk.entity.Salary p=new lk.entity.Salary();
        lk.entity.Employee e=new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(empid));
        
        p.setMonth(month);
        p.setSalary(salary);
        p.setTotalAllowance(allowance);
        p.setEmpID(e);
        em.persist(p);
        em.flush();
    }

    @Override
    public List<Salary> salaryHistory(String id) {
        int a=Integer.parseInt(id);
        lk.entity.Employee ee=new lk.entity.Employee();
        ee.setEmpID(a);
           List<Salary> list = new ArrayList<>();
        List<lk.entity.Salary> shift = em.createQuery("SELECT s FROM Salary s WHERE s.empID = :empID").setParameter("empID", ee).getResultList();
        for (lk.entity.Salary ss : shift) {
            Salary s = new Salary();
            s.setSalaryID(ss.getSalaryID());
            s.setMonth(ss.getMonth());
            s.setSalary(ss.getSalary());
            s.setTotalAllowance(ss.getTotalAllowance());

            Employee e = new Employee();
            lk.entity.Employee emp = ss.getEmpID();

            e.setEmpID(emp.getEmpID());
            
            e.setUrl(emp.getUrl());

            s.setEmpID(e);
            list.add(s);
        }
        return list;
    }
    
    
    
    
    
    

}
