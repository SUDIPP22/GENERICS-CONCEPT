package com.bridgelabz;

/**
 * Purpose - To find maximum value using Generics
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-08-17
 */
public class FindMaxValue {
    /**
     * This method is used to compare the three float type values and
     * get the maximum value
     * @param a This is the first parameter
     * @param b This is the second parameter
     * @param c This is the third parameter
     * @return maximum of three parameters
     */
    public static Float testMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome To The Program To Find Maximum Value Using Generics");
        Float a = 50.8f, b = 59.6f, c = 55.3f;
        System.out.println("The Maximum Integer Value is : " +testMaximum(a,b,c));
    }
}
