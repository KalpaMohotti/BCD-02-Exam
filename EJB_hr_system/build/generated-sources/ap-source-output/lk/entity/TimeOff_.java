package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Shifts;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(TimeOff.class)
public class TimeOff_ { 

    public static volatile SingularAttribute<TimeOff, Integer> toID;
    public static volatile SingularAttribute<TimeOff, String> requestTime;
    public static volatile SingularAttribute<TimeOff, String> date;
    public static volatile SingularAttribute<TimeOff, Shifts> shiftsID;
    public static volatile SingularAttribute<TimeOff, String> resion;
    public static volatile SingularAttribute<TimeOff, String> workingHours;
    public static volatile SingularAttribute<TimeOff, String> status;

}