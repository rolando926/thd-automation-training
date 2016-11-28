package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day1;

/**
 * Created by rrolando on 11/2/16.
 */
public class PrintMethod {

    public static void main(String[] args) {
        String str1 = "My name is not of your business!";
        String str2 = "My name is of your business!";

        UtilityClass myPrintCLass = new UtilityClass();
        myPrintCLass.print("My name is Rolando.");
        myPrintCLass.print(str1,str2);

        UtilityClass myFindArea = new UtilityClass();
        double newA = myFindArea.findArea(2.2,3.4);
        myPrintCLass.print(newA);
    }



}
