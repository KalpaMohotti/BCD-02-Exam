/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kalpa Sadaruwan
 */

public class Shifts implements Serializable {

    private static long serialVersionUID = 1L;
   
    private Integer shiftsID;
    
    private String startTime;
   
    private String endTime;
   
    private String date;
    
    private String workHours;
   
    private String overTime;
    
    private String status;
    
    private Collection<TimeOff> timeOffCollection;
    
    private Employee empID;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the shiftsID
     */
    public Integer getShiftsID() {
        return shiftsID;
    }

    /**
     * @param shiftsID the shiftsID to set
     */
    public void setShiftsID(Integer shiftsID) {
        this.shiftsID = shiftsID;
    }

    /**
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the workHours
     */
    public String getWorkHours() {
        return workHours;
    }

    /**
     * @param workHours the workHours to set
     */
    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    /**
     * @return the overTime
     */
    public String getOverTime() {
        return overTime;
    }

    /**
     * @param overTime the overTime to set
     */
    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the timeOffCollection
     */
    public Collection<TimeOff> getTimeOffCollection() {
        return timeOffCollection;
    }

    /**
     * @param timeOffCollection the timeOffCollection to set
     */
    public void setTimeOffCollection(Collection<TimeOff> timeOffCollection) {
        this.timeOffCollection = timeOffCollection;
    }

    /**
     * @return the empID
     */
    public Employee getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(Employee empID) {
        this.empID = empID;
    }

   
    
}
