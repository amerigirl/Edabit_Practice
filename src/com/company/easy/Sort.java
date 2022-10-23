package com.company.easy;

public class Sort {
    public static int[] ascendingOrder(int[] nums){
        int tempVariable = 0;

        for(int i = 0;i <nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] > nums[j]){
                    tempVariable = nums[i];
                    nums[i] = nums[j];
                    nums[j]= tempVariable;
                }
            }
        }
    return nums;
    }
}
