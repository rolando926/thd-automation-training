package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Interfaces_Exceptions_Deployments.Day3;

import java.util.ArrayList;

/**
 * Created by rrolando on 11/30/16.
 */
public class LambdaMain {
    public static void main(String[] args) {

        ArrayList<String> myArray = new ArrayList<>();

        for(int i=0; i<10; i++){
            myArray.add("counter"+i);
        }

        //myArray.replaceAll((String str) -> {return str.toUpperCase();});
        myArray.replaceAll(str -> str.toUpperCase());

        for (String s: myArray) {
            System.out.println(s);
        }

    }
}
