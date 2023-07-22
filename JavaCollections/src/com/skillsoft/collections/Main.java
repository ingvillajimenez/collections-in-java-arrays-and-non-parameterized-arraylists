package com.skillsoft.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();

        System.out.println("***********Adding string elements");

        list.add("EUR");
        list.add("USD");

        for (int i = 0; i < list.size(); i++) {

            Object object = list.get(i);

            System.out.println(object.getClass());
            System.out.println(object);
        }

        System.out.println("***********Adding elements of any data type");

        // NOTE: That primitive types added to the list are converted to object types
        // This can be seen when we print the class of the objects below
        list.add(12);
        list.add(544);
        list.add(452.45);
        list.add(true);
        list.add(Calendar.getInstance().getTime());

        for (Object object: list) {

            System.out.println(object.getClass());
            System.out.println(object);
        }

        // NOTE: In order to use specific elements you need to cast the elements
        // to be of the right type
        int result = (int) list.get(2) + (int) list.get(3);

        System.out.println("Result: " + result);

        // NOTE: It is possible to get this cast wrong! There is no compile time check
        // for the type of object that you add to the list or retrieve from the list
        int oneMoreResult = (int) list.get(4) + (int) list.get(5); // java.lang.ClassCastException

        System.out.println("One more result: " + oneMoreResult);


//        Collection linkedList = new LinkedList();
//
//        System.out.println("LinkedList initial contents: " + linkedList);
//        System.out.println("LinkedList isEmpty(): " + linkedList.isEmpty());
//
//        System.out.println();
//
//        System.out.println("*************Adding elements");
//
//        linkedList.add("EUR");
//        linkedList.add("USD");
//        linkedList.add("GBP");
//        linkedList.add("JPY");
//        linkedList.add("INR");
//
//        System.out.println("LinkedList contents: " + linkedList);
//        System.out.println("LinkedList size: " + linkedList.size());
//        System.out.println("LinkedList isEmpty(): " + linkedList.isEmpty());
//
//        System.out.println();
//
//        System.out.println("*************Removing elements");
//
//        linkedList.remove("EUR");
//        linkedList.remove("GBP");
//
//        System.out.println("LinkedList contents: " + linkedList);
//        System.out.println("LinkedList size: " + linkedList.size());
//        System.out.println("LinkedList isEmpty(): " + linkedList.isEmpty());
//
//        System.out.println();
//
//        System.out.println("*************Removing elements");
//
//        System.out.println("LinkedList contains USD: " + linkedList.contains("USD"));
//        System.out.println("LinkedList contains EUR: " + linkedList.contains("EUR"));
//        System.out.println("LinkedList contains JPY: " + linkedList.contains("JPY"));
//
//        System.out.println("LinkedList size: " + linkedList.size());
//
//        System.out.println();
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

// Linked list
// Implements the list using a doubly-linked list