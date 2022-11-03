package com.company.medium;

public class Fibonacci {

           public static int fibonacciFormula(int randomNumber) {
/*  Create a function that, given randomNumber number, returns the corresponding value of that index in the Fibonacci series.

The Fibonacci Sequence is the series of numbers:

    0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...basically, the first two numbers are added together and then each subsequent number is the combination of the two previous numbers.*/

            int firstNumber = 1;
            int secondNumber = 1;

            for (int i = 0; i < randomNumber - 1; i++){
                int tempNumber = secondNumber;

                secondNumber = firstNumber + secondNumber;
                firstNumber = tempNumber;
            }

            if (randomNumber > 1){
                return secondNumber;
            } else {
                return 1;
            }
        }
    }



