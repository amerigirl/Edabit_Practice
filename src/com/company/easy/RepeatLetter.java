package com.company.easy;

public class RepeatLetter {

    public static String repeat(String str, int n) {
		/*
		  Create a function that repeats each character in a string n times.
						ex: repeat("mice", 5) ➞ "mmmmmiiiiiccccceeeee"
			  then repeat each char??
			 1. create the class and method call
			 2. split the string into characters--string split ""

			 mice
			 return string (created above)
		*/
        String repeatedArray = "";

        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < n; j++){
                repeatedArray += str.charAt(i);

            }
        }
        return repeatedArray;
    }
}

