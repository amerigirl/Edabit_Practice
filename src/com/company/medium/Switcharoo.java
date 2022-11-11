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
        //create a char array

        char[] stringToChar = s.toCharArray();

        //temp field to hold the new field at the index of 0
        char tempChar = stringToChar[0];

        //swap first and last characters
        stringToChar[0] = stringToChar[s.length() - 1];
        stringToChar[s.length() - 1] = tempChar;

        //instantiate a new field to hold the new char order
        String finalString = "";

        //iterate to add the new string order
        for(int i = 0; i < s.length(); i++) {
            finalString += stringToChar[i];
        }
        if (stringToChar.equals(s)) { //if the characters are the same
            return "Two's a pair";
        }

        return finalString;
    }
}
