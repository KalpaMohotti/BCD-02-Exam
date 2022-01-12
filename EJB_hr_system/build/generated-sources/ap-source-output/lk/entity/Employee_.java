package lk.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lk.entity.Allowance;
import lk.entity.Bank;
import lk.entity.Insurance;
import lk.entity.JobRole;
import lk.entity.Leave;
import lk.entity.Login;
import lk.entity.PerformanceAndFeedback;
import lk.entity.Salary;
import lk.entity.Shifts;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-06-30T00:21:49")
@StaticMetamodel(Employee.class)
public class Employee_ { 

    public static volatile SingularAttribute<Employee, Integer> empID;
    public static volatile SingularAttribute<Employee, String> fname;
    public static volatile SingularAttribute<Employee, String> address3;
    public static volatile SingularAttribute<Employee, String> address2;
    public static volatile CollectionAttribute<Employee, Bank> bankCollection;
    public static volatile SingularAttribute<Employee, String> address1;
    public static volatile SingularAttribute<Employee, String> sex;
    public static volatile SingularAttribute<Employee, String> mname;
    public static volatile SingularAttribute<Employee, String> url;
    public static volatile CollectionAttribute<Employee, Leave> leaveCollection;
    public static volatile SingularAttribute<Employee, String> lname;
    public static volatile SingularAttribute<Employee, Integer> leaveCount;
    public static volatile CollectionAttribute<Employee, Insurance> insuranceCollection;
    public static volatile CollectionAttribute<Employee, JobRole> jobRoleCollection;
    public static volatile CollectionAttribute<Employee, Salary> salaryCollection;
    public static volatile SingularAttribute<Employee, String> dob;
    public static volatile SingularAttribute<Employee, String> basicSalary;
    public static volatile CollectionAttribute<Employee, Shifts> shiftsCollection;
    public static volatile SingularAttribute<Employee, String> tel;
    public static volatile CollectionAttribute<Employee, Allowance> allowanceCollection;
    public static volatile CollectionAttribute<Employee, PerformanceAndFeedback> performanceAndFeedbackCollection;
    public static volatile CollectionAttribute<Employee, Login> loginCollection;
    public static volatile SingularAttribute<Employee, String> email;

}