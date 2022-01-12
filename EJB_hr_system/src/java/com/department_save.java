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
public class department_save implements department_saveRemote {

    @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;

    @Override
    public void save_data(Department parameter) {
        lk.entity.Department dd = new lk.entity.Department();
        dd.setDpartmentID(parameter.getDpartmentID());
        dd.setTitle(parameter.getTitle());
        em.persist(dd);
        em.flush();
    }

    @Override
    public List<Department> view_all() {
        List<Department> list = new ArrayList<>();

        List<lk.entity.Department> d = em.createQuery("SELECT d FROM Department d").getResultList();
        for (lk.entity.Department dd : d) {

            Department department = new Department();
            department.setDpartmentID(dd.getDpartmentID());
            department.setTitle(dd.getTitle());
            list.add(department);
        }

        return list;

    }

    @Override
    public void deleteData(String id,String tittle) {
        System.out.println(id);
        System.out.println(tittle);
        lk.entity.Department d = new lk.entity.Department();
        d.setDpartmentID(Integer.parseInt(id));
        d.setTitle(tittle);
        em.merge(d);
        em.flush();
    }

    @Override
    public List<Department> getid_value(String id) {
        int iid=Integer.parseInt(id);
       
        List<Department> list = new ArrayList<>();
        List<lk.entity.Department> d = em.createQuery("SELECT d FROM Department d WHERE d.dpartmentID = :dpartmentID").setParameter("dpartmentID", iid).getResultList();

        for (lk.entity.Department dd : d) {

            Department department = new Department();
            department.setDpartmentID(dd.getDpartmentID());
            department.setTitle(dd.getTitle());
            list.add(department);
        }

        return list;
    }

}
