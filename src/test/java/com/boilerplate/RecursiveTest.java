package com.boilerplate;

import org.junit.jupiter.api.Test;

public class RecursiveTest {

    @Test
    void testSumPlusOne() {
        assert(RecursiveFunctions.fullSum(3) == 6);
        assert(RecursiveFunctions.fullSum(10) == (10+9+8+7+6+5+4+3+2+1));
        assert(RecursiveFunctions.fullSum(8) == (8+7+6+5+4+3+2+1));
    }

    @Test
    void testPower() {
        assert(RecursiveFunctions.power(2,3) == 8);
        assert(RecursiveFunctions.power(2,10) == 1024);
        assert(RecursiveFunctions.power(10,3) == 1000);
        assert(RecursiveFunctions.power(8,4) == (8*8*8*8));
        assert(RecursiveFunctions.power(1230,0) == 1);
    }

    @Test
    void testFibonacci() {
        assert(RecursiveFunctions.fibonacci(0) == 0);
        assert(RecursiveFunctions.fibonacci(1) == 1);
        assert(RecursiveFunctions.fibonacci(2) == 1);
        assert(RecursiveFunctions.fibonacci(3) == 2);
        assert(RecursiveFunctions.fibonacci(4) == 3);
        assert(RecursiveFunctions.fibonacci(5) == 5);
        assert(RecursiveFunctions.fibonacci(6) == 8);
        assert(RecursiveFunctions.fibonacci(7) == 13);
    }

    @Test
    void isPalindrome() {
        assert(RecursiveFunctions.isPalindrome("racecar"));
        assert(!RecursiveFunctions.isPalindrome("java"));
        assert(RecursiveFunctions.isPalindrome("madam"));
        assert(RecursiveFunctions.isPalindrome("step on no pets"));
    }

    @Test
    void toBinary() {
        assert(RecursiveFunctions.toBinary(8) == 1000);
        assert(RecursiveFunctions.toBinary(9) == 1001);
        assert(RecursiveFunctions.toBinary(10) == 1010);
    }

}
