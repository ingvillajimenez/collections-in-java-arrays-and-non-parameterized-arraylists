package com.skillsoft.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        ArrayList arrayList = new ArrayList(); // Raw ArrayList
//        List arrayList = new ArrayList(); // isEmpty(), add(), size(), remove(), contains() are part of the List interface
//        Collection arrayList = new ArrayList(); // isEmpty(), add(), size(), remove(), contains() are part of the Collection interface
        Iterable arrayList = new ArrayList(); // isEmpty(), add(), size(), remove(), contains() are not part of the Iterable interface

        System.out.println("ArrayList initial contents: " + arrayList);
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println();

        System.out.println("***********Adding elements");

        arrayList.add("EUR");
        arrayList.add("USD");
        arrayList.add("GBP");
        arrayList.add("JPY");
        arrayList.add("INR");

        System.out.println("ArrayList contents: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println("***********Removing elements");

        arrayList.remove("EUR");
        arrayList.remove("GBP");

        System.out.println("ArrayList contents: " + arrayList);
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("ArrayList isEmpty(): " + arrayList.isEmpty());

        System.out.println();

        System.out.println("***********Checking for elements");

        System.out.println("ArrayList contains USD: " + arrayList.contains("USD"));
        System.out.println("ArrayList contains EUR: " + arrayList.contains("EUR"));
        System.out.println("ArrayList contains JPY: " + arrayList.contains("JPY"));

        System.out.println("ArrayList size: " + arrayList.size());

        System.out.println();

//        ArrayList arrayList = new ArrayList();

//        System.out.println("ArrayList class: " + arrayList.getClass());
//
//        System.out.println();
//
//        System.out.println("ArrayList instanceof List: "
//                + (arrayList instanceof List));
//        System.out.println("ArrayList instanceof Collection: "
//                + (arrayList instanceof Collection));
//        System.out.println("ArrayList instanceof Iterable: "
//                + (arrayList instanceof Iterable));

    }
}

// Java Collections Framework
// Classes and interfaces that implement commonly reusable data structures

// Array
// Collection of objects, where the type and number of objects are specified upfront

// List
// Ordered collection of objects

// ArrayList
// Specific implementation of a list where arrays are used to stored elements

// Interface Hierarchy
// Iterable -> Collection -> List

// ArrayList Documentation
// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html