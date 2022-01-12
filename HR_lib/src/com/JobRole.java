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
import javax.persistence.ManyToMany;
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

public class JobRole implements Serializable {

    private static long serialVersionUID = 1L;
    
    
    private Integer jobID;
    
    
    private String tittle;
   
    private String salary;
    
    private String leaveCount;
   
    private Collection<Employee> employeeCollection;
    
    private Department dpartment;
    
    private Collection<OverTimerules> overTimerulesCollection;

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
     * @return the jobID
     */
    public Integer getJobID() {
        return jobID;
    }

    /**
     * @param jobID the jobID to set
     */
    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    /**
     * @return the tittle
     */
    public String getTittle() {
        return tittle;
    }

    /**
     * @param tittle the tittle to set
     */
    public void setTittle(String tittle) {
        this.tittle = tittle;
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
     * @return the leaveCount
     */
    public String getLeaveCount() {
        return leaveCount;
    }

    /**
     * @param leaveCount the leaveCount to set
     */
    public void setLeaveCount(String leaveCount) {
        this.leaveCount = leaveCount;
    }

    /**
     * @return the employeeCollection
     */
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    /**
     * @param employeeCollection the employeeCollection to set
     */
    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    /**
     * @return the dpartmentID
     */
    public Department getDpartment() {
        return dpartment;
    }

    /**
     * @param dpartmentID the dpartmentID to set
     */
    public void setDpartment(Department dpartmentID) {
        this.dpartment = dpartmentID;
    }

    /**
     * @return the overTimerulesCollection
     */
    public Collection<OverTimerules> getOverTimerulesCollection() {
        return overTimerulesCollection;
    }

    /**
     * @param overTimerulesCollection the overTimerulesCollection to set
     */
    public void setOverTimerulesCollection(Collection<OverTimerules> overTimerulesCollection) {
        this.overTimerulesCollection = overTimerulesCollection;
    }

   
}
