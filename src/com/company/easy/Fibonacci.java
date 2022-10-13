package com.company.easy;

public class Fibonacci {

    public static int fibFormula(int randomNumber){
    /*Create a function that, given a number, returns the corresponding value of that index in the Fibonacci series.
    --> basic fib logic:  0 1 1 2 3 5 8
    1. create the class and method call
    2. base case for recursion
    3. create a loop
        f(n) = f(n-1) + f(n-2) */


        //base case for recursion to stop infinite loop
        if (randomNumber <= 0){
            return randomNumber;
        }

        long fibonacciCache;

        return (fibFormula(randomNumber -1) + (randomNumber - 2));

    }
}
//public class Challenge {
//  public static int Fibonacci(int a) {
//		/*Create a function that, given a number, returns the corresponding value
//		 of that index in the Fibonacci series.
//		0 1 1 2 3 5 8
//		 1. create the class and method call
//		 2. base case for recursion
//		 3. create a loop
//		 f(n) = f(n-1) + f(n-2)
//	*/
//
//			int firstNumber = 0;
//			int secondNumber = 1;
//
//		while(a <= 0){
//				return 1;
//	}
//	int[]	fibonacciCache = new int [a + 1];
//
//			if (fibonacciCache[a] != 0 ){
//				return fibonacciCache[a];
//		}
//		int nthFibonacciNumber = 0;
//		for (int i = 0; i < a; i++){
//			 nthFibonacciNumber = (firstNumber + secondNumber);
//			 firstNumber = secondNumber;
//			 secondNumber = nthFibonacciNumber;
//			fibonacciCache[a] = nthFibonacciNumber;
//		}
//
//			return nthFibonacciNumber;
//	}
//}