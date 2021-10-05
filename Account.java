package com.company;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Trade> trades = new ArrayList<>();

    public Account() {

    }

    public void setTrade(Trade trade) throws TradeIDException {
        boolean idExists = false;
        for (Trade oldTrade : trades) {
            if (oldTrade.getId().equals(trade.getId())) {
                idExists = true;
                break;
            }
        }
        if (idExists) {
            throw new TradeIDException("Trade ID is the same");
        }

        trades.add(trade);
    }

    public double getTotalValue() {
        double total = 0;
        for (Trade trade : trades) {
            total += trade.getPrice() * trade.getQuantity();
        }
        return total;
    }
}
    /*private double totalValue;

    Account() {
        totalValue = 0;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double value) {
        this.totalValue = value;
    }*/

