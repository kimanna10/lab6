package com.anna.Lab5.employee;

public class Salary {

    private int percent;
    private double coef;
    private int salary;

    public Salary(int percent, double coef, int salary) {
        this.percent = percent;
        this.coef = coef;
        this.salary = salary;
    }


    public double calculateSalary(Employee e) {
        switch (e.getEmplType()) {
            case SALARIED:
                return e.getFixedSalary();
            case HOURLY:
                if (e.getHoursWorked() > 40) {
                    return e.getHoursWorked() * e.getHourRate() + e.getHoursWorked() * e.getHourRate() * 1.5;
                }
                return e.getHoursWorked() * e.getHourRate();
            case COMMISION:
                return percent * e.getCommRate();
            case SALARIED_COMMISION:
                return e.getHoursWorked() * e.getHourRate() + percent * e.getCommRate();
        }
        return 0;
    }
}


