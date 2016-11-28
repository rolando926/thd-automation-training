package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Objects_Classes.day5;

/**
 * Created by rrolando on 11/12/16.
 */
public class ReplaceVowelsFromString {
    public static void main(String[] args) {
        String str = "Three eyes have I, all in a row; when the red one opens, all freeze.";

        //Instantiate Utility Class
        UtilityClass utils = new UtilityClass();

        //use the string method
        System.out.println(utils.replaceAllVowelsFromString(str));

        //use the array method
        utils.setCh('@');
        System.out.println(utils.replaceAllVowelsFromStringIntoArray(str));

        //use the REGEX method
        utils.setCh('%');
        System.out.println(utils.replaceAllVowelsFromStringREGEX(str));

    }
}
