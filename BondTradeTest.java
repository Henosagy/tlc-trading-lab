package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    BondTrade bond = new BondTrade("A", "Apple", 100, 15.25 ,5.75);

    @Test
    void calcDividend() {
        assertEquals(5.75, bond.calcDividend());
    }
}