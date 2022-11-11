package com.company.easy;

import java.util.Arrays;

public class CanBeNested {
    public static boolean canNest(int[] firstArray, int[] secondArray){
        /*Create a function that returns true if the first array can be nested inside the second and false otherwise. firstArray can be nested inside secondArray if:

            firstArray's min is greater than secondArray's min.
            [3,5,7,8]

            firstArray's max is less than secondArray's max.
            [0,3,5,7,9]
        * */

        boolean nestable = true;

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int firstLength = firstArray.length;
        int secondLength = secondArray.length;

        for(int i = 0; i < secondArray.length; i++) {
            if((firstArray[0] > secondArray[0]) && (firstArray[firstLength - 1] < secondArray[secondLength - 1])) {
                return nestable = true;
            } else {
                return nestable = false;
            }

        }
        return nestable;
    }
}
