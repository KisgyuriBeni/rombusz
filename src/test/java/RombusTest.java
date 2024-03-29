import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Rombusz;

public class RombusTest {
    Rombusz rombusz;

    @BeforeTest
    public void setup(){
        this.rombusz = new Rombusz();
    }
    @Test
    public void calc(){
        double actual = this.rombusz.calcArea(20,60.0);
        double expected = 346.4;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Rossz végeredmény!");
    }
    @Test
    public void calcCircTest(){
        double actual = this.rombusz.caclCirc(20.0);
        double expected = 80.0;
        Assert.assertEquals(actual, expected, 0.1, "Hiba! Rossz végeredmény!");
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcZeroAlpha() {
        this.rombusz.calcArea(20, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testcalcCircSideZero() {
        this.rombusz.caclCirc(0);
    }
    @Test(expectedExceptions = InputMismatchException.class,
    expectedExceptionsMessageRegExp = "Hiba! Kisebb a bevitel mint 0!")
    public void testCalcAreaZeroSide() {
        this.rombusz.calcArea(0, 60.0);
    }

}
