package com.bridgelabz;

import java.util.Arrays;

/**
 * Purpose - To find maximum value using Generics
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-17
 */
public class FindMaxValue<E extends Comparable<E>> {
    E[] myArray;

    public FindMaxValue(E[] myArray) {
        this.myArray = myArray;
    }

    /**
     * This method is used to compare the three  type of values and
     * get the maximum values by using Generics and
     * printing the output
     */
    public static <E extends Comparable<E>> void testMaximum(E[] myArray) {
        Arrays.sort(myArray);
        int range = myArray.length;
        E max = myArray[range - 1];
        System.out.printf("Maximum Value is : %s\n", max);
    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Program To Find Maximum Value Using Generics");
        Integer[] x1 = {10, 20, 30, 40, 50, 60};
        testMaximum(x1);
        Float[] f1 = {50.02f, 6.3f, 20.36f, 51.9f, 52.36f, 52.89f};
        testMaximum(f1);
        String[] s1 = {"Mango", "Orange", "Pineapple", "Cherry", "Guava", "Water Melon"};
        testMaximum(s1);
    }
}
