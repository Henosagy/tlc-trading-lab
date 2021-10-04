package com.company;

public class BondTrade extends TradeAbstract{
    private final double dividend;

    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }


    @Override
    double calcDividend() {
        return dividend;
    }
}
