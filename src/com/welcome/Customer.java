package com.welcome;
import java.math.BigDecimal;

public class Customer {
    public enum CustomerType { NORMAL, RICH, UNKNOWN}
    private String name;
    private BigDecimal money;
    private CustomerType type;

    public Customer(String name, BigDecimal money) {
        this(name, money, CustomerType.UNKNOWN);
    }

    public Customer(String name, BigDecimal money, CustomerType type) {
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

    public BigDecimal getMoney() {
        return money;
    }

    public CustomerType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }
}
