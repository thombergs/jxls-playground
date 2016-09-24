package org.wickedsource.jxls;

import java.math.BigInteger;

public class Employee {

    private String name;

    private BigInteger salary;

    private BigInteger bonus;

    public Employee(String name, BigInteger salary, BigInteger bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
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

    public BigInteger getBonus() {
        return bonus;
    }

    public void setBonus(BigInteger bonus) {
        this.bonus = bonus;
    }
}
