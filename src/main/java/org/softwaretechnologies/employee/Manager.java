package org.softwaretechnologies.employee;

public class Manager extends Employee{
    protected Manager(String name, int baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public int getMonthSalary(int month) {
        return (month%2)==1?baseSalary/2:baseSalary;
    }
}
