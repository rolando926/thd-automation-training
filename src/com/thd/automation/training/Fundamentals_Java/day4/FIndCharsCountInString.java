package com.thd.automation.training.Fundamentals_Java.day4;

/**
 * Created by rrolando on 10/27/16.
 */
public class FIndCharsCountInString {
    public static void main(String[] args){
        String str = "ABCdSJDKJDYTD";
        int counter = 0;

        for (int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'D' || str.charAt(i) == 'd'){
                counter++;
            }
        }

        System.out.println("Number of D letters are: "+counter);
    }
}
