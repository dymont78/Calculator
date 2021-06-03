package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DifferenceTest extends BaseTest{

    @Test
    public void diffTest(){
        System.out.println("DifferenceTest");
        System.out.println(calc.difference(2,3));
        Assert.assertEquals(calc.difference(2,3),-1);
    }

}
