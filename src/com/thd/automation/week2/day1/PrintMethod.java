package com.thd.automation.week2.day1;

/**
 * Created by rrolando on 11/2/16.
 */
public class PrintMethod {

    public static void main(String[] args) {
        String str1 = "My name is not of your business!";
        String str2 = "My name is of your business!";

        PrintClass myPrintCLass = new PrintClass();
        myPrintCLass.print("My name is Rolando.");
        myPrintCLass.print(str1,str2);

        FindArea myFindArea = new FindArea();
        double newA = myFindArea.findArea(2.2,3.4);
        myPrintCLass.print(newA);
        //System.out.println("Area = "+newA);
    }



}
