package lan.zold;


import java.lang.Math;

public class Rombusz {

    public double TrycalcArea(double side, double alpha){
         return Math.pow(side,2)*Math.sin(alpha*(Math.PI/180));
    }
}
