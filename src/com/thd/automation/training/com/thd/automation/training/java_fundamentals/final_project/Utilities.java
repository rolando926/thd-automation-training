package com.thd.automation.training.com.thd.automation.training.java_fundamentals.final_project;

import java.util.ArrayList;

/**
 * Created by rrolando on 11/24/16.
 */
public class Utilities {

    Utilities(){

    }

    public int generateRandomNumber(int limit){
        int number;

        do{
            number = (int) (Math.random() * limit);
        }while(number == 0 );

        return number;
    }

    public void printArrayList(ArrayList<String> arrayList){
        for (String value:arrayList
             ) {
            System.out.println(value);
        }
    }

}
