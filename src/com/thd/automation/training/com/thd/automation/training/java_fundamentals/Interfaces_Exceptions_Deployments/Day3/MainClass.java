package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Interfaces_Exceptions_Deployments.Day3;

/**
 * Created by rrolando on 11/30/16.
 */
public class MainClass {
    public static void main(String[] args) {
        SubClass myClass = new SubClass();

        myClass.setIntValue(3);
        myClass.printInteger();

        myClass.setDoubleValue(11.4);
        myClass.printDouble();

        myClass.setStringValue("This is a string!");
        myClass.printString();
    }
}
