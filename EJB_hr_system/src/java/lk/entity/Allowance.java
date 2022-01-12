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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Entity
@Table(name = "allowance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Allowance.findAll", query = "SELECT a FROM Allowance a")
    , @NamedQuery(name = "Allowance.findByAlID", query = "SELECT a FROM Allowance a WHERE a.alID = :alID")
    , @NamedQuery(name = "Allowance.findByDate", query = "SELECT a FROM Allowance a WHERE a.date = :date")
    , @NamedQuery(name = "Allowance.findByDec", query = "SELECT a FROM Allowance a WHERE a.dec = :dec")
    , @NamedQuery(name = "Allowance.findByAmount", query = "SELECT a FROM Allowance a WHERE a.amount = :amount")
    , @NamedQuery(name = "Allowance.findByStatus", query = "SELECT a FROM Allowance a WHERE a.status = :status")
    , @NamedQuery(name = "Allowance.findByEmpID", query = "SELECT a FROM Allowance a WHERE a.empID = :empID")})
public class Allowance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "alID")
    private Integer alID;
    @Size(max = 45)
    @Column(name = "date")
    private String date;
    @Size(max = 45)
    @Column(name = "dec")
    private String dec;
    @Size(max = 45)
    @Column(name = "amount")
    private String amount;
    @Size(max = 45)
    @Column(name = "status")
    private String status;
    @Column(name = "empID")
    private Integer empID;

    public Allowance() {
    }

    public Allowance(Integer alID) {
        this.alID = alID;
    }

    public Integer getAlID() {
        return alID;
    }

    public void setAlID(Integer alID) {
        this.alID = alID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getEmpID() {
        return empID;
    }

    public void setEmpID(Integer empID) {
        this.empID = empID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (alID != null ? alID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Allowance)) {
            return false;
        }
        Allowance other = (Allowance) object;
        if ((this.alID == null && other.alID != null) || (this.alID != null && !this.alID.equals(other.alID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Allowance[ alID=" + alID + " ]";
    }
    
}
