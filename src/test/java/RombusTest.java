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
        double actualData = this.rombusz.calcArea(20,60.0);
        double expected = 0;
        Assert.assertEquals(actualData, expected, 0.1, "Hiba! Rossz végeredmény!");
    }
    @Test
    public void calc2(){
        double actualData2 = this.rombusz.calcArea(20,60.0);
        double expected2 = 20.9;
        Assert.assertEquals(actualData2, expected2, 0.1, "Hiba! Rossz végeredmény!");
    }

    // @Test
    // public void calc3(){

    // }
}
