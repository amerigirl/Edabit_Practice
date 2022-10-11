package com.company;

public class XO {
    /* Create a function that takes a string, checks if it has the same number of x's and o's and returns either true or false.

Rules
Return a boolean value (true or false).
Return true if the amount of x's and o's are the same.
Return false if they aren't the same amount.
The string can contain any character.
When "x" and "o" are not in the string, return true.
     */

    public static boolean xoCount(String randomString){

        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < randomString.length(); i++){
            if (randomString.charAt(i) == 'o' || randomString.charAt(i) == 'O'){
                oCount++;
            }
            if (randomString.charAt(i) == 'x' || randomString.charAt(i) == 'X') {
                xCount++;
            }

            if(xCount == oCount) {
                return true;
            }
        }
        return false;
    }
}
