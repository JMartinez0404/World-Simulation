package com.welcome;
import java.math.BigDecimal;

import java.math.RoundingMode;

public class Robber extends Customer {
    private int riskFactor;

    public Robber(String name, BigDecimal money, CustomerType type, int riskFactor) {
        super(name, money, type);
        setRiskFactor(riskFactor);
    }

    @Override
    public String toString() {
        return super.toString()+ "Risk Factor: " + getRiskFactor() + "\n";
    }

    public int getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(int riskFactor) {
        boolean set = false;

        for (int i: Support.intRange(0, 10))
            if (i == riskFactor) {
                set = true;
                break;
            }
        if (Boolean.TRUE.equals(set))
            this.riskFactor = riskFactor;
        else {
            //throw warning here
            System.out.println("WARNING: riskFactor should be within 0 - 9.");
        }
    }

    public void robBank(Bank bank) {
        BigDecimal availableMoney = bank.getMoney().divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        //only half for now...might add that banks have some cash on hand while other money is not liquid or something
        int chanceOfSuccess = getRiskFactor();

        if (Math.round(Math.random() * 10) >= (10 / chanceOfSuccess)) {
            super.setMoney(availableMoney.add(super.getMoney()));
            bank.setMoney(bank.getMoney().subtract(availableMoney));
            System.out.println("Robber was successful!!!");
        }
        else {
            System.out.println("Robber was unsuccessful :(");
        }
    }
}
