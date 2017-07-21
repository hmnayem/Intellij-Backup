package pkg1.junit;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class TestJUnit2 extends TestCase{

    protected double val1;
    protected double val2;

    @Before
    public void setup(){
        val1 = 2.0;
        val2 = 3.0;
    }

    @Test
    public void testAdd(){
        System.out.println("No of Testcases = " + this.countTestCases());

        String name = this.getName();
        System.out.println("Testcase name = " + name);

        this.setName("TestNewAdd");
        String newName = this.getName();
        System.out.println("Updated Testcase name = " + newName);
    }

    public void tearDown(  ){

    }
}
