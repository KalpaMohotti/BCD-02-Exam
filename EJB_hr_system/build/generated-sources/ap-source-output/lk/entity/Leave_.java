package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;
import lk.entity.LeaveType;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Leave.class)
public class Leave_ { 

    public static volatile SingularAttribute<Leave, String> date;
    public static volatile SingularAttribute<Leave, LeaveType> ltId;
    public static volatile SingularAttribute<Leave, Employee> empID;
    public static volatile SingularAttribute<Leave, String> resion;
    public static volatile SingularAttribute<Leave, Integer> lID;
    public static volatile SingularAttribute<Leave, String> paid;
    public static volatile SingularAttribute<Leave, String> time;
    public static volatile SingularAttribute<Leave, String> state;

}