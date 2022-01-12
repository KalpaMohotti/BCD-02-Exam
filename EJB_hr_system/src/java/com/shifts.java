/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import Intercepters.attendance_check;
import Intercepters.save_performance;
import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Stateless
public class shifts implements shiftsRemote {

    @PersistenceContext(unitName = "EJB_hr_systemPU")
    EntityManager em;

    @Override
    @Interceptors(value = attendance_check.class)
    public void markshifts(String startTime, String date, String emp_id) {
        System.out.println("Kalpa Sadaruwan Mohotti");
        System.out.println(startTime);
        System.out.println(date);
        System.out.println(emp_id);
        lk.entity.Shifts s = new lk.entity.Shifts();
        lk.entity.Employee e = new lk.entity.Employee();
        e.setEmpID(Integer.parseInt(emp_id));
        s.setStartTime(startTime);
        s.setEndTime("");
        s.setDate(date);
        s.setWorkHours("");
        s.setOverTime("");
        s.setStatus("Working");
        s.setEmpID(e);
        em.persist(s);
        em.flush();
    }

    @Override
    public void shiftover(String endtime, String shiftid) {
        int id = Integer.parseInt(shiftid);
        List<lk.entity.Shifts> shift = em.createQuery("SELECT s FROM Shifts s WHERE s.shiftsID = :shiftsID").setParameter("shiftsID", id).getResultList();
        String startTime = "";
        String date = "";
        lk.entity.Employee empid = new lk.entity.Employee();
        long difference = 0;
        for (lk.entity.Shifts s : shift) {
            startTime = s.getStartTime();
            date = s.getDate();
            empid = s.getEmpID();
            System.out.println(s.getStartTime() + "Kalpaaa");
        }
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date1 = format.parse(startTime);
            Date date2 = format.parse(endtime);

            difference = date2.getTime() - date1.getTime();

        } catch (ParseException ex) {
            Logger.getLogger(shifts.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(difference);
        long dif = difference / (60 * 60 * 1000) % 24;
        System.out.println(dif);
        lk.entity.Shifts ss = new lk.entity.Shifts();
        if (dif <= 8) {
            ss.setShiftsID(id);
            ss.setStartTime(startTime);
            ss.setEndTime(endtime);
            ss.setDate(date);
            ss.setStatus("Off");
            ss.setWorkHours(String.valueOf(dif));
            ss.setEmpID(empid);
            em.merge(ss);
            em.flush();
        } else {
            long c = dif - 8;
            System.out.println(c + " Over Time");
            ss.setShiftsID(id);
            ss.setStartTime(startTime);
            ss.setEndTime(endtime);
            ss.setDate(date);
            ss.setStatus("Off");
            ss.setWorkHours(String.valueOf(dif));
            ss.setOverTime(String.valueOf(c));
            ss.setEmpID(empid);
            em.merge(ss);
            em.flush();
        }
    }

    @Override
    public List<Shifts> viewAll() {

        List<Shifts> list = new ArrayList<>();
        List<lk.entity.Shifts> shift = em.createQuery("SELECT s FROM Shifts s WHERE s.status = :status").setParameter("status", "Working").getResultList();
        for (lk.entity.Shifts ss : shift) {
            Shifts s = new Shifts();
            s.setShiftsID(ss.getShiftsID());
            s.setStartTime(ss.getStartTime());

            Employee e = new Employee();
            lk.entity.Employee emp = ss.getEmpID();

            e.setEmpID(emp.getEmpID());
            e.setFname(emp.getFname());
            e.setMname(emp.getMname());
            e.setLname(emp.getLname());
            e.setUrl(emp.getUrl());

            s.setEmpID(e);
            list.add(s);
        }
        return list;
    }

    @Override
    public List<Shifts> viewAll_shifts() {

        List<Shifts> list = new ArrayList<>();
        List<lk.entity.Shifts> shift = em.createQuery("SELECT s FROM Shifts s").getResultList();
        for (lk.entity.Shifts sh : shift) {
            Shifts s = new Shifts();
            s.setShiftsID(sh.getShiftsID());
            s.setStartTime(sh.getStartTime());
            s.setEndTime(sh.getEndTime());
            s.setDate(sh.getDate());
            s.setWorkHours(sh.getWorkHours());
            s.setOverTime(sh.getOverTime());
            s.setStatus(sh.getStatus());

            Employee e = new Employee();
            lk.entity.Employee emp = sh.getEmpID();

            e.setEmpID(emp.getEmpID());
            e.setFname(emp.getFname());
            e.setMname(emp.getMname());
            e.setLname(emp.getLname());
            e.setUrl(emp.getUrl());

            s.setEmpID(e);
            list.add(s);
        }
        return list;
    }

    @Override
    public List<Shifts> betweenWorking_days(String start, String end) {

        List<Shifts> list = new ArrayList<>();

        Query query = em.createQuery(
                "SELECT s FROM Shifts s WHERE s.date BETWEEN :startDate AND :endDate order "
                + "by s.date");
        

        query.setParameter("startDate", start);
        query.setParameter("endDate", end);

        List<lk.entity.Shifts> shift = query.getResultList();

        for (lk.entity.Shifts sh : shift) {
            
            Shifts s = new Shifts();
            s.setShiftsID(sh.getShiftsID());
            s.setStartTime(sh.getStartTime());
            s.setEndTime(sh.getEndTime());
            s.setDate(sh.getDate());
            s.setWorkHours(sh.getWorkHours());
            s.setOverTime(sh.getOverTime());
            s.setStatus(sh.getStatus());
            
            Employee e = new Employee();
            lk.entity.Employee emp = sh.getEmpID();

            e.setEmpID(emp.getEmpID());
            e.setFname(emp.getFname());
            e.setMname(emp.getMname());
            e.setLname(emp.getLname());
            e.setUrl(emp.getUrl());
            
            
            s.setEmpID(e);
            list.add(s);
            
            
        
        }
        return list;
    }

}
