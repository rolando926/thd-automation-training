package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/2/16.
 */
public class OverloadingMethod {

    public static void main(String[] args) {
        int x = 1;
        double y = 1.1;

        SumOverloading mySum = new SumOverloading();

        mySum.sum(2,3);
        mySum.sum(1.1,2.2);
        mySum.sum(1.1,1);

        mySum.sum(1,1.1);

        mySum.sum(x,y);
    }
}
