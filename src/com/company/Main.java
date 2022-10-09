package com.company;

import java.util.Arrays;

import static com.company.Multiples.arrayOfMultiples;

public class Main {

    public static void main(String[] args) {
        //call to arrayofMultiples method
        System.out.println(Arrays.toString(arrayOfMultiples(4, 3))); //in order to print the call---wrap in Arrays.toString
    }

}
