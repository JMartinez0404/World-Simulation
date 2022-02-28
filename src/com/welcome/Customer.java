package com.welcome;

public class Customer {
    public enum CustomerType { NORMAL, RICH, UNKNOWN};
    private String name;
    private double money;
    private CustomerType type;

    public Customer(String name, double money) {
        this(name, money, CustomerType.UNKNOWN);
    }

    public Customer(String name, CustomerType type) {
        this(name, 0, type);
    }

    public Customer(String name, double money, CustomerType type) {
        setName(name);
        setMoney(money);
        setType(type);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nMoney: " + getMoney() + "\nCustomer Type: " + getType() + "\n";
    }

    public String getName() {
        return name;
    }

    public double getMoney() {
        return money;
    }

    public CustomerType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
