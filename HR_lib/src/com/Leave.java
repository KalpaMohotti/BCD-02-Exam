/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kalpa Sadaruwan
 */

public class Leave implements Serializable {

    private static long serialVersionUID = 1L;
   
    private Integer lID;
 
    private String date;
  
    private String time;
    
    private String resion;
    
    private String state;
    
    private String paid;
   
    private LeaveType ltId;
    
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
     * @return the lID
     */
    public Integer getlID() {
        return lID;
    }

    /**
     * @param lID the lID to set
     */
    public void setlID(Integer lID) {
        this.lID = lID;
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
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the resion
     */
    public String getResion() {
        return resion;
    }

    /**
     * @param resion the resion to set
     */
    public void setResion(String resion) {
        this.resion = resion;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the paid
     */
    public String getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(String paid) {
        this.paid = paid;
    }

    /**
     * @return the ltId
     */
    public LeaveType getLtId() {
        return ltId;
    }

    /**
     * @param ltId the ltId to set
     */
    public void setLtId(LeaveType ltId) {
        this.ltId = ltId;
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
