package com.thd.automation.week2.day1;

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
        System.out.println("x="+this.x+" y="+this.y);
        increaseCounters();
    }

    public void increaseCounters(){
        x++;
        y++;
    }

}
