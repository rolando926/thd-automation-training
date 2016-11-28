package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/3/16.
 */
public class Get_Set_Class {

    int x=1;

    public int getX(){
        return x;
    }

    public void setX(int x){
        if (x < 10) {
            this.x = x;
        }
    }
}
