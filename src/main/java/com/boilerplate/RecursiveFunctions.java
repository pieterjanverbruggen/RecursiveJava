package com.boilerplate;

public class RecursiveFunctions {

    public static int fullSum(int base) {
        if (base == 1) {
            return 1;
        }
        else return base + fullSum(base-1);
    }

    public static Integer power(int base, int exp) {
        if (exp == 0) return 1;
        else return base * power(base, exp-1);
    }

    public static int fibonacci(int a) {
        if (a == 0) return 0;
        if (a == 1) return 1;
        if (a == 2) return 1;
        if (a == 3) return 2;
        else {
            return (fibonacci(a-1) + fibonacci(a-2));
        }
    }

    public static boolean isPalindrome(String string) {
        if (string.length() < 2) return true;
        else {
            if (string.charAt(0) == string.charAt(string.length()-1)) {
                String middle = string.substring(1, string.length()-1);
                return isPalindrome(middle);
            } else return false;
        }
    }

    public static int toBinary(int decimal) {
        if (decimal == 0) return 0;
        if (decimal == 1) return 1;
        return decimal % 2 + 10 * (toBinary(decimal / 2));
    }

}
