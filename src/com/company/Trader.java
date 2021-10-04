package com.company;

public class Trader {
    private String name;
    private Account traderAccount;
    private Trade newTrade;
    private double newValue;

    public Trader(String name) {
        this.name = name;
        this.traderAccount = new Account();
    }

    public void addTrade(Trade newTrade){
        newValue = newTrade.getPrice() * newTrade.getQuantity();
        traderAccount.setTotalValue(newValue);
    }

    public double getTraderAccountTotal(){
        return traderAccount.getTotalValue();
    }

}
