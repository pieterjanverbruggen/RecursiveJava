package com.boilerplate;

public class RunProgram {

    public static void main(String[] args) {
        System.out.println("Start the program");
        // Create a dummy
        DummyClass dummy = new DummyClass();
        // Do a sum plus one and print
        Integer a = 3;
        Integer b = 2;
        Integer result = dummy.sumPlusOne(a,b);
        System.out.println("The result of sum plus one with parameters " + a + " and " + b + " is " + result + ".");
        System.out.println("Stop the program");
    }
}
