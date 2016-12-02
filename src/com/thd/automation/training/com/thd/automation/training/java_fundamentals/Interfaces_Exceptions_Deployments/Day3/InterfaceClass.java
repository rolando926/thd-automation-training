package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Interfaces_Exceptions_Deployments.Day3;

/**
 * Created by rrolando on 11/30/16.
 */
public interface InterfaceClass {

    default void printMessage(){
        System.out.println("Initializing Interface\n----------------------\n");
    }

    void printInteger();

    void printDouble();

    void printString();
}
