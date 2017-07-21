package pkg1.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestAssertion {

    @Test
    public void testAssertion(){
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = null;
        String s4 = "abc";
        String s5 = "abc";

        int v1 = 5;
        int v2 = 6;

        Assert.assertEquals(s1, s2);
        Assert.assertTrue(v1<v2);
        Assert.assertFalse(v1>v2);
        Assert.assertNotNull(s1);
        Assert.assertNull(s3);
        Assert.assertSame(s4,s5);
        Assert.assertNotSame(s1, s3);

    }
}
