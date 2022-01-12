/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

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

public class LeaveType implements Serializable {

    private static long serialVersionUID = 1L;
    
    private Integer ltId;

    private String leaveType;
  
    private Collection<Leave> leaveCollection;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the ltId
     */
    public Integer getLtId() {
        return ltId;
    }

    /**
     * @param ltId the ltId to set
     */
    public void setLtId(Integer ltId) {
        this.ltId = ltId;
    }

    /**
     * @return the leaveType
     */
    public String getLeaveType() {
        return leaveType;
    }

    /**
     * @param leaveType the leaveType to set
     */
    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    /**
     * @return the leaveCollection
     */
    public Collection<Leave> getLeaveCollection() {
        return leaveCollection;
    }

    /**
     * @param leaveCollection the leaveCollection to set
     */
    public void setLeaveCollection(Collection<Leave> leaveCollection) {
        this.leaveCollection = leaveCollection;
    }

  
    
}
