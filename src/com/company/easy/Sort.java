package com.company.easy;

public class Sort {
    public static int[] ascendingOrder(int[] nums){

       /*Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

        If the function's argument is null, an empty array, or undefined, return an empty array. Return a new array of sorted numbers.
       * */


        int tempVariable = 0; //this will hold nums[i]

        for(int i = 0;i <nums.length; i++) { //get the length

            for (int j = i + 1; j < nums.length; j++){ //get the length again to compare numbers

                if (nums[i] > nums[j]){ //the conditional to check which number is larger or smaller
                    tempVariable = nums[i];
                    nums[i] = nums[j];
                    nums[j]= tempVariable;
                }
            }
        }
    return nums;
    }
}
