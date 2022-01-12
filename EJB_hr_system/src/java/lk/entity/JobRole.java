/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.entity;

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
@Entity
@Table(name = "job_role")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JobRole.findAll", query = "SELECT j FROM JobRole j")
    , @NamedQuery(name = "JobRole.findByJobID", query = "SELECT j FROM JobRole j WHERE j.jobID = :jobID")
    , @NamedQuery(name = "JobRole.findByTittle", query = "SELECT j FROM JobRole j WHERE j.tittle = :tittle")
    , @NamedQuery(name = "JobRole.findBySalary", query = "SELECT j FROM JobRole j WHERE j.salary = :salary")
    , @NamedQuery(name = "JobRole.findByLeaveCount", query = "SELECT j FROM JobRole j WHERE j.leaveCount = :leaveCount")})
public class JobRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "jobID")
    private Integer jobID;
    @Size(max = 45)
    @Column(name = "tittle")
    private String tittle;
    @Size(max = 45)
    @Column(name = "salary")
    private String salary;
    @Size(max = 45)
    @Column(name = "leave_count")
    private String leaveCount;
    @ManyToMany(mappedBy = "jobRoleCollection")
    private Collection<Employee> employeeCollection;
    @JoinColumn(name = "dpartmentID", referencedColumnName = "dpartmentID")
    @ManyToOne
    private Department dpartmentID;
    @OneToMany(mappedBy = "jobID")
    private Collection<OverTimerules> overTimerulesCollection;

    public JobRole() {
    }

    public JobRole(Integer jobID) {
        this.jobID = jobID;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLeaveCount() {
        return leaveCount;
    }

    public void setLeaveCount(String leaveCount) {
        this.leaveCount = leaveCount;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

    public Department getDpartmentID() {
        return dpartmentID;
    }

    public void setDpartmentID(Department dpartmentID) {
        this.dpartmentID = dpartmentID;
    }

    @XmlTransient
    public Collection<OverTimerules> getOverTimerulesCollection() {
        return overTimerulesCollection;
    }

    public void setOverTimerulesCollection(Collection<OverTimerules> overTimerulesCollection) {
        this.overTimerulesCollection = overTimerulesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (jobID != null ? jobID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobRole)) {
            return false;
        }
        JobRole other = (JobRole) object;
        if ((this.jobID == null && other.jobID != null) || (this.jobID != null && !this.jobID.equals(other.jobID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.JobRole[ jobID=" + jobID + " ]";
    }
    
}
