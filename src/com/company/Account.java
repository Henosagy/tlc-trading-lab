package com.company;

public class Account {
    private double totalValue =0;


    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue += totalValue;
    }


}
