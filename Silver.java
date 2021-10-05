package com.company;

import java.util.List;

public class Silver extends MembershipType{

    Silver(){
        super(10);
    }

    @Override
    public String getMembership() {
        return "Silver";
    }


}
