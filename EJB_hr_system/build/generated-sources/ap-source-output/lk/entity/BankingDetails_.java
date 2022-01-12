package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Salary;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(BankingDetails.class)
public class BankingDetails_ { 

    public static volatile SingularAttribute<BankingDetails, Integer> bdID;
    public static volatile SingularAttribute<BankingDetails, String> accNumber;
    public static volatile SingularAttribute<BankingDetails, String> accountName;
    public static volatile SingularAttribute<BankingDetails, String> bankName;
    public static volatile SingularAttribute<BankingDetails, String> payment;
    public static volatile SingularAttribute<BankingDetails, Salary> salaryID;

}