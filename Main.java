package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {

    public static void main(String[] args) throws TradeIDException {
        Trade apple = new BondTrade("1", "APPL", 200, 15.25, 0.25);
        Trade microsoft = new FundTrade("2", "MST", 100, 5.25, 1.25);
        Trade tesla = new BondTrade("2", "TSL", 200, 67.67, 1.67);
        Client ebuka = new Client("Chukwuebuka", "Nwokafor");
        Client prince = new Client("Prince", "Karikari");
        Trader dzifa = new Trader("dzifa");

        ebuka.addTrade(apple);
        prince.addTrade(microsoft);
        dzifa.addTrade(apple);
        dzifa.addTrade(microsoft);

        System.out.println(dzifa.getTotalTradeValue());

    }

}