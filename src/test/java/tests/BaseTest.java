package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.Calculator;

public class BaseTest {
    Calculator calc;

    @BeforeMethod
    public void startTest(){
        System.out.println("Before method");
         calc = new Calculator();

    }
    @AfterMethod
    public void endTest(){
        System.out.println("AfterMethod");
    }
}
