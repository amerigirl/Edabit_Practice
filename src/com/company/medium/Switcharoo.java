package com.company.medium;

public class Switcharoo {
    public static String flipEndChars(String s){
        /*Create a function that takes a string and returns a new string with its first and last characters swapped, except under two conditions:
                    If the length of the string is less than two, return "Incompatible".
                    If the first and last characters are the same, return "Two's a pair".
        * */

        if (s.length() < 2 ) {
            return "incompatible";
        }

        char[] stringToChar = s.toCharArray();
        char tempChar = stringToChar[0];
        stringToChar[0] = stringToChar[s.length() - 1];
        stringToChar[s.length() - 1] = tempChar;

        String finalString = "";
        for(int i = 0; i < s.length(); i++) {
            finalString += stringToChar[i];
        }
        if (stringToChar.equals(s)) {
            return "Two's a pair";
        }

        return finalString;
    }
}
