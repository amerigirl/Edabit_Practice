package com.company.medium;

public class Fibonacci {

           public static int fibonacciFormula(int a) {
/*  Create a function that, given a number, returns the corresponding value of that index in the Fibonacci series.

The Fibonacci Sequence is the series of numbers:

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...*/

            int firstNumber = 1;
            int secondNumber = 1;

            for (int i = 0; i < a - 1; i++){
                int tempNumber = secondNumber;

                secondNumber = firstNumber + secondNumber;
                firstNumber = tempNumber;
            }

            if (a > 1){
                return secondNumber;
            } else {
                return 1;
            }
        }
    }



