package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTest extends BaseTest{

    @Test(dataProvider="sum")
    public void sumTest(double firstNumber, double secondNumber, double expectedResalt){
        System.out.println("SumTest");
        System.out.println(calc.sum(firstNumber,secondNumber));
        Assert.assertEquals(calc.sum(firstNumber,secondNumber),expectedResalt);
    }

    @DataProvider
    public Object[][] sum() {
        return new Object[][]{
                {2, 3, 5},
                {1, 3, 4},
                {10, 15, 25}
        };
    }

}
