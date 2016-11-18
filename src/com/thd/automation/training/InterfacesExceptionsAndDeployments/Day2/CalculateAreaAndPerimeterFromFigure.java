package com.thd.automation.training.InterfacesExceptionsAndDeployments.Day2;

/**
 * Created by rrolando on 11/17/16.
 */
public class CalculateAreaAndPerimeterFromFigure {
    public static void main(String[] args) {

        Calculate calc = new Calculate();

        calc.setLength(11);
        calc.area("square");
        calc.area("triangle");
        calc.area("circle");
        calc.area("cube");


    }
}
