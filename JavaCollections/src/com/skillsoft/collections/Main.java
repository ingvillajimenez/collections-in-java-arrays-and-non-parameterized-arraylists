package com.skillsoft.collections;

import java.util.Arrays;

public class Main {

    private static String[] stringArray = new String[5];
    private static int lastIndex = 0;

    private static void addString(String element) {
        if (lastIndex >= stringArray.length) {
            System.out.println("Cannot add element, no room in array!");

            return;
        }

        stringArray[lastIndex++] = element;
    }

    private static void deleteString(int index) {
        if (index >= stringArray.length) {
            System.out.println("Index out of bounds, cannot delete element");

            return;
        }

        stringArray[index] = null;

        int currentIndex = index;

        for (int i = currentIndex; i < stringArray.length - 1; i++) {
            stringArray[currentIndex] = stringArray[currentIndex + 1];
            currentIndex++;
        }

        lastIndex--;
    }

    public static void main(String[] args) {

        addString("Amazon");
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        System.out.println();

        addString("Skillsoft");
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        System.out.println();

        addString("SumTotal");
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        System.out.println();

        addString("Suzuki");
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        System.out.println();

        deleteString(0);
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        deleteString(1);
        System.out.println("Array contents: " + Arrays.toString(stringArray));

        addString("Optum");
        System.out.println("Array contents: " + Arrays.toString(stringArray));
    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront