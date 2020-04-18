package com.anna.Lab5.event;

import com.anna.Lab5.employee.Employee;
import com.anna.Lab5.employee.Salary;
import org.springframework.context.ApplicationEvent;

public class SalaryChangeEvent extends ApplicationEvent {
    private Employee employee;
    private Salary salary;

    public SalaryChangeEvent(Object source, Employee employee, Salary salary) {
        super(source);
        this.employee=employee;
        this.salary=salary;
    }
    public Employee getEmployee(){
        return employee;
    }


}
