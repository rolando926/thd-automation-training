package com.thd.automation.training.com.thd.automation.training.java_fundamentals.java_basics.day3;

/**
 * Created by rrolando on 10/26/16.
 */
public class FIndLargestFromArray {
    public static void main(String[] args){
        double[] arrNumbers = {6,6.1,6.01,6.11,6.101};
        double largest;
        int i = 1;
        int size = arrNumbers.length;

        largest = arrNumbers[0];
        do {
            if(largest < arrNumbers[i]){
                largest = arrNumbers[i];
            }
            i++;
        }while(i < size);
        System.out.print("Largest number is: "+largest);
    }
}
