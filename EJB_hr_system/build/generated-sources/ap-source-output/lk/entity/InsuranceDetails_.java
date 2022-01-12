package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Salary;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(InsuranceDetails.class)
public class InsuranceDetails_ { 

    public static volatile SingularAttribute<InsuranceDetails, String> month;
    public static volatile SingularAttribute<InsuranceDetails, Integer> iID;
    public static volatile SingularAttribute<InsuranceDetails, String> insuranceId;
    public static volatile SingularAttribute<InsuranceDetails, String> payment;
    public static volatile SingularAttribute<InsuranceDetails, Salary> salaryID;

}