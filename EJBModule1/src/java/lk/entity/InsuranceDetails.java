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
@Table(name = "insurance_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "InsuranceDetails.findAll", query = "SELECT i FROM InsuranceDetails i")
    , @NamedQuery(name = "InsuranceDetails.findByIID", query = "SELECT i FROM InsuranceDetails i WHERE i.iID = :iID")
    , @NamedQuery(name = "InsuranceDetails.findByInsuranceId", query = "SELECT i FROM InsuranceDetails i WHERE i.insuranceId = :insuranceId")
    , @NamedQuery(name = "InsuranceDetails.findByMonth", query = "SELECT i FROM InsuranceDetails i WHERE i.month = :month")
    , @NamedQuery(name = "InsuranceDetails.findByPayment", query = "SELECT i FROM InsuranceDetails i WHERE i.payment = :payment")})
public class InsuranceDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "i_ID")
    private Integer iID;
    @Size(max = 255)
    @Column(name = "insurance_id")
    private String insuranceId;
    @Size(max = 255)
    @Column(name = "month")
    private String month;
    @Size(max = 255)
    @Column(name = "payment")
    private String payment;
    @JoinColumn(name = "salaryID", referencedColumnName = "salaryID")
    @ManyToOne
    private Salary salaryID;

    public InsuranceDetails() {
    }

    public InsuranceDetails(Integer iID) {
        this.iID = iID;
    }

    public Integer getIID() {
        return iID;
    }

    public void setIID(Integer iID) {
        this.iID = iID;
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Salary getSalaryID() {
        return salaryID;
    }

    public void setSalaryID(Salary salaryID) {
        this.salaryID = salaryID;
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
        if (!(object instanceof InsuranceDetails)) {
            return false;
        }
        InsuranceDetails other = (InsuranceDetails) object;
        if ((this.iID == null && other.iID != null) || (this.iID != null && !this.iID.equals(other.iID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.InsuranceDetails[ iID=" + iID + " ]";
    }
    
}
