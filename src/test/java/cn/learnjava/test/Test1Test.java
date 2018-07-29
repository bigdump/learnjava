package cn.learnjava.test;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by heqi on 7/29/18.
 */
public class Test1Test {
    @Test
    public void getObject() throws Exception {
        Test1 test1 = new Test1();
        Assert.assertTrue((Boolean) test1.getObject());
    }
}
