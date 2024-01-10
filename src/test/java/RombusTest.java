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
    public void calc(){}
    @Test
    public void calc2(){}
}
