//package com.company;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TradeTest {
//
//    Trade t1 = new Trade("T1", "APPL", 100, 15.25);
//
//    @Test
//    @DisplayName("Exception For Negative numbers")
//    void setPriceUsingException() {
//        assertThrows(IllegalArgumentException.class, ()->t1.setPrice(t1.getPrice()));
//    }
//
//    @Test
//    @DisplayName("Testing for Negative numbers")
//    void setPriceTrueOrFalse() {
//        assertTrue(t1.getPrice()>0);
//    }
//
//    @Test
//    @DisplayName("Run all Tests")
//    void groupedTests() {
//        assertAll("Price checking",
//                () -> assertThrows(IllegalArgumentException.class, ()->t1.setPrice(t1.getPrice())),
//                () -> assertTrue(t1.getPrice()>0));
//    }
//}