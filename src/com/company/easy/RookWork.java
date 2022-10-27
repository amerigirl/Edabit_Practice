package com.company.easy;

public class RookWork {
    public static boolean canCapture(String [] rooks) {
        /*Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples
canCapture(["A8", "E8"]) ➞ true
canCapture(["A1", "B2"]) ➞ false
canCapture(["H4", "H3"]) ➞ true
canCapture(["F5", "C8"]) ➞ false

Two rooks can attack each other if they share the same row (letter) or column (number).
        * */


    for (int i = 0; i < rooks.length; i++){
        if (rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1) ) {
            return true;
        }
    }
    return false;
    }
}
