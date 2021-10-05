package com.company;

import org.junit.jupiter.api.Test;

public class Gold extends MembershipType{

    Gold(){
        super(20);
    }

    @Override
    public String getMembership() {
        return "Gold";
    }

}
