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

public class BankingDetails implements Serializable {

    private static long serialVersionUID = 1L;
    
    private Integer bdID;
   
    private String bankName;
    
    private String accNumber;
   
    private String accountName;
    
    private String payment;
    
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
     * @return the bdID
     */
    public Integer getBdID() {
        return bdID;
    }

    /**
     * @param bdID the bdID to set
     */
    public void setBdID(Integer bdID) {
        this.bdID = bdID;
    }

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the accNumber
     */
    public String getAccNumber() {
        return accNumber;
    }

    /**
     * @param accNumber the accNumber to set
     */
    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
