package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Methods_Encapsulation_Conditionals.day2;

/**
 * Created by rrolando on 11/3/16.
 */
public class Get_Set_Main {
    public static void main(String[] args){
        Get_Set_Class myGetSet1 = new Get_Set_Class();
        Get_Set_Class myGetSet2 = new Get_Set_Class();

        System.out.println("myGetSet1 getX = "+myGetSet1.getX());
        myGetSet1.setX(5);
        System.out.println("myGetSet1 setX = "+myGetSet1.getX());
        myGetSet1.setX(15);
        System.out.println("myGetSet1 setX = "+myGetSet1.getX());

        System.out.println("-----------");

        System.out.println("myGetSet2 getX = "+myGetSet2.getX());
        myGetSet2.setX(7);
        System.out.println("myGetSet2 setX = "+myGetSet2.getX());
        myGetSet2.setX(9);
        System.out.println("myGetSet2 setX = "+myGetSet2.getX());

        System.out.println("-----------");
        System.out.println("myGetSet1 getX = "+myGetSet1.getX());

    }
}
