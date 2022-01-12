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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Kalpa Sadaruwan
 */

public class Employee implements Serializable {

    private static long serialVersionUID = 1L;
   
 
   
    private Integer empID;
  
    private String fname;
   
    private String mname;
   
    private String lname;
    
    private String tel;
   
    private String address1;
   
    private String address2;
   
    private String address3;
    
    private String dob;
   
    private String sex;
   
    private String basicSalary;
   
    private String url;
   
    private Integer leaveCount;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
   
    private String email;
    
    
    private Collection<JobRole> jobRoleCollection;
    
    private Collection<Insurance> insuranceCollection;
    
    private Collection<Allowance> allowanceCollection;
    
    private Collection<Login> loginCollection;
    
    private Collection<Salary> salaryCollection;
   
    private Collection<Bank> bankCollection;
   
    private Collection<Leave> leaveCollection;
  
    private Collection<PerformanceAndFeedback> performanceAndFeedbackCollection;
    
    private Collection<Shifts> shiftsCollection;

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
     * @return the empID
     */
    public Integer getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    /**
     * @return the fname
     */
    public String getFname() {
        return fname;
    }

    /**
     * @param fname the fname to set
     */
    public void setFname(String fname) {
        this.fname = fname;
    }

    /**
     * @return the mname
     */
    public String getMname() {
        return mname;
    }

    /**
     * @param mname the mname to set
     */
    public void setMname(String mname) {
        this.mname = mname;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @param lname the lname to set
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the basicSalary
     */
    public String getBasicSalary() {
        return basicSalary;
    }

    /**
     * @param basicSalary the basicSalary to set
     */
    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the leaveCount
     */
    public Integer getLeaveCount() {
        return leaveCount;
    }

    /**
     * @param leaveCount the leaveCount to set
     */
    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the jobRoleCollection
     */
    public Collection<JobRole> getJobRoleCollection() {
        return jobRoleCollection;
    }

    /**
     * @param jobRoleCollection the jobRoleCollection to set
     */
    public void setJobRoleCollection(Collection<JobRole> jobRoleCollection) {
        this.jobRoleCollection = jobRoleCollection;
    }

    /**
     * @return the insuranceCollection
     */
    public Collection<Insurance> getInsuranceCollection() {
        return insuranceCollection;
    }

    /**
     * @param insuranceCollection the insuranceCollection to set
     */
    public void setInsuranceCollection(Collection<Insurance> insuranceCollection) {
        this.insuranceCollection = insuranceCollection;
    }

    /**
     * @return the allowanceCollection
     */
    public Collection<Allowance> getAllowanceCollection() {
        return allowanceCollection;
    }

    /**
     * @param allowanceCollection the allowanceCollection to set
     */
    public void setAllowanceCollection(Collection<Allowance> allowanceCollection) {
        this.allowanceCollection = allowanceCollection;
    }

    /**
     * @return the loginCollection
     */
    public Collection<Login> getLoginCollection() {
        return loginCollection;
    }

    /**
     * @param loginCollection the loginCollection to set
     */
    public void setLoginCollection(Collection<Login> loginCollection) {
        this.loginCollection = loginCollection;
    }

    /**
     * @return the salaryCollection
     */
    public Collection<Salary> getSalaryCollection() {
        return salaryCollection;
    }

    /**
     * @param salaryCollection the salaryCollection to set
     */
    public void setSalaryCollection(Collection<Salary> salaryCollection) {
        this.salaryCollection = salaryCollection;
    }

    /**
     * @return the bankCollection
     */
    public Collection<Bank> getBankCollection() {
        return bankCollection;
    }

    /**
     * @param bankCollection the bankCollection to set
     */
    public void setBankCollection(Collection<Bank> bankCollection) {
        this.bankCollection = bankCollection;
    }

    /**
     * @return the leaveCollection
     */
    public Collection<Leave> getLeaveCollection() {
        return leaveCollection;
    }

    /**
     * @param leaveCollection the leaveCollection to set
     */
    public void setLeaveCollection(Collection<Leave> leaveCollection) {
        this.leaveCollection = leaveCollection;
    }

    /**
     * @return the performanceAndFeedbackCollection
     */
    public Collection<PerformanceAndFeedback> getPerformanceAndFeedbackCollection() {
        return performanceAndFeedbackCollection;
    }

    /**
     * @param performanceAndFeedbackCollection the performanceAndFeedbackCollection to set
     */
    public void setPerformanceAndFeedbackCollection(Collection<PerformanceAndFeedback> performanceAndFeedbackCollection) {
        this.performanceAndFeedbackCollection = performanceAndFeedbackCollection;
    }

    /**
     * @return the shiftsCollection
     */
    public Collection<Shifts> getShiftsCollection() {
        return shiftsCollection;
    }

    /**
     * @param shiftsCollection the shiftsCollection to set
     */
    public void setShiftsCollection(Collection<Shifts> shiftsCollection) {
        this.shiftsCollection = shiftsCollection;
    }

   
    
}
