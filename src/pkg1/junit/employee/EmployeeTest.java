package pkg1.junit.employee;

public class EmployeeTest {

    public static void main(String[] args){
        EmployeeDetails employeeDetails = new EmployeeDetails();
        EmployessSalary employessSalary = new EmployessSalary();

        employeeDetails.setName("HM Nayem");
        employeeDetails.setSalary(25000);
        employeeDetails.setAge(21);

        System.out.println(employeeDetails.getName() + "'s Salary is : " + employessSalary.yearlySalary(employeeDetails));
        System.out.println("And his appraisal is : " + employessSalary.calculateAppraisal(employeeDetails));
    }


}
