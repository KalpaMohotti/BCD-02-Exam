/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import lk.entity.Department;

/**
 *
 * @author Kalpa Sadaruwan
 */

@Stateless
public class methods implements methodsLocal {
@PersistenceContext(unitName = "EJBModule1PU")
 EntityManager em;
    @Override
    
    public void saveDepartment(Department parameter) {
             em.persist(parameter);
        em.flush();
        System.out.println("Kalpa");
    }

   
}
