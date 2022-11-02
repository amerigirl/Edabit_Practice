package com.company.easy;

public class MatchesLastItem {
    public static boolean isEqualToLastItem(String[] mainString){

        /*Create a function that takes an array of items and checks if the last item matches the rest of the array concatenated together. */

            String newString = ""; //instantiates a new empty string to hold the new value

            for (int i = 0; i< mainString.length-1; i++){ //cycles through mainString
                newString += mainString[i];  //place new separate strings in container
            }
            if(newString.equals(mainString[mainString.length-1])){
            return true;
        }
    return false;
    }


}



