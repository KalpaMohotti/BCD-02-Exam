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

public class Salary implements Serializable {

    private static long serialVersionUID = 1L;
    
    private Integer salaryID;
  
    private String month;
  
    private String salary;
 
    private String totalAllowance;
    
    private Collection<BankingDetails> bankingDetailsCollection;
    
    private Employee empID;
    
    private Collection<InsuranceDetails> insuranceDetailsCollection;

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
     * @return the salaryID
     */
    public Integer getSalaryID() {
        return salaryID;
    }

    /**
     * @param salaryID the salaryID to set
     */
    public void setSalaryID(Integer salaryID) {
        this.salaryID = salaryID;
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
     * @return the salary
     */
    public String getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(String salary) {
        this.salary = salary;
    }

    /**
     * @return the totalAllowance
     */
    public String getTotalAllowance() {
        return totalAllowance;
    }

    /**
     * @param totalAllowance the totalAllowance to set
     */
    public void setTotalAllowance(String totalAllowance) {
        this.totalAllowance = totalAllowance;
    }

    /**
     * @return the bankingDetailsCollection
     */
    public Collection<BankingDetails> getBankingDetailsCollection() {
        return bankingDetailsCollection;
    }

    /**
     * @param bankingDetailsCollection the bankingDetailsCollection to set
     */
    public void setBankingDetailsCollection(Collection<BankingDetails> bankingDetailsCollection) {
        this.bankingDetailsCollection = bankingDetailsCollection;
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

    /**
     * @return the insuranceDetailsCollection
     */
    public Collection<InsuranceDetails> getInsuranceDetailsCollection() {
        return insuranceDetailsCollection;
    }

    /**
     * @param insuranceDetailsCollection the insuranceDetailsCollection to set
     */
    public void setInsuranceDetailsCollection(Collection<InsuranceDetails> insuranceDetailsCollection) {
        this.insuranceDetailsCollection = insuranceDetailsCollection;
    }

    
    
}
