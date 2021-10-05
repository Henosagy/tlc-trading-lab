package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {

    FundTrade fund = new FundTrade("A", "Apple", 100, 15.25 ,0.75);

    @Test
    void calcDividend() {
        assertEquals((0.75*15.25), fund.calcDividend());
    }
}