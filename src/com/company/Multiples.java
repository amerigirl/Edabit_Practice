package com.company;

public class Multiples {
    public static int[] arrayOfMultiples(int num, int length) {

        /* Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.

			 1. create the class and method
			 2. create a for loop
			 			create a field newArray
			 			num * (i+1);
		*/

        int[] newArray = new int [length];

        for (int i = 0; i < length; i++){
            newArray[i] = num * (i+1);

        }
        return newArray;
    }

    public Multiples() {
    }
}
