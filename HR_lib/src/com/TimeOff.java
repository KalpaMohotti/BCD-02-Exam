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

public class TimeOff implements Serializable {

    private static long serialVersionUID = 1L;
    
    private Integer toID;
   
    private String requestTime;
   
    private String date;
   
    private String workingHours;
   
    private String status;
    
    private String resion;
   
    private Shifts shiftsID;

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
     * @return the toID
     */
    public Integer getToID() {
        return toID;
    }

    /**
     * @param toID the toID to set
     */
    public void setToID(Integer toID) {
        this.toID = toID;
    }

    /**
     * @return the requestTime
     */
    public String getRequestTime() {
        return requestTime;
    }

    /**
     * @param requestTime the requestTime to set
     */
    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
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
     * @return the workingHours
     */
    public String getWorkingHours() {
        return workingHours;
    }

    /**
     * @param workingHours the workingHours to set
     */
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
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
     * @return the shiftsID
     */
    public Shifts getShiftsID() {
        return shiftsID;
    }

    /**
     * @param shiftsID the shiftsID to set
     */
    public void setShiftsID(Shifts shiftsID) {
        this.shiftsID = shiftsID;
    }

   
    
}
