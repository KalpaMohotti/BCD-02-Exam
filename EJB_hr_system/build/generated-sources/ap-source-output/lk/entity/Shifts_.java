package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;
import lk.entity.TimeOff;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Shifts.class)
public class Shifts_ { 

    public static volatile SingularAttribute<Shifts, String> date;
    public static volatile SingularAttribute<Shifts, Employee> empID;
    public static volatile SingularAttribute<Shifts, Integer> shiftsID;
    public static volatile SingularAttribute<Shifts, String> workHours;
    public static volatile CollectionAttribute<Shifts, TimeOff> timeOffCollection;
    public static volatile SingularAttribute<Shifts, String> overTime;
    public static volatile SingularAttribute<Shifts, String> startTime;
    public static volatile SingularAttribute<Shifts, String> endTime;
    public static volatile SingularAttribute<Shifts, String> status;

}