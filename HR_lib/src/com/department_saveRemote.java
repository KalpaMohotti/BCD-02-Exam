/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Remote
public interface department_saveRemote {

    void save_data(Department parameter);

    List<Department> view_all();

    void deleteData(String id,String tittle);

    List<Department> getid_value(String id);

    
    
}
