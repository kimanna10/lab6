package com.anna.Lab5.config;

import com.anna.Lab5.employee.Employee;
//import com.anna.Lab5.employee.Salary;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.anna.Lab5.config")
public class SpringConfiguration {

//    @Bean
//    public List<Employee> EmployeeList() {
////        List<Employee> res = new ArrayList<>();
////        res.add(new Employee("salaried",new Salary(0,0,100,0)));
////        res.add(new Employee("hourly",new Salary(0,1.5,100,40)));
////        res.add(new Employee("commission",new Salary(0,0,100,0)));
////        res.add(new Employee("salaried-commission",new Salary(0,0,100,0)));
////        return res;
//    }

}
