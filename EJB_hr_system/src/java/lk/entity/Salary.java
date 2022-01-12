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
@Table(name = "salary")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salary.findAll", query = "SELECT s FROM Salary s")
    , @NamedQuery(name = "Salary.findBySalaryID", query = "SELECT s FROM Salary s WHERE s.salaryID = :salaryID")
    , @NamedQuery(name = "Salary.findByMonth", query = "SELECT s FROM Salary s WHERE s.month = :month")
    , @NamedQuery(name = "Salary.findBySalary", query = "SELECT s FROM Salary s WHERE s.salary = :salary")
    , @NamedQuery(name = "Salary.findByTotalAllowance", query = "SELECT s FROM Salary s WHERE s.totalAllowance = :totalAllowance")})
public class Salary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "salaryID")
    private Integer salaryID;
    @Size(max = 45)
    @Column(name = "month")
    private String month;
    @Size(max = 45)
    @Column(name = "salary")
    private String salary;
    @Size(max = 45)
    @Column(name = "total_allowance")
    private String totalAllowance;
    @OneToMany(mappedBy = "salaryID")
    private Collection<BankingDetails> bankingDetailsCollection;
    @JoinColumn(name = "empID", referencedColumnName = "empID")
    @ManyToOne
    private Employee empID;
    @OneToMany(mappedBy = "salaryID")
    private Collection<InsuranceDetails> insuranceDetailsCollection;

    public Salary() {
    }

    public Salary(Integer salaryID) {
        this.salaryID = salaryID;
    }

    public Integer getSalaryID() {
        return salaryID;
    }

    public void setSalaryID(Integer salaryID) {
        this.salaryID = salaryID;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTotalAllowance() {
        return totalAllowance;
    }

    public void setTotalAllowance(String totalAllowance) {
        this.totalAllowance = totalAllowance;
    }

    @XmlTransient
    public Collection<BankingDetails> getBankingDetailsCollection() {
        return bankingDetailsCollection;
    }

    public void setBankingDetailsCollection(Collection<BankingDetails> bankingDetailsCollection) {
        this.bankingDetailsCollection = bankingDetailsCollection;
    }

    public Employee getEmpID() {
        return empID;
    }

    public void setEmpID(Employee empID) {
        this.empID = empID;
    }

    @XmlTransient
    public Collection<InsuranceDetails> getInsuranceDetailsCollection() {
        return insuranceDetailsCollection;
    }

    public void setInsuranceDetailsCollection(Collection<InsuranceDetails> insuranceDetailsCollection) {
        this.insuranceDetailsCollection = insuranceDetailsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salaryID != null ? salaryID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salary)) {
            return false;
        }
        Salary other = (Salary) object;
        if ((this.salaryID == null && other.salaryID != null) || (this.salaryID != null && !this.salaryID.equals(other.salaryID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Salary[ salaryID=" + salaryID + " ]";
    }
    
}
