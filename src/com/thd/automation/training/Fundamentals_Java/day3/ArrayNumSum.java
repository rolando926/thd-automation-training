package com.thd.automation.training.Fundamentals_Java.day3;

/**
 * Created by rrolando on 10/26/16.
 */
public class ArrayNumSum {
    public static void main(String[] args){
        double[] arrNumbers = {2.5,0.4,3.3,10,8.9,7,0.4};
        double sum = 0;
        for (double number: arrNumbers
             ) {
            sum = sum + number;
        }

        System.out.println("The total sum is: "+sum);
    }
}
