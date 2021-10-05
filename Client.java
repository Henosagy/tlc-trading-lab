package com.company;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String firstName;
    private String lastName;
    private int points;
    private MembershipType membershipType = null;
    private final List<Trade> clientTrades;

    public Client(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
        this.clientTrades = new ArrayList<>();
        this.points = 0;
    }

    public void addTrade(Trade trade1){
        clientTrades.add(trade1);
        points++;
        setMembershipType();
    }

    public boolean canTrade(){
        return true;
    }

    public void setMembershipType(){
        if(points >= 1 && points <= 9){
            this.membershipType = new Bronze();
        }
        else if(points >= 10 && points <= 19 ){
            this.membershipType = new Silver();
        }
        else{
            this.membershipType = new Gold();
        }
    }

}
