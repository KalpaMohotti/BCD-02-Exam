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
@Table(name = "banking_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BankingDetails.findAll", query = "SELECT b FROM BankingDetails b")
    , @NamedQuery(name = "BankingDetails.findByBdID", query = "SELECT b FROM BankingDetails b WHERE b.bdID = :bdID")
    , @NamedQuery(name = "BankingDetails.findByAccNumber", query = "SELECT b FROM BankingDetails b WHERE b.accNumber = :accNumber")
    , @NamedQuery(name = "BankingDetails.findByAccountName", query = "SELECT b FROM BankingDetails b WHERE b.accountName = :accountName")
    , @NamedQuery(name = "BankingDetails.findByBankName", query = "SELECT b FROM BankingDetails b WHERE b.bankName = :bankName")
    , @NamedQuery(name = "BankingDetails.findByPayment", query = "SELECT b FROM BankingDetails b WHERE b.payment = :payment")})
public class BankingDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bd_ID")
    private Integer bdID;
    @Size(max = 255)
    @Column(name = "acc_number")
    private String accNumber;
    @Size(max = 255)
    @Column(name = "account_name")
    private String accountName;
    @Size(max = 255)
    @Column(name = "bank_name")
    private String bankName;
    @Size(max = 255)
    @Column(name = "payment")
    private String payment;
    @JoinColumn(name = "salaryID", referencedColumnName = "salaryID")
    @ManyToOne
    private Salary salaryID;

    public BankingDetails() {
    }

    public BankingDetails(Integer bdID) {
        this.bdID = bdID;
    }

    public Integer getBdID() {
        return bdID;
    }

    public void setBdID(Integer bdID) {
        this.bdID = bdID;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
        hash += (bdID != null ? bdID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BankingDetails)) {
            return false;
        }
        BankingDetails other = (BankingDetails) object;
        if ((this.bdID == null && other.bdID != null) || (this.bdID != null && !this.bdID.equals(other.bdID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.BankingDetails[ bdID=" + bdID + " ]";
    }
    
}
