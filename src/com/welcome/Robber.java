package com.welcome;
import com.welcome.Customer.CustomerType;

public class Robber extends Customer {
    private int riskFactor;

    public Robber(String name, double money, CustomerType type, int riskFactor) {
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
        double availableMoney = bank.getMoney() / 2.0;
        //only half for now...might add that banks have some cash on hand while other money is not liquid or something
        int chanceOfSuccess = getRiskFactor();

        if (Math.round(Math.random() * 10) >= (10 / chanceOfSuccess)) {
            super.setMoney(availableMoney + super.getMoney());
            bank.setMoney(bank.getMoney() - availableMoney);
            System.out.println("Robber was successful!!!");
        }
        else {
            System.out.println("Robber was unsuccessful :(");
        }
    }
}
