package com.company.easy;

public class TriangleWork {
    public static double[] sideLengths(int lineLength) {

        /* Given the shortest side of a 30° by 60° by 90° triangle, find out the other two sides. Return the longest side and medium-length side in that order. *Double its(the shortest side) length to find the hypotenuse. You can multiply the short side by the square root of 3 to find the long leg.

    1. create the class and method call
    2. hypotenuse = n * 2; (find first maybe, but return second)
    3. long leg = n * (square root 3); (find last but return first) */


        double hypotenuse = lineLength * 2;
        double longestLeg = lineLength * Math.sqrt(3);

        double otherSide1 = longestLeg;
        double otherSide2 = hypotenuse;

        return new double[] {otherSide2, otherSide1};
    }
}
