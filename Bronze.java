package com.company;

public class Bronze extends MembershipType{

    Bronze(){
        super(5);
    }

    @Override
    public String getMembership() {
        return "Bronze";
    }

}
