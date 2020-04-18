package com.anna.Lab5.repository;

import com.anna.Lab5.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
