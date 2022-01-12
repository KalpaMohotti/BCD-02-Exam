/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.entity;

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
@Entity
@Table(name = "insurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Insurance.findAll", query = "SELECT i FROM Insurance i")
    , @NamedQuery(name = "Insurance.findByIID", query = "SELECT i FROM Insurance i WHERE i.iID = :iID")
    , @NamedQuery(name = "Insurance.findByCompany", query = "SELECT i FROM Insurance i WHERE i.company = :company")
    , @NamedQuery(name = "Insurance.findByInsuranceId", query = "SELECT i FROM Insurance i WHERE i.insuranceId = :insuranceId")
    , @NamedQuery(name = "Insurance.findByInsuranceType", query = "SELECT i FROM Insurance i WHERE i.insuranceType = :insuranceType")
    , @NamedQuery(name = "Insurance.findByMonthlyPayment", query = "SELECT i FROM Insurance i WHERE i.monthlyPayment = :monthlyPayment")})
public class Insurance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iID")
    private Integer iID;
    @Size(max = 45)
    @Column(name = "company")
    private String company;
    @Size(max = 45)
    @Column(name = "insurance_id")
    private String insuranceId;
    @Size(max = 45)
    @Column(name = "insurance_type")
    private String insuranceType;
    @Size(max = 45)
    @Column(name = "monthly_payment")
    private String monthlyPayment;
    @JoinColumn(name = "empID", referencedColumnName = "empID")
    @ManyToOne
    private Employee empID;

    public Insurance() {
    }

    public Insurance(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public Employee getEmpID() {
        return empID;
    }

    public void setEmpID(Employee empID) {
        this.empID = empID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iID != null ? iID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Insurance)) {
            return false;
        }
        Insurance other = (Insurance) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Insurance[ iID=" + iID + " ]";
    }
    
}
