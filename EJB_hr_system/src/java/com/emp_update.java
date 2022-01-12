/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Collection;
import javafx.print.Collation;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lk.entity.Allowance;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class emp_update implements emp_updateRemote {
@PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;
    @Override
    public void update_emp() {
//         System.out.println("Kalpa");
//       lk.entity.Employee e=new lk.entity.Employee();
////     
////       
////         
//     //  e.setEmpID(1);
//       e.setFname("aaaaaaa");
//       e.setMname("ss");
//       e.setLname("ssa");
//       e.setTel("asas");
//       e.setAddress1("as");
//       e.setAddress2("asads");
//       e.setAddress3("das");
//       e.setDob("aasdsa");
//       e.setSex("sadsd");
//       e.setBasicSalary("sadd");
//       e.setUrl("adsdsa");
//       e.setLeaveCount(40);
//       e.setEmail("qeqwqwwqdde");
//     
////
////     
////lk.entity.Insurance i=new lk.entity.Insurance();
////e.setEmpID(1);
////i.setIID(2);
////i.setCompany("Alliance insurance");
////i.setInsuranceId("1231234");
////i.setInsuranceType("Third Party");
////i.setMonthlyPayment("30");
////i.setEmpID(e);
//
//// lk.entity.Department d = new lk.entity.Department();
////        d.setDpartmentID(1);
////        d.setTitle("Kasun");
//        em.persist(e);
////     
////       
//        em.flush();

       
    }

    
}
