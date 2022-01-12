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
@Table(name = "performance_and_feedback")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PerformanceAndFeedback.findAll", query = "SELECT p FROM PerformanceAndFeedback p")
    , @NamedQuery(name = "PerformanceAndFeedback.findByPfID", query = "SELECT p FROM PerformanceAndFeedback p WHERE p.pfID = :pfID")
    , @NamedQuery(name = "PerformanceAndFeedback.findByDate", query = "SELECT p FROM PerformanceAndFeedback p WHERE p.date = :date")
    , @NamedQuery(name = "PerformanceAndFeedback.findByDecipline", query = "SELECT p FROM PerformanceAndFeedback p WHERE p.decipline = :decipline")
    , @NamedQuery(name = "PerformanceAndFeedback.findByFeedback", query = "SELECT p FROM PerformanceAndFeedback p WHERE p.feedback = :feedback")
    , @NamedQuery(name = "PerformanceAndFeedback.findByPerformance", query = "SELECT p FROM PerformanceAndFeedback p WHERE p.performance = :performance")})
public class PerformanceAndFeedback implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pf_ID")
    private Integer pfID;
    @Size(max = 255)
    @Column(name = "date")
    private String date;
    @Size(max = 255)
    @Column(name = "decipline")
    private String decipline;
    @Size(max = 255)
    @Column(name = "feedback")
    private String feedback;
    @Size(max = 255)
    @Column(name = "performance")
    private String performance;
    @JoinColumn(name = "empID", referencedColumnName = "empID")
    @ManyToOne
    private Employee empID;

    public PerformanceAndFeedback() {
    }

    public PerformanceAndFeedback(Integer pfID) {
        this.pfID = pfID;
    }

    public Integer getPfID() {
        return pfID;
    }

    public void setPfID(Integer pfID) {
        this.pfID = pfID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDecipline() {
        return decipline;
    }

    public void setDecipline(String decipline) {
        this.decipline = decipline;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
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
        hash += (pfID != null ? pfID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PerformanceAndFeedback)) {
            return false;
        }
        PerformanceAndFeedback other = (PerformanceAndFeedback) object;
        if ((this.pfID == null && other.pfID != null) || (this.pfID != null && !this.pfID.equals(other.pfID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.PerformanceAndFeedback[ pfID=" + pfID + " ]";
    }
    
}
