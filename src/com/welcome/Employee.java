package com.welcome;

public class Employee {
    public enum Jobs { PLEB, GRUNT, WORKER, MANAGER, CEO, JOBLESS};
    private String name;
    private double salary;
    private Jobs job;

    public Employee(String name, Jobs job) {
        setName(name);
        setJob(job);
        switch (job) {
            case JOBLESS -> setSalary(0);
            case PLEB -> setSalary(30000);
            case GRUNT -> setSalary(40000);
            case WORKER -> setSalary(50000);
            case MANAGER -> setSalary(80000);
            case CEO -> setSalary(150000);
        }
    }

    public Employee(String name, Jobs job, double salary) {
        setName(name);
        setJob(job);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Job: " + getJob() + ", Salary: $" + getSalary() + " | ";
    }

    public String getName() { return name; }

    public double getSalary() { return salary; }

    public Jobs getJob() { return job; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            //throw warning here
            System.out.println("WARNING: salary should be greater than or equal to 0.");
            this.salary = 0;
        }
        else {
            this.salary = salary;
        }
    }

    public void setJob(Jobs job) { this.job = job; }
}
