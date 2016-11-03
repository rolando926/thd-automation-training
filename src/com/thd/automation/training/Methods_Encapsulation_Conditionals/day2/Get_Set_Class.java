package com.thd.automation.training.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/3/16.
 */
public class Get_Set_Class {

    private int x=1;

    public int getX(){
        return x;
    }

    public void setX(int x){
        if (x < 10) {
            this.x = x;
        }
    }
}
