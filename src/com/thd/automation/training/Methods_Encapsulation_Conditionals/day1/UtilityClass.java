package com.thd.automation.training.Methods_Encapsulation_Conditionals.day1;

/**
 * Created by rrolando on 11/2/16.
 */
public class UtilityClass {
    public void print(String text){
        System.out.println(text);
    }

    public void print(String text1, String text2){
        System.out.println(text1);
        System.out.println(text2);
    }

    public void print(double value){
        System.out.println(value);
    }

    public double findArea(double height, double length){
        double area;
        area = height * length;
        return area;
    }
}
