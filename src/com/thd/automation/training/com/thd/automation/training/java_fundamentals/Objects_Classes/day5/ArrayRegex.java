package com.thd.automation.training.com.thd.automation.training.java_fundamentals.Objects_Classes.day5;

import com.sun.tools.classfile.Synthetic_attribute;

/**
 * Created by rrolando on 11/16/16.
 */
public class ArrayRegex {
    public static void main(String[] args) {
        int[] array = {2,2};
        System.out.println(double23(array));
    }

    public static boolean double23(int[] nums) {

        if(nums.length > 1){
            String num = String.valueOf(nums[0]) + String.valueOf(nums[1]);
            if(num.matches("[2]{2}|[3]{2}")){
                return true;
            }
        }
        return false;
    }
}
