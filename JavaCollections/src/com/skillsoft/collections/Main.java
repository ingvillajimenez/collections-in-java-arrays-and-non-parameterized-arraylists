package com.skillsoft.collections;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        String[] companies = {"Amazon", "Google", "Microsoft", "Facebook"};

        System.out.println("Array contents: " + Arrays.toString(companies));

        System.out.println();

        System.out.println("companies[0]: " + companies[0]);
        System.out.println("companies[1]: " + companies[1]);
        System.out.println("companies[2]: " + companies[2]);
        System.out.println("companies[3]: " + companies[3]);

        System.out.println();

//        System.out.println("companies[4]: " + companies[4]); // java.lang.ArrayIndexOutOfBoundsException

        System.out.println("companies[-1]: " + companies[-1]); // java.lang.ArrayIndexOutOfBoundsException

//        String[] companies = {};
//
//        String[] otherCompanies = new String[0];
//
//        System.out.println("companies.length: " + companies.length);
//        System.out.println("otherCompanies.length: " + otherCompanies.length);
//
//        companies[0] = "Skillsoft"; // java.lang.ArrayIndexOutOfBoundsException

//        otherCompanies[0] = "Skillsoft"; // java.lang.ArrayIndexOutOfBoundsException

//        String[] companies = new String[]; // java: array dimension missing
//
//        companies[0] = "Amazon";

//        int[] intArray = new int[4];
//
//        intArray[0] = 10;
//        intArray[1] = 20;
//
//        float[] floatArray = new float[6];
//        floatArray[0] = 10.5f;
//        floatArray[3] = 20.5f;
//
//        String[] stringArray = new String[7];
//        stringArray[1] = "Good";
//        stringArray[2] = "Morning";
//
//        Date[] dateArray = new Date[10];
//        dateArray[1] = Calendar.getInstance().getTime();
//        dateArray[2] = Calendar.getInstance().getTime();
//
//        System.out.println("intArray instanceof Object: " + (intArray instanceof Object));
//        System.out.println("floatArray instanceof Object: " + (floatArray instanceof Object));
//        System.out.println("stringArray instanceof Object: " + (stringArray instanceof Object));
//        System.out.println("dateArray instanceof Object: " + (dateArray instanceof Object));
//
//        System.out.println();
//
//        System.out.println("\nintArray.toString(): " + Arrays.toString(intArray));
//        System.out.println("intArray.length: " + intArray.length);
//
//        System.out.println("\nfloatArray.toString(): " + Arrays.toString(floatArray));
//        System.out.println("floatArray.length: " + floatArray.length);
//
//        System.out.println("\nstringArray.toString(): " + Arrays.toString(stringArray));
//        System.out.println("stringArray.length: " + stringArray.length);
//
//        System.out.println("\ndateArray.toString(): " + Arrays.toString(dateArray));
//        System.out.println("dateArray.length: " + dateArray.length);
//
//        System.out.println();

    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront