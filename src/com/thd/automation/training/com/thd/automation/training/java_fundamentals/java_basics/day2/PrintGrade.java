package com.thd.automation.training.com.thd.automation.training.java_fundamentals.java_basics.day2;

/**
 * Created by rrolando on 10/25/16.
 */
public class PrintGrade {
    public static void main(String[] args){
        byte test_score;

        test_score = 70;

        if (test_score >= 90){
            System.out.println("Grade is A.");
        }
        else if (test_score >=80 && test_score < 90){
            System.out.println("Grade is B.");
        }
        else if (test_score >=70 && test_score < 80){
            System.out.println("Grade is C.");
        }
        else if (test_score >=60 && test_score < 70){
            System.out.println("Grade is D.");
        }
        else{
            System.out.println("Grade is F.");
        }
    }
}
