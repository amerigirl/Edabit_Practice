package com.company;

import java.util.Arrays;

import static com.company.Multiples.arrayOfMultiples;
import static com.company.Sequence.boxSequences;
import static com.company.TriangleWork.sideLengths;

public class Main {

    public static void main(String[] args) {
        //call to arrayofMultiples method
        System.out.println("Array Multiples: " + Arrays.toString(arrayOfMultiples(4, 3))); //in order to print the call---wrap in Arrays.toString


        //call to TriangleWork method
        System.out.println("Triangle Work (30-60-90): " + Arrays.toString(sideLengths(8)));

        //call to Sequence method


        System.out.println("Box sequence: " + Arrays.toString(boxSequences(7)));

    }

}
