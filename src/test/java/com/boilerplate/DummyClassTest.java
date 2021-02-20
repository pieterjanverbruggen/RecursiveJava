package com.boilerplate;

import org.junit.jupiter.api.Test;

public class DummyClassTest {

    @Test
    void testNothing() {
        assert(true);
    }

    @Test
    void testSumPlusOne() {
        DummyClass dummy = new DummyClass();
        assert(dummy.sumPlusOne(5,4) == 10);
        assert(dummy.sumPlusOne(5,-4) == 2);
        assert(dummy.sumPlusOne(5,0) == 6);
    }

}
