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
@Table(name = "over_timerules")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OverTimerules.findAll", query = "SELECT o FROM OverTimerules o")
    , @NamedQuery(name = "OverTimerules.findByOtID", query = "SELECT o FROM OverTimerules o WHERE o.otID = :otID")
    , @NamedQuery(name = "OverTimerules.findByDisc", query = "SELECT o FROM OverTimerules o WHERE o.disc = :disc")
    , @NamedQuery(name = "OverTimerules.findByNormalHour", query = "SELECT o FROM OverTimerules o WHERE o.normalHour = :normalHour")
    , @NamedQuery(name = "OverTimerules.findByOverTimeHour", query = "SELECT o FROM OverTimerules o WHERE o.overTimeHour = :overTimeHour")})
public class OverTimerules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ot_ID")
    private Integer otID;
    @Size(max = 255)
    @Column(name = "disc")
    private String disc;
    @Size(max = 255)
    @Column(name = "normal_hour")
    private String normalHour;
    @Size(max = 255)
    @Column(name = "over_time_hour")
    private String overTimeHour;
    @JoinColumn(name = "jobID", referencedColumnName = "jobID")
    @ManyToOne
    private JobRole jobID;

    public OverTimerules() {
    }

    public OverTimerules(Integer otID) {
        this.otID = otID;
    }

    public Integer getOtID() {
        return otID;
    }

    public void setOtID(Integer otID) {
        this.otID = otID;
    }

    public String getDisc() {
        return disc;
    }

    public void setDisc(String disc) {
        this.disc = disc;
    }

    public String getNormalHour() {
        return normalHour;
    }

    public void setNormalHour(String normalHour) {
        this.normalHour = normalHour;
    }

    public String getOverTimeHour() {
        return overTimeHour;
    }

    public void setOverTimeHour(String overTimeHour) {
        this.overTimeHour = overTimeHour;
    }

    public JobRole getJobID() {
        return jobID;
    }

    public void setJobID(JobRole jobID) {
        this.jobID = jobID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (otID != null ? otID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OverTimerules)) {
            return false;
        }
        OverTimerules other = (OverTimerules) object;
        if ((this.otID == null && other.otID != null) || (this.otID != null && !this.otID.equals(other.otID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.OverTimerules[ otID=" + otID + " ]";
    }
    
}
