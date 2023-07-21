package com.skillsoft.collections;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Object[] mixedArray = {"Amazon", 100.0f, 23, true};

        System.out.println("Array contents: " + Arrays.toString(mixedArray));

        System.out.println();

        for (Object element: mixedArray) {
            System.out.format("element class: %s", element.getClass());
            System.out.println();

            System.out.format("element: %s", element);
            System.out.println();
        }

        System.out.println();

        String[] companies = {"Amazon", "Google", "Microsoft", "Facebook"};

        System.out.println("Array contents: " + Arrays.toString(companies));

        System.out.println();
        System.out.println("**** Specifying indexes manually");

        for (int i = 0; i < 4; i++) {
            System.out.format("companies[%d]: %s", i, companies[i]);
            System.out.println();
        }

        System.out.println();

//        System.out.println("**** Off-by-one error while specifying indexes manually");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.format("companies[%d]: %s", i, companies[i]); // java.lang.ArrayIndexOutOfBoundsException
//            System.out.println();
//        }
//
//        System.out.println();

        System.out.println("**** Use array length instead of specifying indexes manually");

        for (int i = 0; i < companies.length; i++) {
            System.out.format("companies[%d]: %s", i, companies[i]);
            System.out.println();
        }

        System.out.println();

        System.out.println("**** Even better, use a for-each loop to iterate over arrays");

        for (String company: companies) {
            System.out.format("company %s", company);
            System.out.println();
        }

        System.out.println();

    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront