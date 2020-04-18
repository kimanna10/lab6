package com.anna.Lab5.event.handlers;

import com.anna.Lab5.event.SalaryChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SalaryChangeHandler implements ApplicationListener<SalaryChangeEvent> {

    @Override
    public void onApplicationEvent(SalaryChangeEvent salaryChangeEvent) {
        System.out.println(salaryChangeEvent.getEmployee().toString());
    }
}
