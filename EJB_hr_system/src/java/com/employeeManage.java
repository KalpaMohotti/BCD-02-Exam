/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import Intercepters.getUppercase;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import lk.entity.Employee_;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
@TransactionManagement(value=TransactionManagementType.BEAN)
public class employeeManage implements employeeManageRemote {
@PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;
@Resource
    UserTransaction ut;
    @Override
    @Interceptors(value = getUppercase.class)
    public void saveEmployee(String empID, String fname, String mname, String lname, String tel, String address1, String address2, String address3, String dob, String sex, String basic, String url, String leave_count, String email, String username, String password,String jobid) {
        try {
            ut.begin();
            
             
             
            List<lk.entity.Employee> employee=em.createQuery("SELECT e FROM Employee e").getResultList();
            lk.entity.Employee ee=  employee.get(employee.size()-1);
       int i=ee.getEmpID();
        int ii=i+1;     
             
             
             
          lk.entity.Employee e=new lk.entity.Employee();   
             
        e.setEmpID(ii);
        e.setFname(fname);
        e.setMname(mname);
        e.setLname(lname);
        e.setTel(tel);
        e.setAddress1(address1);
        e.setAddress2(address2);
        e.setAddress3(address3);
        e.setDob(dob);
        e.setSex(sex);
        e.setBasicSalary(basic);
        e.setUrl(url);
        e.setLeaveCount(Integer.parseInt(leave_count));
        e.setEmail(email);
        
        lk.entity.Login l=new lk.entity.Login();
      //  l.setLogID(Integer.parseInt(empID));
        l.setLogID(ii);
        l.setUserName(username);
        l.setPassword(password);
        l.setStatus("user");
        l.setEmpID(e);
        
        em.persist(e);
        em.persist(l);
        em.flush();
            
            
            ut.commit();
        } catch (Exception e) {
            try {
                ut.rollback();
            } catch (IllegalStateException ex) {
                
                Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SecurityException ex) {
                Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SystemException ex) {
                Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
       
        
    }

    @Override
    public List<Employee> view_employee() {
        List<Employee> emp_array=new ArrayList<>();
        List<lk.entity.Employee> employee=em.createQuery("SELECT e FROM Employee e").getResultList();
        for(lk.entity.Employee ee:employee){
         Employee e=new Employee();
         e.setEmpID(ee.getEmpID());
         e.setFname(ee.getFname());
         e.setMname(ee.getMname());
         e.setLname(ee.getLname());
         e.setTel(ee.getTel());
         e.setAddress1(ee.getAddress1());
         e.setAddress2(ee.getAddress2());
         e.setAddress3(ee.getAddress3());
         e.setDob(ee.getDob());
         e.setSex(ee.getSex());
         e.setBasicSalary(ee.getBasicSalary());
         e.setUrl(ee.getUrl());
         e.setLeaveCount(ee.getLeaveCount());
         e.setEmail(ee.getEmail());
         emp_array.add(e);
         
        }
        return emp_array;
    }

    @Override
    public List<Employee> get_id_employee(String id) {
        int iid=Integer.parseInt(id);
          List<Employee> emp_array=new ArrayList<>();
        List<lk.entity.Employee> employee = em.createQuery("SELECT e FROM Employee e WHERE e.empID = :empID").setParameter("empID", iid).getResultList();
        for(lk.entity.Employee ee:employee){
         Employee e=new Employee();
         e.setEmpID(ee.getEmpID());
         e.setFname(ee.getFname());
         e.setMname(ee.getMname());
         e.setLname(ee.getLname());
         e.setTel(ee.getTel());
         e.setAddress1(ee.getAddress1());
         e.setAddress2(ee.getAddress2());
         e.setAddress3(ee.getAddress3());
         e.setDob(ee.getDob());
         e.setSex(ee.getSex());
         e.setBasicSalary(ee.getBasicSalary());
         e.setUrl(ee.getUrl());
         e.setLeaveCount(ee.getLeaveCount());
         e.setEmail(ee.getEmail());
         emp_array.add(e);
         
        }
        return emp_array;
        
    }
    @Resource
UserTransaction at;
    @Override
    public void update_employee(String empID, String fname, String mname, String lname, String tel, String address1, String address2, String address3, String dob, String sex, String basic, String url, String leave_count, String email) {
  
    try {
        at.begin();
         lk.entity.Employee e=new lk.entity.Employee();
         
       e.setEmpID(5);
       e.setFname("");
       e.setMname("");
       e.setLname("");
       e.setTel("");
       e.setAddress1("");
       e.setAddress3("");
       e.setAddress3("");
       e.setDob("");
       e.setSex("");
       e.setBasicSalary("");
       e.setUrl("");
       e.setLeaveCount(40);
       e.setEmail("");
       
        em.merge(e);
        em.flush();

//lk.entity.Department d = new lk.entity.Department();
//        d.setDpartmentID(4);
//        d.setTitle("Hiiiii");
//        em.merge(d);
//        em.flush();
        at.commit();
    } catch (NotSupportedException ex) {
        try {
            at.rollback();
        } catch (IllegalStateException ex1) {
            Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (SecurityException ex1) {
            Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex1);
        } catch (SystemException ex1) {
            Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex1);
        }
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SystemException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (RollbackException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (HeuristicMixedException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (HeuristicRollbackException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SecurityException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IllegalStateException ex) {
        Logger.getLogger(employeeManage.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
  
    
        
       
        
    
      
 
   
        
        //em.flush();
        
    }
    
    
    

    
}
