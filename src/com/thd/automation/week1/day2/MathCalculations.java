package com.thd.automation.week1.day2;

/**
 * Created by rrolando on 10/25/16.
 */
public class MathCalculations {
    public static void main(String[] args){
        int intValue1 = 10;
        int intValue2 = 20;

        //parenthesis precedes concatenation
        System.out.println("The sum of both integers is: "+(intValue1+intValue2));

        int enumerator = 5;
        int denominator = 2;

        //When dividing the greater data type will be displayed
        System.out.println("The division of two integers return only the integer portion: "+(enumerator/denominator));

        double denominator_decimal = 2.0;
        System.out.println("The division against a double will always return a double: "+(enumerator/denominator_decimal));
    }
}
