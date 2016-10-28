package com.thd.automation.day5;

/**
 * Created by rrolando on 10/27/16.
 */
public class FibonacciSequence {
    public static void main(String[] args){
        int fibN;

        // Get the number from the main arguments or if not provided from the program
        if (args.length == 0){
            fibN = 10;
        }
        else{
            fibN = Integer.parseInt(args[0]);
        }

        // Declare and set array length
        int[] fib = new int[fibN+1];

        // Set first two values of Fibonacci
        if (fibN == 0) {
            fib[0] = 0;
        }
        else {
            fib[0] = 0;
            fib[1] = 1;
        }

        //Calculate other fib greater than 2
        for (int i = 2; i <= fibN; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }

        System.out.println("The "+fibN+"th fibonacci number is: " +fib[fibN]);
    }
}
