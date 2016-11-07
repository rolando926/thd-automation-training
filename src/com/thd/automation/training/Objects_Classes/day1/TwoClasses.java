package com.thd.automation.training.Objects_Classes.day1;

/**
 * Created by rrolando on 11/7/16.
 */
public class TwoClasses {

    public static void main(String[] args) {
        TwoClassesClass MyClass1 = new TwoClassesClass();
        TwoClassesClass MyClass2 = new TwoClassesClass();

        MyClass1.setCh('c');
        MyClass1 = MyClass2;
        MyClass2.setCh('d');


        System.out.println(MyClass1.getCh());

        MyClass1.setCh('c');
        System.out.println(MyClass2.getCh());
    }
}
