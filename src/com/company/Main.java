package com.company;

import java.util.Arrays;

import static com.company.easy.CountPoints.footballPoints;
import static com.company.easy.EasyAdd.addition;
import static com.company.easy.RookWork.canCapture;
import static com.company.medium.Fibonacci.fibonacciFormula;
import static com.company.medium.Multiples.arrayOfMultiples;
import static com.company.medium.Sequence.boxSequences;
import static com.company.easy.TriangleWork.sideLengths;
import static com.company.medium.XO.xoCount;

public class Main {

    public static void main(String[] args) {
        //call to arrayofMultiples method
        System.out.println("Array Multiples: " + Arrays.toString(arrayOfMultiples(4, 3))); //in order to print the call---wrap in Arrays.toString


        //call to TriangleWork method
        System.out.println("Triangle Work (30-60-90): Can you find the hypotenuse and the long leg of a 30-60-90 triangle with the smallest leg input?  " + Arrays.toString(sideLengths(8)));

        //call to Sequence method
        System.out.println("Box sequence: can you determine the next set of boxes based on the steps input? " + Arrays.toString(boxSequences(7)));

        //call to EasyAdd
        System.out.println("Easy add 1: Add one to a given number" + Arrays.toString(new int[]{addition(5)})); //not sure why it needed a new int instead of just the call toString

        //call to XO
        System.out.println("XO: does the string contain the same amount of Xs and Os? " + xoCount("xeflfoeofjleoxxx/wEF"));

        //call to football points
        System.out.println("Input wins, draws, and losses to get total points: " + footballPoints(7,5,2));

        //call to Fibonacci Formula
        System.out.println("Choose a index number and we will tell you what number it is in the Fibonacci sequence! Your index points to number " + fibonacciFormula(8));

        //call to RookWork

        System.out.println("Can these two rooks attack each other? " + canCapture(new String[]{"A5","B5" }));

    }

}
