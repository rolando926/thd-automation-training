package com.thd.automation.training.Fundamentals_Java.day3;

/**
 * Created by rrolando on 10/26/16.
 */
public class DoWhilePrintCounter {
    public static void main(String[] args){
        int i = 10;
        do{
            System.out.println("Counter = "+i);
            i++;
        }while (i < 10);
    }
}
