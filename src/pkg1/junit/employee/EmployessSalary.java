package pkg1.junit.employee;

public class EmployessSalary {

    public double yearlySalary(EmployeeDetails employeeDetails){
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getSalary() * 12;
        return yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails){
        double appraisal = 0;

        if(employeeDetails.getSalary() < 10000)
            appraisal = 500;
        else
            appraisal = 1000;

        return appraisal;
    }
}
