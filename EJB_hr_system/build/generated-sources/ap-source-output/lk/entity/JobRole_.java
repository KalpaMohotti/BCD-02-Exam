package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Department;
import lk.entity.Employee;
import lk.entity.OverTimerules;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(JobRole.class)
public class JobRole_ { 

    public static volatile SingularAttribute<JobRole, Integer> jobID;
    public static volatile SingularAttribute<JobRole, Department> dpartmentID;
    public static volatile SingularAttribute<JobRole, String> leaveCount;
    public static volatile CollectionAttribute<JobRole, OverTimerules> overTimerulesCollection;
    public static volatile CollectionAttribute<JobRole, Employee> employeeCollection;
    public static volatile SingularAttribute<JobRole, String> salary;
    public static volatile SingularAttribute<JobRole, String> tittle;

}