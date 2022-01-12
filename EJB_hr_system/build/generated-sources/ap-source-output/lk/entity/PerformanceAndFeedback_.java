package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(PerformanceAndFeedback.class)
public class PerformanceAndFeedback_ { 

    public static volatile SingularAttribute<PerformanceAndFeedback, String> feedback;
    public static volatile SingularAttribute<PerformanceAndFeedback, String> date;
    public static volatile SingularAttribute<PerformanceAndFeedback, Employee> empID;
    public static volatile SingularAttribute<PerformanceAndFeedback, String> performance;
    public static volatile SingularAttribute<PerformanceAndFeedback, Integer> pfID;
    public static volatile SingularAttribute<PerformanceAndFeedback, String> decipline;

}