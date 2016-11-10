package com.thd.automation.training.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/3/16.
 */
public class SumOverloading {
    public void sum(int val1, int val2){
        System.out.println("Sum Int ="+(val1+val2));
    }

    public void sum(double val1, double val2){
        System.out.println("Sum Double ="+(val1+val2));
    }

    public void sum(double val1, int val2){System.out.println("Sum Mix ="+(val1+val2));}
}
