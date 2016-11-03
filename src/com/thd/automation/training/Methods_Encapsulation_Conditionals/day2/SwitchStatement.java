package com.thd.automation.training.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/2/16.
 */
public class SwitchStatement {

    public static void main(String[] args){
        int month = 10;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This is a 31st month.");
                break;
            case 2:
                System.out.println("This is a leap month.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This is a 30st month.");
                break;
            default:
                System.out.println("Invalid month!");
        }
    }



}
