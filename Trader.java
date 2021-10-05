package com.company;

public class Trader {
    private String name;
    private Account account;

    public Trader(String name) {
        this.name = name;
        this.account = new Account();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void addTrade(Trade trade) throws TradeIDException {
        this.account.setTrade(trade);
    }

    public double getTotalTradeValue(){
        return this.account.getTotalValue();
    }


}