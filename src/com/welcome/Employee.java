package com.welcome;
import java.math.BigDecimal;

public class Employee {
    public enum Jobs { PLEB, GRUNT, WORKER, MANAGER, CEO, JOBLESS}
    private String name;
    private BigDecimal salary;
    private Jobs job;

    public Employee(String name, Jobs job) {
        setName(name);
        setJob(job);
        switch (job) {
            case JOBLESS -> setSalary(BigDecimal.ZERO);
            case PLEB -> setSalary(BigDecimal.valueOf(30000));
            case GRUNT -> setSalary(BigDecimal.valueOf(40000));
            case WORKER -> setSalary(BigDecimal.valueOf(50000));
            case MANAGER -> setSalary(BigDecimal.valueOf(80000));
            case CEO -> setSalary(BigDecimal.valueOf(150000));
        }
    }

    public Employee(String name, Jobs job, BigDecimal salary) {
        setName(name);
        setJob(job);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "\nName: \"" + getName() + "\", Job: " + getJob() + ", Salary: $" + getSalary() + " |";
    }

    public String getName() { return name; }

    public BigDecimal getSalary() { return salary; }

    public Jobs getJob() { return job; }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(BigDecimal salary) {
        if (salary.compareTo(BigDecimal.ZERO) == 0) {
            //throw warning here
            System.out.println("WARNING: salary should be greater than or equal to 0.");
            this.salary = BigDecimal.ZERO;
        }
        else {
            this.salary = salary;
        }
    }

    public void setJob(Jobs job) { this.job = job; }
}
