package com.company.medium;

public class Sequence {

    //I didn't get this one right the first time :-(

    /*Create a function that takes a number (step) as an argument and returns the amount of boxes in that step of the sequence.
    *       Step 0: Start with 0
            Step 1: Add 3
            Step 2: Subtract 1
            Repeat Step 1 & 2 ...

    * Step (the input) is always a positive integer (or zero).
        For an odd step add 3, for an even step subtract 1.*/


    public static int[] boxSequences(int step) {
        int countSteps = step; //put step into a field of its own

        int total = 0; //total boxes?

        while (countSteps > 0) {
            if (countSteps % 2 == 0) { //if it's even
                countSteps -= 1;
                total -= 1;
            } else if (countSteps % 2 == 1) { //odd
                countSteps -= 1; //why are countsteps -1 for odd? doesn't match directions!
                total += 3;
            }
        }
        return new int[]{total};
    }
}
