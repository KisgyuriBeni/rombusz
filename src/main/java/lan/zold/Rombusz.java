package lan.zold;

import java.lang.Math;
import java.util.InputMismatchException;

public class Rombusz {

    public double calcArea(double side, double alpha)throws InputMismatchException{
        if(side <= 0 || alpha <= 0)throw new InputMismatchException("Hiba! Kisebb a bevitel mint 0!");
        return Math.pow(side,2)*Math.sin(alpha*(Math.PI/180));
    }
}
