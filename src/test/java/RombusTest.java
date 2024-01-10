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
        double actualAlpha = this.rombusz.calcArea(60.0);
        double side = this.rombusz.calcArea(20.0);
        double expected = 0;
        Assert.assertEquals(actualAlpha, expected, 0.1, "Hiba! Rossz végeredmény!");
    }

    @Test
    public void calc2(){

    }
}
