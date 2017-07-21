package pkg1.junit;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args){
        Result res = JUnitCore.runClasses(TestJUnit.class);

        for(Failure f: res.getFailures()){
            System.out.println(f.toString());
        }
        System.out.println(res.wasSuccessful());
    }
}

class TestJUnit{

    @Test
    public void testAdd(){
        int num = 5;
        String temp = null;
        String str = "JUnit is working fine";

        Assert.assertEquals(num, 5);
    }
}