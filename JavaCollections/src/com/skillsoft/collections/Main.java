package com.skillsoft.collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        int[] intArray = new int[4];

        intArray[0] = 10;
        intArray[1] = 20;

        System.out.println("Array of integers: " + intArray);
        System.out.println("getClass() representation: " + intArray.getClass());
        System.out.println("toString() representation: " + intArray.toString());

        System.out.println();

        System.out.println("toString() representation: " + Arrays.toString(intArray));
        System.out.println();

        float[] floatArray = new float[6];

        floatArray[0] = 10.5f;
        floatArray[3] = 20.5f;

        System.out.println("Array of float: " + floatArray);
        System.out.println("toString() representation: " + floatArray.toString());
        System.out.println("getClass() representation: " + floatArray.getClass());

        System.out.println();

        System.out.println("toString() representation: " + Arrays.toString(floatArray));
        System.out.println();

        String[] stringArray = new String[7];

        stringArray[1] = "Good";
        stringArray[2] = "Morning";

        System.out.println("Array of strings: " + stringArray);
        System.out.println("toString() representation: " + stringArray.toString());
        System.out.println("getClass() representation: " + stringArray.getClass());

        System.out.println();

        System.out.println("toString() representation: " + Arrays.toString(stringArray));
        System.out.println();
    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront