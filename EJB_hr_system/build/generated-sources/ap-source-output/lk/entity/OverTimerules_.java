package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.JobRole;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(OverTimerules.class)
public class OverTimerules_ { 

    public static volatile SingularAttribute<OverTimerules, JobRole> jobID;
    public static volatile SingularAttribute<OverTimerules, String> overTimeHour;
    public static volatile SingularAttribute<OverTimerules, Integer> otID;
    public static volatile SingularAttribute<OverTimerules, String> normalHour;
    public static volatile SingularAttribute<OverTimerules, String> disc;

}