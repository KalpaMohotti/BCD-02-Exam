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
@Table(name = "leave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leave.findAll", query = "SELECT l FROM Leave l")
    , @NamedQuery(name = "Leave.findByLID", query = "SELECT l FROM Leave l WHERE l.lID = :lID")
    , @NamedQuery(name = "Leave.findByDate", query = "SELECT l FROM Leave l WHERE l.date = :date")
    , @NamedQuery(name = "Leave.findByTime", query = "SELECT l FROM Leave l WHERE l.time = :time")
    , @NamedQuery(name = "Leave.findByResion", query = "SELECT l FROM Leave l WHERE l.resion = :resion")
    , @NamedQuery(name = "Leave.findByState", query = "SELECT l FROM Leave l WHERE l.state = :state")
    , @NamedQuery(name = "Leave.findByPaid", query = "SELECT l FROM Leave l WHERE l.paid = :paid")})
public class Leave implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lID")
    private Integer lID;
    @Size(max = 45)
    @Column(name = "date")
    private String date;
    @Size(max = 45)
    @Column(name = "time")
    private String time;
    @Size(max = 45)
    @Column(name = "resion")
    private String resion;
    @Size(max = 45)
    @Column(name = "state")
    private String state;
    @Size(max = 45)
    @Column(name = "paid")
    private String paid;
    @JoinColumn(name = "lt_id", referencedColumnName = "lt_id")
    @ManyToOne
    private LeaveType ltId;
    @JoinColumn(name = "empID", referencedColumnName = "empID")
    @ManyToOne
    private Employee empID;

    public Leave() {
    }

    public Leave(Integer lID) {
        this.lID = lID;
    }

    public Integer getLID() {
        return lID;
    }

    public void setLID(Integer lID) {
        this.lID = lID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResion() {
        return resion;
    }

    public void setResion(String resion) {
        this.resion = resion;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public LeaveType getLtId() {
        return ltId;
    }

    public void setLtId(LeaveType ltId) {
        this.ltId = ltId;
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
        hash += (lID != null ? lID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leave)) {
            return false;
        }
        Leave other = (Leave) object;
        if ((this.lID == null && other.lID != null) || (this.lID != null && !this.lID.equals(other.lID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Leave[ lID=" + lID + " ]";
    }
    
}
