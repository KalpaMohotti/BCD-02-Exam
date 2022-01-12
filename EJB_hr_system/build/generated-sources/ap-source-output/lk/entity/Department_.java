package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.JobRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Department.class)
public class Department_ { 

    public static volatile SingularAttribute<Department, Integer> dpartmentID;
    public static volatile CollectionAttribute<Department, JobRole> jobRoleCollection;
    public static volatile SingularAttribute<Department, String> title;

}