package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Employee> empID;
    public static volatile SingularAttribute<Login, String> password;
    public static volatile SingularAttribute<Login, Integer> logID;
    public static volatile SingularAttribute<Login, String> userName;
    public static volatile SingularAttribute<Login, String> status;

}