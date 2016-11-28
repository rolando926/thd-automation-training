package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day1;

/**
 * Created by rrolando on 11/1/16.
 */
public class StaticClass {
    static int x;
    int y;

    StaticClass(){
        print();
    }

    public void print(){
        int x = 3;
        int y = 3;
        increaseCounters();
        System.out.println("x="+this.x+" y="+this.y);

    }

    public void increaseCounters(){
        //int x = 0;
        //int y = 0;
        this.x++;
        this.y++;
    }

}
