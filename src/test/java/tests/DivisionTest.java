package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionTest extends BaseTest {

    @Test(priority = 2)
    public void divTest1(){
        System.out.println("DivisionTest1");
        Assert.assertEquals(calc.division(12,2),6);
    }
    @Test(priority = 1)
    public void divTest2(){
        System.out.println("DivisionTest2");
        Assert.assertEquals(calc.division(15,3),5);
    }
}
