package com.company;

public abstract class TradeAbstract {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

    public TradeAbstract(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }


    public void setPrice(double price) {
        if (price > 0){
            this.price = price;
        }
        else{
            throw new IllegalArgumentException("Price cannot be a negative value");
        }
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

     abstract double calcDividend();



}
