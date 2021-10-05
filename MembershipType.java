package com.company;

public abstract class MembershipType {
    private final int maxTradePerDay;

    public MembershipType(int maxTradeLimit){
        this.maxTradePerDay = maxTradeLimit;
    }

    public abstract String getMembership();
    public int getMaxTradePerDay() {
        return maxTradePerDay;
    }

}
