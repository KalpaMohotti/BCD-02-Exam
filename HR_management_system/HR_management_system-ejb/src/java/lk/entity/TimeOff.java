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
@Table(name = "time_off")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeOff.findAll", query = "SELECT t FROM TimeOff t")
    , @NamedQuery(name = "TimeOff.findByToID", query = "SELECT t FROM TimeOff t WHERE t.toID = :toID")
    , @NamedQuery(name = "TimeOff.findByDate", query = "SELECT t FROM TimeOff t WHERE t.date = :date")
    , @NamedQuery(name = "TimeOff.findByRequestTime", query = "SELECT t FROM TimeOff t WHERE t.requestTime = :requestTime")
    , @NamedQuery(name = "TimeOff.findByResion", query = "SELECT t FROM TimeOff t WHERE t.resion = :resion")
    , @NamedQuery(name = "TimeOff.findByStatus", query = "SELECT t FROM TimeOff t WHERE t.status = :status")
    , @NamedQuery(name = "TimeOff.findByWorkingHours", query = "SELECT t FROM TimeOff t WHERE t.workingHours = :workingHours")})
public class TimeOff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "toID")
    private Integer toID;
    @Size(max = 255)
    @Column(name = "date")
    private String date;
    @Size(max = 255)
    @Column(name = "request_time")
    private String requestTime;
    @Size(max = 255)
    @Column(name = "resion")
    private String resion;
    @Size(max = 255)
    @Column(name = "status")
    private String status;
    @Size(max = 255)
    @Column(name = "working_hours")
    private String workingHours;
    @JoinColumn(name = "shifts_ID", referencedColumnName = "shifts_ID")
    @ManyToOne
    private Shifts shiftsID;

    public TimeOff() {
    }

    public TimeOff(Integer toID) {
        this.toID = toID;
    }

    public Integer getToID() {
        return toID;
    }

    public void setToID(Integer toID) {
        this.toID = toID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getResion() {
        return resion;
    }

    public void setResion(String resion) {
        this.resion = resion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    public Shifts getShiftsID() {
        return shiftsID;
    }

    public void setShiftsID(Shifts shiftsID) {
        this.shiftsID = shiftsID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (toID != null ? toID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeOff)) {
            return false;
        }
        TimeOff other = (TimeOff) object;
        if ((this.toID == null && other.toID != null) || (this.toID != null && !this.toID.equals(other.toID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.TimeOff[ toID=" + toID + " ]";
    }
    
}
