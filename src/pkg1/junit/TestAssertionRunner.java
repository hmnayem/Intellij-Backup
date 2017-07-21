package pkg1.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import pkg1.junit.TestAssertion;

public class TestAssertionRunner {

    public static void main(String[] args){
        Result res = JUnitCore.runClasses(TestAssertion.class);

        for(Failure f : res.getFailures()){
            System.out.println(f.toString());
        }

        System.out.println(res.wasSuccessful());
    }
}
