package com.company.easy;

public class IsEqual {
    public static boolean isHigherOrEqual(int[] randomArray, int n) {
        /*Write a function that returns true if there exists at least one number that is larger than or equal to n.
    1. create the class and method call
    2. create a 4loop
        return true if one number is equal to or larger than n
    3. return false */

        randomArray = new int[]{3, 4, 8, 10, 17, 25};

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] >= n) {
                return true;
            }
        }
        return false;
    }
}
