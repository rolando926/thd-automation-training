package com.thd.automation.training.Objects_Classes.day4;

import com.thd.automation.training.Methods_Encapsulation_Conditionals.day1.StaticClass;

/**
 * Created by rrolando on 11/10/16.
 */
public class RegexMatchValue {
    public static void main(String[] args){
        String str = "Your order number is: A1234567. Please save this number for future references.";

        // Matches only the first sentence

        // Matches only the order number
        if(str.matches(".*(\\D{1}\\d{7}).*")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");

        }
    }
}
