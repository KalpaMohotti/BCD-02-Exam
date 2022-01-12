package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Allowance.class)
public class Allowance_ { 

    public static volatile SingularAttribute<Allowance, String> date;
    public static volatile SingularAttribute<Allowance, Employee> empID;
    public static volatile SingularAttribute<Allowance, String> amount;
    public static volatile SingularAttribute<Allowance, String> dec;
    public static volatile SingularAttribute<Allowance, Integer> alID;
    public static volatile SingularAttribute<Allowance, String> status;

}