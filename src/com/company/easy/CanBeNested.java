package com.company.easy;

import java.util.Arrays;

public class CanBeNested {
    /*Create a function that returns true if the first array can be nested inside the second and false otherwise. firstArray can be nested inside secondArray if:

          firstArray's min is greater than secondArray's min.
          [3,5,7,8]

          firstArray's max is less than secondArray's max.
          [0,3,5,7,9]

          step 1: create the method with the parameters
          step 2 create a boolean
          step 3. sort each array
          4. get the length of each array and put it in a param
          5. create a for loop the cycle the length of the second array
          6. create a conditional that gets the length of each array  at the proper indexes and compares them

      * */

    public static boolean canNest(int[] firstArray, int[] secondArray){
        boolean canNest = true;

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        int firstLength = firstArray.length;
        int secondLength = secondArray.length;


        for (int i = 0; i < secondArray.length; i++) {
            if ((firstArray[0] > secondArray[0]) && (firstArray[firstLength - 1] < secondArray[secondLength-1])){
        return true;
            } else {
                return false;
            }
        }
        return canNest;
    }
    }

