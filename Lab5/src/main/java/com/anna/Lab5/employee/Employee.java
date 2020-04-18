package com.anna.Lab5.employee;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double fixedSalary;
    private double hourRate;
    private int hoursWorked;
    private float commRate;

    @Enumerated(EnumType.STRING)
    private EmployeeType emplType;

    public enum EmployeeType {
        SALARIED,
        HOURLY,
        COMMISION,
        SALARIED_COMMISION
    }
    public Employee() {
    }

    public Employee(String name, double fixedSalary, double hourRate, int hoursWorked, float commRate, EmployeeType emplType) {
        this.name = name;
        this.fixedSalary = fixedSalary;
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
        this.commRate = commRate;
        this.emplType = emplType;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getCommRate() {
        return commRate;
    }

    public void setCommRate(float commRate) {
        this.commRate = commRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeType getEmplType() {
        return emplType;
    }

    public void setEmplType(EmployeeType emplType) {
        this.emplType = emplType;
    }
}
