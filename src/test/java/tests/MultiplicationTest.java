package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationTest extends BaseTest{

    @Test(description = "Умножение")
    public void multTest(){
        System.out.println("MultiplicationTest");
        System.out.println(calc.multiplication(2,3));
        Assert.assertEquals(calc.multiplication(2,3),6);
    }
}
