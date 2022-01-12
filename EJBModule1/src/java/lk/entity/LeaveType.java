/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "leave_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LeaveType.findAll", query = "SELECT l FROM LeaveType l")
    , @NamedQuery(name = "LeaveType.findByLtId", query = "SELECT l FROM LeaveType l WHERE l.ltId = :ltId")
    , @NamedQuery(name = "LeaveType.findByLeaveType", query = "SELECT l FROM LeaveType l WHERE l.leaveType = :leaveType")})
public class LeaveType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lt_id")
    private Integer ltId;
    @Size(max = 45)
    @Column(name = "leave_type")
    private String leaveType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ltId")
    private Collection<Leave> leaveCollection;

    public LeaveType() {
    }

    public LeaveType(Integer ltId) {
        this.ltId = ltId;
    }

    public Integer getLtId() {
        return ltId;
    }

    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    @XmlTransient
    public Collection<Leave> getLeaveCollection() {
        return leaveCollection;
    }

    public void setLeaveCollection(Collection<Leave> leaveCollection) {
        this.leaveCollection = leaveCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ltId != null ? ltId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeaveType)) {
            return false;
        }
        LeaveType other = (LeaveType) object;
        if ((this.ltId == null && other.ltId != null) || (this.ltId != null && !this.ltId.equals(other.ltId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.LeaveType[ ltId=" + ltId + " ]";
    }
    
}
