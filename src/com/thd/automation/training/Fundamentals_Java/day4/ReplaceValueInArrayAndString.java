package com.thd.automation.training.Fundamentals_Java.day4;

/**
 * Created by rrolando on 10/27/16.
 */
public class ReplaceValueInArrayAndString {
    public static void main(String[] args) {

        String str = "Three eyes have I, all in a row; when the red one opens, all freeze.";
        String newString = "";

        //Method 1: replacing character through loop.
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                newString += '*';
                continue;
            }
            newString += str.charAt(i);
        }
        System.out.println("Method 1: replacing character through loop.\n");
        System.out.println(newString+"\n");



        // Method 2: Using the String to Array method
        char[] chArray = str.toCharArray();
        int size = chArray.length;
        for (int i = 0; i < size; i++){
            if (chArray[i] == 'e' || chArray[i] == 'E'){
                chArray[i] = '*';
            }
        }

        System.out.println("Method 2: Using the String to Array method.\n");
        System.out.println(String.valueOf(chArray));



    }
}
