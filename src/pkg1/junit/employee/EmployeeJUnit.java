package pkg1.junit.employee;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeJUnit {

    EmployeeDetails employeeDetails = new EmployeeDetails();
    EmployessSalary employessSalary = new EmployessSalary();

    @Test
    public void testYearlySalary(){
        employeeDetails.setName("Rajeev");
        employeeDetails.setSalary(8000);
        employeeDetails.setAge(25);

        double salary = employessSalary.yearlySalary(employeeDetails);

        Assert.assertEquals(96000, salary, 0.0);
    }

    @Test
    public void testAppraisal(){
        employeeDetails.setName("Nayem");
        employeeDetails.setAge(21);
        employeeDetails.setSalary(12000);

        double appriasal = employessSalary.calculateAppraisal(employeeDetails);

        Assert.assertEquals(1000, appriasal, 0.0);
    }
}
