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
@Table(name = "department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d")
    , @NamedQuery(name = "Department.findByDpartmentID", query = "SELECT d FROM Department d WHERE d.dpartmentID = :dpartmentID")
    , @NamedQuery(name = "Department.findByTitle", query = "SELECT d FROM Department d WHERE d.title = :title")})
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dpartmentID")
    private Integer dpartmentID;
    @Size(max = 45)
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "dpartmentID")
    private Collection<JobRole> jobRoleCollection;

    public Department() {
    }

    public Department(Integer dpartmentID) {
        this.dpartmentID = dpartmentID;
    }

    public Integer getDpartmentID() {
        return dpartmentID;
    }

    public void setDpartmentID(Integer dpartmentID) {
        this.dpartmentID = dpartmentID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlTransient
    public Collection<JobRole> getJobRoleCollection() {
        return jobRoleCollection;
    }

    public void setJobRoleCollection(Collection<JobRole> jobRoleCollection) {
        this.jobRoleCollection = jobRoleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dpartmentID != null ? dpartmentID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.dpartmentID == null && other.dpartmentID != null) || (this.dpartmentID != null && !this.dpartmentID.equals(other.dpartmentID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lk.entity.Department[ dpartmentID=" + dpartmentID + " ]";
    }
    
}
