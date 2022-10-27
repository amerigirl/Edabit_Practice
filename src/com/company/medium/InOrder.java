package com.company.medium;

import java.util.Arrays;

public class InOrder {
    public static boolean isInOrder(String randoString) {

        /*Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.
    1. create the class and method call
    2. create a 4loop
        conditional
    3. return true or false; */

        char[] stringToArray = randoString.toCharArray();
        Arrays.sort(stringToArray);

        for (int i = 0; i < stringToArray.length; i++) {
            if (stringToArray[i] != randoString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
