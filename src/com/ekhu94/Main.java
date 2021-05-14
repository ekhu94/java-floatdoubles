package com.ekhu94;

public class Main {

    public static void main(String[] args) {
        // In most cases, doubles are prepared as the default,
        // use type casting of 'f' at the end for floats
	    float myFloat = 5;
        double myDouble = 5.102019412412424214272486d;

        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        System.out.println("Float Maximum Value = " + maxFloat);
        System.out.println("Float Minimum Value = " + minFloat);

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        System.out.println("Double Maximum Value = " + maxDouble);
        System.out.println("Double Minimum Value = " + minDouble);
    }
}
