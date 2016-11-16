package com.thd.automation.training.DataManipulationAndInheritance.Day2;

/**
 * Created by rrolando on 11/15/16.
 */
public class SequentialExtesion {
    public static void main(String[] args) {
        customer cust = new customer();

        cust.methodA();
        cust.getMethodASuper();
        cust.getMethodAFromSuper();
        cust.methodB();
        cust.methodC();
    }
}
