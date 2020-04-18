package com.anna.Lab5;

import com.anna.Lab5.employee.Employee;
import com.anna.Lab5.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lab5Application {

	public static void main(String[] args) { SpringApplication.run(Lab5Application.class, args); }

	@Bean
	public CommandLineRunner liner (EmployeeRepository employeeRepository){
		return (args) -> {
			//create employee
			employeeRepository.save(new Employee("Elena", 80000.0, 1000.0, 12, (float) 10.000, Employee.EmployeeType.COMMISION));
			employeeRepository.save(new Employee("Annnnna", 70000.0, 1000.0, 10, (float) 10.000, Employee.EmployeeType.SALARIED));
			employeeRepository.save(new Employee("Vika", 90000.0, 1500.0, 14, (float) 20.000, Employee.EmployeeType.HOURLY));

		//fetch all employees
			System.out.println("Employee found with findAll(): ");
            for(Employee employee: employeeRepository.findAll()){
            	System.out.println(employee.getName());
			}
			System.out.println();

			//fetch employee by id
			Employee employee = employeeRepository.findById(1L).get();
			System.out.println("Employee found with findById(1L): ");
			System.out.println(employee.getName());
			System.out.println();

			//update employee name
			Employee employeeUpdate = employeeRepository.findById(2L).get();
			employeeUpdate.setName("Anna");
			employeeRepository.save(employeeUpdate);
			System.out.println("Update employee name: ");
			System.out.println(employeeUpdate.getName());
			System.out.println();

			//total employees in DataBase
			System.out.println("Total employee in DataBase: ");
			System.out.println(employeeRepository.count());
            System.out.println();

		};
   }
}
