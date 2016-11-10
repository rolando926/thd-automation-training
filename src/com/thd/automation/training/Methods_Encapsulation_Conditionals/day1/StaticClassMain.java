package com.thd.automation.training.Methods_Encapsulation_Conditionals.day1;

/**
 * Created by rrolando on 11/1/16.
 */
public class StaticClassMain {

    public static void main(String[] args) {
        StaticClass sClass1 = new StaticClass();
        System.out.println(sClass1.y);
        StaticClass sClass2 = new StaticClass();
        System.out.println(sClass1.y);
        StaticClass sClass3 = new StaticClass();
        System.out.println(sClass1.y);

        //System.out.println("I can extract the value of X directly: "+sClass1.x);
    }
}
