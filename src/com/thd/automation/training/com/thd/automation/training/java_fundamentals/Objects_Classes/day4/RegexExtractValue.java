package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Objects_Classes.day4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rrolando on 11/10/16.
 */
public class RegexExtractValue {
    public static void main(String [] args){
        String str = "Your order number is: A1234567. Please save this number for future references.";

        if(str.matches(".*(\\D{1}\\d{7}).*")){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");

        }

        Pattern p = Pattern.compile(".*(\\D{1}\\d{7}).*");
        Matcher m = p.matcher(str);

        if(m.matches()){
            System.out.println(m.group(1));
        }
    }
}
