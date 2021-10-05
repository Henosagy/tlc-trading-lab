package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trade {

    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalDate date;
    private LocalTime time;

    public abstract double calcDividend();

    public Trade(String id, String symbol, int quantity, double price) {
        this(id, symbol, quantity);
        this.price = price;
    }


    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }



    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }
        else{
            //System.out.println("Price values should not be negative.");
            throw new IllegalArgumentException("Price values should not be negative");
        }

    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
