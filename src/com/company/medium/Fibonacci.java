package com.company.medium;

public class Fibonacci {

           public static int fibonacciFormula(int a) {
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



