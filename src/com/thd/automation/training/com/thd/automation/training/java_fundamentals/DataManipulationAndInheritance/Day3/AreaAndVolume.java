package com.thd.automation.training.com.thd.automation.training.java_fundamentals.DataManipulationAndInheritance.Day3;

/**
 * Created by rrolando on 11/17/16.
 */
public abstract class AreaAndVolume {
    public abstract void area(String type);
    //public abstract void volume(String type);

    public int randomNumber(int limit){
        int number;
        do{
            number = (int) (Math.random() * limit);
        }while(number < 1);
        return number;
    }
}
