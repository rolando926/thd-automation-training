package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Interfaces_Exceptions_Deployments.Day3;

/**
 * Created by rrolando on 11/30/16.
 */
public class SubClass implements InterfaceClass {

    private int intValue;
    private double doubleValue;
    private String stringValue;

    SubClass(){
        printMessage();
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void printInteger(){
        System.out.println("The integer is: "+this.intValue);
    }

    public void printDouble(){
        System.out.println("The double is: "+this.doubleValue);
    }

    public void printString(){
        System.out.println("The String is: "+this.stringValue);
    }


}
