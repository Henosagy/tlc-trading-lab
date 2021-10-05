package com.company;

public class FundTrade extends Trade{
    private final double dividend;

    public FundTrade(String id, String symbol, int quantity, double price, double percent) {
        super(id, symbol, quantity, price);
        this.dividend = percentage(percent);
    }

    public double percentage(double percent){
        return percent * super.getPrice();
    }

    @Override
    public double calcDividend() {
        return this.dividend;
    }
}
