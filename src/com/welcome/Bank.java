package com.welcome;

public class Bank {
    private String name;
    private Employee[] employees;
    private Customer[] customers;
    private double money;

    public Bank(String name, Employee[] employees, Customer[] customers, double money) {
        setName(name);
        setEmployees(employees);
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

    public double getMoney() { return money; }

    public void setName(String name) { this.name = name; }

    public void setEmployees(Employee[] employees) {
        if (employees.length == 0) {
            //throw warning here
            System.out.println("WARNING: employees should be greater than or equal to 0.");
            this.employees = new Employee[0];
        }
        else {
            this.employees = employees;
        }
    }

    public void setCustomers(Customer[] customers) {
        if (customers.length == 0) {
            //throw warning here
            System.out.println("WARNING: employees array should be greater than 0.");
            this.customers = new Customer[1];
        }
        else {
            this.customers = customers;
        }
    }

    public void setMoney(double newMoney) { money = newMoney; }
}
