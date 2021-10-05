package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayTest {
    @Test
    public void assertArrayLength() {
        int expected = 10;
        CustomArray arr = new CustomArray(expected);
        int actual = arr.arrayLength();
        assertEquals(actual, 8, "Array length is not the same as expected.");

    }

    @Test
    void validElementPosition() {
        CustomArray arr = new CustomArray(10);
        assertTrue(arr.elementAtIndex(2)==3, "Array element at this index is not the same as expected");
    }


}