package com.company.easy;

public class MatchesLastItem {
    public static boolean isEqualToLastItem(String[] mainString) {

        /*Create a function that takes an array of items and returns true if the last item matches the rest of the array concatenated together. */

        /*1. create the function and params
          2. create a param to hold string for all items
          3. create a forloop to cycle through mainstring
          4. create a conditional to check
        */

        String newString = "";

        for (int i = 0; i < mainString.length; i++) {
            newString += mainString[i];
        }

        if (newString.equals(mainString[mainString.length - 1])) {
            return true;
        }
        return false;
    }
}






