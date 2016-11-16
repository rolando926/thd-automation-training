package com.thd.automation.training.DataManipulationAndInheritance.Day2;

/**
 * Created by rrolando on 11/15/16.
 */
public class shirt extends store {

    public void methodA(){
        //super.methodA();
        System.out.println("Shirt Class - Method A");

    }

    public void methodB(){
        System.out.println("Shirt Class - Method B");
    }

    public void getMethodAStoreSuper(){
        super.methodA();
    }
}
