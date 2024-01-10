package lan.zold;

import java.lang.Math;

public class Rombusz {
    public double calcArea(double side, double alpha){
        return Math.pow(side,2)*Math.sin(Math.toRadians(alpha));
    }
}
