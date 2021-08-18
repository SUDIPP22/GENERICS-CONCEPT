package com.bridgelabz;

/**
 * Purpose - To find maximum value using Generics
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-17
 */
public class FindMaxValue <E extends Comparable<E>> {
    E a, b, c;

    public FindMaxValue(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * This method is used to compare the three  type of values and
     * get the maximum values by using Generics
     * @param a This is the first parameter
     * @param b This is the second parameter
     * @param c This is the third parameter
     * @return maximum of three parameters
     */
    public static <E extends Comparable<E>> E testMaximum(E a, E b, E c) {
        E max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To The Program To Find Maximum Value Using Generics");
        Integer x1 = 50, x2 = 60, x3 = 20;
        System.out.println("The Maximum Integer Value is : " + testMaximum(x1, x2, x3));
        Float f1 = 50.02f, f2 = 6.3f, f3 = 20.36f;
        System.out.println("The Maximum Float Value is : " + testMaximum(f1, f2, f3));
        String s1 = "Mango", s2 = "Orange", s3 = "Pineapple";
        System.out.println("The Maximum String Value is : " + testMaximum(s1, s2, s3));
    }
}
