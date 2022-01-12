package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.BankingDetails;
import lk.entity.Employee;
import lk.entity.InsuranceDetails;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Salary.class)
public class Salary_ { 

    public static volatile SingularAttribute<Salary, Employee> empID;
    public static volatile SingularAttribute<Salary, String> totalAllowance;
    public static volatile CollectionAttribute<Salary, InsuranceDetails> insuranceDetailsCollection;
    public static volatile SingularAttribute<Salary, String> month;
    public static volatile SingularAttribute<Salary, String> salary;
    public static volatile SingularAttribute<Salary, Integer> salaryID;
    public static volatile CollectionAttribute<Salary, BankingDetails> bankingDetailsCollection;

}