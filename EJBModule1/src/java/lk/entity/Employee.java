/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Entity
@Table(name = "employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findByEmpID", query = "SELECT e FROM Employee e WHERE e.empID = :empID")
    , @NamedQuery(name = "Employee.findByFname", query = "SELECT e FROM Employee e WHERE e.fname = :fname")
    , @NamedQuery(name = "Employee.findByMname", query = "SELECT e FROM Employee e WHERE e.mname = :mname")
    , @NamedQuery(name = "Employee.findByLname", query = "SELECT e FROM Employee e WHERE e.lname = :lname")
    , @NamedQuery(name = "Employee.findByTel", query = "SELECT e FROM Employee e WHERE e.tel = :tel")
    , @NamedQuery(name = "Employee.findByAddress1", query = "SELECT e FROM Employee e WHERE e.address1 = :address1")
    , @NamedQuery(name = "Employee.findByAddress2", query = "SELECT e FROM Employee e WHERE e.address2 = :address2")
    , @NamedQuery(name = "Employee.findByAddress3", query = "SELECT e FROM Employee e WHERE e.address3 = :address3")
    , @NamedQuery(name = "Employee.findByDob", query = "SELECT e FROM Employee e WHERE e.dob = :dob")
    , @NamedQuery(name = "Employee.findBySex", query = "SELECT e FROM Employee e WHERE e.sex = :sex")
    , @NamedQuery(name = "Employee.findByBasicSalary", query = "SELECT e FROM Employee e WHERE e.basicSalary = :basicSalary")
    , @NamedQuery(name = "Employee.findByUrl", query = "SELECT e FROM Employee e WHERE e.url = :url")
    , @NamedQuery(name = "Employee.findByLeaveCount", query = "SELECT e FROM Employee e WHERE e.leaveCount = :leaveCount")
    , @NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email = :email")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "empID")
    private Integer empID;
    @Size(max = 45)
    @Column(name = "fname")
    private String fname;
    @Size(max = 45)
    @Column(name = "mname")
    private String mname;
    @Size(max = 45)
    @Column(name = "lname")
    private String lname;
    @Size(max = 45)
    @Column(name = "tel")
    private String tel;
    @Size(max = 45)
    @Column(name = "address1")
    private String address1;
    @Size(max = 45)
    @Column(name = "address2")
    private String address2;
    @Size(max = 45)
    @Column(name = "address3")
    private String address3;
    @Size(max = 15)
    @Column(name = "Dob")
    private String dob;
    @Size(max = 10)
    @Column(name = "sex")
    private String sex;
    @Size(max = 15)
    @Column(name = "basic_salary")
    private String basicSalary;
    @Size(max = 45)
    @Column(name = "url")
    private String url;
    @Column(name = "leave_count")
    private Integer leaveCount;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    @JoinTable(name = "employee_has_job", joinColumns = {
        @JoinColumn(name = "empID", referencedColumnName = "empID")}, inverseJoinColumns = {
        @JoinColumn(name = "jobID", referencedColumnName = "jobID")})
    @ManyToMany
    private Collection<JobRole> jobRoleCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<Insurance> insuranceCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<Login> loginCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<Salary> salaryCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<Bank> bankCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empID")
    private Collection<Leave> leaveCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<PerformanceAndFeedback> performanceAndFeedbackCollection;
    @OneToMany(mappedBy = "empID")
    private Collection<Shifts> shiftsCollection;

    public Employee() {
    }

    public Employee(Integer empID) {
        this.empID = empID;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(String basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(Integer leaveCount) {
        this.leaveCount = leaveCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public Collection<JobRole> getJobRoleCollection() {
        return jobRoleCollection;
    }

    public void setJobRoleCollection(Collection<JobRole> jobRoleCollection) {
        this.jobRoleCollection = jobRoleCollection;
    }

    @XmlTransient
    public Collection<Insurance> getInsuranceCollection() {
        return insuranceCollection;
    }

    public void setInsuranceCollection(Collection<Insurance> insuranceCollection) {
        this.insuranceCollection = insuranceCollection;
    }

    @XmlTransient
    public Collection<Login> getLoginCollection() {
        return loginCollection;
    }

    public void setLoginCollection(Collection<Login> loginCollection) {
        this.loginCollection = loginCollection;
    }

    @XmlTransient
    public Collection<Salary> getSalaryCollection() {
        return salaryCollection;
    }

    public void setSalaryCollection(Collection<Salary> salaryCollection) {
        this.salaryCollection = salaryCollection;
    }

    @XmlTransient
    public Collection<Bank> getBankCollection() {
        return bankCollection;
    }

    public void setBankCollection(Collection<Bank> bankCollection) {
        this.bankCollection = bankCollection;
    }

    @XmlTransient
    public Collection<Leave> getLeaveCollection() {
        return leaveCollection;
    }

    public void setLeaveCollection(Collection<Leave> leaveCollection) {
        this.leaveCollection = leaveCollection;
    }

    @XmlTransient
    public Collection<PerformanceAndFeedback> getPerformanceAndFeedbackCollection() {
        return performanceAndFeedbackCollection;
    }

    public void setPerformanceAndFeedbackCollection(Collection<PerformanceAndFeedback> performanceAndFeedbackCollection) {
        this.performanceAndFeedbackCollection = performanceAndFeedbackCollection;
    }

    @XmlTransient
    public Collection<Shifts> getShiftsCollection() {
        return shiftsCollection;
    }

    public void setShiftsCollection(Collection<Shifts> shiftsCollection) {
        this.shiftsCollection = shiftsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empID != null ? empID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.empID == null && other.empID != null) || (this.empID != null && !this.empID.equals(other.empID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Employee[ empID=" + empID + " ]";
    }
    
}
