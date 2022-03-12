package com.welcome;
import java.math.BigDecimal;

public class Bank {
    private String name;
    private Employee[] employees;
    private Customer[] customers;
    private BigDecimal money;

    public Bank(String name, Employee[] employees, Customer[] customers, BigDecimal money) {
        setName(name);
        if (employees.length == 0) {
            this.customers = new Customer[1];
            this.customers[0] = new Customer("zero customer", BigDecimal.ZERO);
        }
        else {
            setEmployees(employees);
        }
        setCustomers(customers);
        setMoney(money);
    }

    @Override
    public String toString() {
        var eSB = new StringBuilder();
        for (Employee e: getEmployees())
            eSB.append(e.toString());
        return "Name: " + getName() + "\nEmployees { " + eSB + " }\nMoney: $" + getMoney() + "\n";
    }

    public String getName() { return name; }

    public Employee[] getEmployees() { return employees; }

    public Customer[] getCustomers() { return customers; }

    public BigDecimal getMoney() { return money; }

    public void setName(String name) { this.name = name; }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    public void setMoney(BigDecimal newMoney) { money = newMoney; }
}
