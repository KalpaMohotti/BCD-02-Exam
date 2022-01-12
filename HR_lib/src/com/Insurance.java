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

public class Insurance implements Serializable {

    private static long serialVersionUID = 1L;
  
    private Integer iID;
    
    private String company;
   
    private String insuranceId;
  
    
    private String insuranceType;
    
    private String monthlyPayment;
   
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
     * @return the iID
     */
    public Integer getiID() {
        return iID;
    }

    /**
     * @param iID the iID to set
     */
    public void setiID(Integer iID) {
        this.iID = iID;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the insuranceId
     */
    public String getInsuranceId() {
        return insuranceId;
    }

    /**
     * @param insuranceId the insuranceId to set
     */
    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    /**
     * @return the insuranceType
     */
    public String getInsuranceType() {
        return insuranceType;
    }

    /**
     * @param insuranceType the insuranceType to set
     */
    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    /**
     * @return the monthlyPayment
     */
    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    /**
     * @param monthlyPayment the monthlyPayment to set
     */
    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
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
