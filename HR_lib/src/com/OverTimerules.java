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

public class OverTimerules implements Serializable {

    private static long serialVersionUID = 1L;
    
    private Integer otID;
    
    private String disc;
    
    private String normalHour;
   
    private String overTimeHour;
   
    private JobRole jobID;

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
     * @return the otID
     */
    public Integer getOtID() {
        return otID;
    }

    /**
     * @param otID the otID to set
     */
    public void setOtID(Integer otID) {
        this.otID = otID;
    }

    /**
     * @return the disc
     */
    public String getDisc() {
        return disc;
    }

    /**
     * @param disc the disc to set
     */
    public void setDisc(String disc) {
        this.disc = disc;
    }

    /**
     * @return the normalHour
     */
    public String getNormalHour() {
        return normalHour;
    }

    /**
     * @param normalHour the normalHour to set
     */
    public void setNormalHour(String normalHour) {
        this.normalHour = normalHour;
    }

    /**
     * @return the overTimeHour
     */
    public String getOverTimeHour() {
        return overTimeHour;
    }

    /**
     * @param overTimeHour the overTimeHour to set
     */
    public void setOverTimeHour(String overTimeHour) {
        this.overTimeHour = overTimeHour;
    }

    /**
     * @return the jobID
     */
    public JobRole getJobID() {
        return jobID;
    }

    /**
     * @param jobID the jobID to set
     */
    public void setJobID(JobRole jobID) {
        this.jobID = jobID;
    }

   
    
}
