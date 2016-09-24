package de.nrw.it;

import java.math.BigInteger;

public class Employee {

    private String name;

    private BigInteger salary;

    public Employee(String name, BigInteger salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }
}
