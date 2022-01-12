package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Insurance.class)
public class Insurance_ { 

    public static volatile SingularAttribute<Insurance, Employee> empID;
    public static volatile SingularAttribute<Insurance, Integer> iID;
    public static volatile SingularAttribute<Insurance, String> monthlyPayment;
    public static volatile SingularAttribute<Insurance, String> insuranceId;
    public static volatile SingularAttribute<Insurance, String> company;
    public static volatile SingularAttribute<Insurance, String> insuranceType;

}