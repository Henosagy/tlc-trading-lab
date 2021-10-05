package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldTest {
    @Test
    void testMaxTradePerDay(){
        Gold gold = new Gold();
        assertEquals(20, gold.getMaxTradePerDay());
    }


}