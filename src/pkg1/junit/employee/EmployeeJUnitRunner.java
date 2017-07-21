package pkg1.junit.employee;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class EmployeeJUnitRunner {

    public static void main(String[] args){
        Result res = JUnitCore.runClasses(EmployeeJUnit.class);

        for(Failure f : res.getFailures()){
            System.out.println(f.toString());
        }

        System.out.println(res.wasSuccessful());
    }
}
