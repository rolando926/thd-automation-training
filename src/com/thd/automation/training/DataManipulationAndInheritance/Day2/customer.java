package com.thd.automation.training.DataManipulationAndInheritance.Day2;

/**
 * Created by rrolando on 11/15/16.
 */
public class customer extends shirt{
    public void methodA(){
        System.out.println("Customer Class - Method A");


    }

    public void getMethodASuper(){
        super.methodA();
    }

    public void getMethodAFromSuper(){
        super.getMethodAStoreSuper();
    }

}
