package com.thd.automation.training.Methods_Encapsulation_Conditionals.day4;

/**
 * Created by rrolando on 11/2/16.
 */
public class RandomStringGenerator {
    public static void main(String[] args){

        RandomString str = new RandomString(6);

        str.setLimit(5);
        System.out.println("The new random "+ str.getLimit() +" character string is: "+str.randomString());

        str.setLimit(9);
        System.out.println("The new random "+ str.getLimit() +" character string is: "+str.randomString());

        str.setLimit(10);
        System.out.println("The new random "+ str.getLimit() +" character string is: "+str.randomString());

        str.setLimit(15);
        System.out.println("The new random "+ str.getLimit() +" character string is: "+str.randomString());

    }
}


