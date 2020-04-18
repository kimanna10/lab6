package com.anna.Lab5.dao;

import com.anna.Lab5.employee.Employee;
import com.anna.Lab5.employee.Salary;
import com.anna.Lab5.event.SalaryChangeEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDao implements ApplicationEventPublisher {

    @Override
    public void publishEvent(ApplicationEvent event) {

    }
    @Override
    public void publishEvent(Object o) {

    }
    public void changeSalary(Employee emplyee, Salary salary) {
        this.publishEvent(new SalaryChangeEvent(this, emplyee, salary));
    }
}
