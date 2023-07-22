package com.skillsoft.collections;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        int[][] multidimensionalArray = new int[3][4];

//        System.out.println("**** String representation of outer array");
//        System.out.println(Arrays.toString(multidimensionalArray));

//        multidimensionalArray[0][0] = 100;
//        multidimensionalArray[1][1] = 200;
//        multidimensionalArray[2][2] = 300;
//
//        System.out.println("\n**** Iterating over elements in the outer array");
//        for (int[] intArray : multidimensionalArray) {
//            System.out.println(Arrays.toString(intArray));
//        }

//        int[][][] multidimensionalArray = new int[3][4][2];
//
//        System.out.println("\n***** Iterating over multiple dimensions");
//        for (int[][] int2dArray : multidimensionalArray) {
//            System.out.print("[");
//            for (int[] intArray : int2dArray) {
//                System.out.print(Arrays.toString(intArray));
//            }
//            System.out.println("]");
//        }

//        String[][] multidimensionalStringArray = new String[2][3];
//
//        multidimensionalStringArray[1][2] = "Harry";
//        multidimensionalStringArray[0][1] = "Ron";
//        multidimensionalStringArray[1][0] = "Hermione";

        String[][] multidimensionalStringArray = new String[3][]; // Jagged Array

//        multidimensionalStringArray[1][2] = "Harry"; // java.lang.NullPointerException

        multidimensionalStringArray[0] = new String[2];
        multidimensionalStringArray[1] = new String[3];
        multidimensionalStringArray[2] = new String[4];

        multidimensionalStringArray[0][0] = "Harry";
        multidimensionalStringArray[1][2] = "Ron";
        multidimensionalStringArray[2][3] = "Hermione";

        System.out.println("\n***** Iterating over multiple dimensions");
        for (String[] stringArray : multidimensionalStringArray) {
            System.out.println(Arrays.toString(stringArray));
        }
    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront