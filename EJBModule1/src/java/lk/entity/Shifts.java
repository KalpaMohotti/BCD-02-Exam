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
@Table(name = "shifts")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Shifts.findAll", query = "SELECT s FROM Shifts s")
    , @NamedQuery(name = "Shifts.findByShiftsID", query = "SELECT s FROM Shifts s WHERE s.shiftsID = :shiftsID")
    , @NamedQuery(name = "Shifts.findByDate", query = "SELECT s FROM Shifts s WHERE s.date = :date")
    , @NamedQuery(name = "Shifts.findByEndTime", query = "SELECT s FROM Shifts s WHERE s.endTime = :endTime")
    , @NamedQuery(name = "Shifts.findByOverTime", query = "SELECT s FROM Shifts s WHERE s.overTime = :overTime")
    , @NamedQuery(name = "Shifts.findByStartTime", query = "SELECT s FROM Shifts s WHERE s.startTime = :startTime")
    , @NamedQuery(name = "Shifts.findByStatus", query = "SELECT s FROM Shifts s WHERE s.status = :status")
    , @NamedQuery(name = "Shifts.findByWorkHours", query = "SELECT s FROM Shifts s WHERE s.workHours = :workHours")})
public class Shifts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shifts_ID")
    private Integer shiftsID;
    @Size(max = 255)
    @Column(name = "date")
    private String date;
    @Size(max = 255)
    @Column(name = "end_time")
    private String endTime;
    @Size(max = 255)
    @Column(name = "over_time")
    private String overTime;
    @Size(max = 255)
    @Column(name = "start_time")
    private String startTime;
    @Size(max = 255)
    @Column(name = "status")
    private String status;
    @Size(max = 255)
    @Column(name = "work_hours")
    private String workHours;
    @OneToMany(mappedBy = "shiftsID")
    private Collection<TimeOff> timeOffCollection;
    @JoinColumn(name = "empID", referencedColumnName = "empID")
    @ManyToOne
    private Employee empID;

    public Shifts() {
    }

    public Shifts(Integer shiftsID) {
        this.shiftsID = shiftsID;
    }

    public Integer getShiftsID() {
        return shiftsID;
    }

    public void setShiftsID(Integer shiftsID) {
        this.shiftsID = shiftsID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    @XmlTransient
    public Collection<TimeOff> getTimeOffCollection() {
        return timeOffCollection;
    }

    public void setTimeOffCollection(Collection<TimeOff> timeOffCollection) {
        this.timeOffCollection = timeOffCollection;
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
        hash += (shiftsID != null ? shiftsID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Shifts)) {
            return false;
        }
        Shifts other = (Shifts) object;
        if ((this.shiftsID == null && other.shiftsID != null) || (this.shiftsID != null && !this.shiftsID.equals(other.shiftsID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Shifts[ shiftsID=" + shiftsID + " ]";
    }
    
}
