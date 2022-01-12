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

public class InsuranceDetails implements Serializable {

    private static long serialVersionUID = 1L;

    private Integer iID;

    private String month;

    private String payment;
 
    private String insuranceId;
  
    private Salary salaryID;

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
     * @return the month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(String month) {
        this.month = month;
    }

    /**
     * @return the payment
     */
    public String getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(String payment) {
        this.payment = payment;
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
     * @return the salaryID
     */
    public Salary getSalaryID() {
        return salaryID;
    }

    /**
     * @param salaryID the salaryID to set
     */
    public void setSalaryID(Salary salaryID) {
        this.salaryID = salaryID;
    }


    
}
