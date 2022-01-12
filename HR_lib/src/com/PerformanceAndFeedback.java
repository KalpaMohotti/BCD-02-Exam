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

public class PerformanceAndFeedback implements Serializable {

    private static long serialVersionUID = 1L;
   
    private Integer pfID;
   
    private String performance;
   
    private String feedback;
  
    private String decipline;
    
    private String date;
 
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
     * @return the pfID
     */
    public Integer getPfID() {
        return pfID;
    }

    /**
     * @param pfID the pfID to set
     */
    public void setPfID(Integer pfID) {
        this.pfID = pfID;
    }

    /**
     * @return the performance
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * @param performance the performance to set
     */
    public void setPerformance(String performance) {
        this.performance = performance;
    }

    /**
     * @return the feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback the feedback to set
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return the decipline
     */
    public String getDecipline() {
        return decipline;
    }

    /**
     * @param decipline the decipline to set
     */
    public void setDecipline(String decipline) {
        this.decipline = decipline;
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
