package com.thd.automation.day5;

/**
 * Created by rrolando on 10/27/16.
 */
public class IsPalindrome {
    public static void main(String[] args){
        String str = "civic";
        int size = str.length();
        int y = size - 1;
        boolean isPalindrome = true;

        for(int i=0; i < (size/2); i++){
            if(str.charAt(i) != str.charAt(y)){
                isPalindrome = false;
                break;
            }
            y--;
        }

        if(isPalindrome) {
            System.out.println("The string: '" + str + "' is a palindrome.");
        }
        else{
            System.out.println("The string: '" + str + "' is not a palindrome.");
        }
    }
}
