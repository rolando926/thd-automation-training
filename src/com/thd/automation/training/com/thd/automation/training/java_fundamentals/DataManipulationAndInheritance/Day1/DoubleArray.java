package com.thd.automation.training.com.thd.automation.training.java_fundamentals.DataManipulationAndInheritance.Day1;

/**
 * Created by rrolando on 11/15/16.
 */
public class DoubleArray {
    final static int ROW_LIMIT = 10;
    final static int COL_LIMIT = 10;

    public static void main(String[] args) {
        String[][] valueArray = new String[ROW_LIMIT][COL_LIMIT];

        //Assign counter value to double array
        for(int row = 0; row < ROW_LIMIT; row++){
            for(int col = 0; col < COL_LIMIT; col++){
                valueArray[row][col] = String.valueOf(row)+String.valueOf(col);
            }
        }

        //Print array through method call
        printArray(valueArray);
    }

    //Static Print method
    public static void printArray(String[][] array){
        for(int row = 0; row < ROW_LIMIT; row++){
            for(int col = 0; col < COL_LIMIT; col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
    }
}
