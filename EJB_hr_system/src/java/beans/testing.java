/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import lk.entity.Department;

/**
 *
 * @author Kalpa Sadaruwan
 */
@Singleton
@Startup
public class testing implements testingLocal {

    @EJB
    private methodsLocal methods;

    @Override
   // @PostConstruct
    public void save() {
        System.out.println("Kalpa");
        List<Department> student=new ArrayList<>();
        Department s=new Department();
        s.setTitle("Human Resource Department");
       
        student.add(s);
        methods.saveDepartment(s);
    }

   
}
