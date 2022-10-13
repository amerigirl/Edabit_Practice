package com.company.medium;

public class Fibonacci {

    public static int fibonacciFormula(int randomNumber){
    /*Create a function that, given a number, returns the corresponding value of that index in the Fibonacci series.
    --> basic fib logic:  0 1 1 2 3 5 8
    1. create the class and method call
    2. base case for recursion
    3. create a loop
        f(n) = f(n-1) + f(n-2) */


        //base case for recursion to stop infinite loop
        while (randomNumber <= 0){
            return 1;
        }

        int[] fibonacciCache = new int[randomNumber + 1]; //because indexes start at 0, you must add 1 to the index

        int firstNumber = 0;
        int secondNumber = 1;

        while(randomNumber <= 0){
            return 1;
        }

        if (fibonacciCache[randomNumber] != 0 ){
            return fibonacciCache[randomNumber];
        }
        int nthFibonacciNumber = 0;
        for (int i = 0; i < randomNumber; i++){
            nthFibonacciNumber = (firstNumber + secondNumber);
            firstNumber = secondNumber;
            secondNumber = nthFibonacciNumber;
            fibonacciCache[randomNumber] = nthFibonacciNumber;
        }

        return nthFibonacciNumber;
    }
}
