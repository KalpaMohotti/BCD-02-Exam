package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Employee;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Bank.class)
public class Bank_ { 

    public static volatile SingularAttribute<Bank, String> bankNumber;
    public static volatile SingularAttribute<Bank, Employee> empID;
    public static volatile SingularAttribute<Bank, Integer> bankID;
    public static volatile SingularAttribute<Bank, String> holderName;
    public static volatile SingularAttribute<Bank, String> bankName;
    public static volatile SingularAttribute<Bank, String> payment;
    public static volatile SingularAttribute<Bank, String> status;

}